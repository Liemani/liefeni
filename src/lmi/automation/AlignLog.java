package lmi.automation;

import haven.Gob;
import haven.Coord;

import lmi.*;
import lmi.AutomationManager.Automation;
import static lmi.Api.*;
import static lmi.Constant.ExceptionType.*;
import static lmi.Constant.gfx.terobjs.trees.*;
import static lmi.Constant.BoundingBox.*;
import static lmi.Constant.TimeOut.*;

public class AlignLog extends Automation {
    private Rect _input;
    private Rect _output;

    private Coord _origin;

    private Coord _matrixSize;
    private Coord _previousMatrix;
    private Coord _currentMatrix;
    private Coord _targetPutCoord;
    private Coord _targetMoveCoord;

    private Coord _moveCoord;

    private Array<Gob> _logArrayToCarry;

    // Run
    public void run() {
        LMIException result = null;
        try {
            _willRun();
            _main();
        } catch (LMIException e) {
            result = e;
        }
        _didRun(result);
    }

    // private methods
    private void _willRun() {
        alert("정리할 통나무가 있는 곳을 선택해주세요");
        _input = getArea();

        alert("통나무를 정리해 놓을 곳을 선택해주세요");
        _output = getArea();

        _checkAreaException();
        _init();
    }

    /// - Throws:
    ///     - ET_NO_SPACE_LEFT
    private void _checkAreaException() {
        _tooSmallAreaException();
    }

    private void _tooSmallAreaException() {
        if (_output.width() < BW_OLDTRUNK || _output.height() < BH_OLDTRUNK)
            throw new LMIException(ET_NO_SPACE_LEFT);
    }

    // Initialize
    private void _init() {
        _initOrigin();
        _initMatrixSize();
        _initPreviousMatrix();
        _initMatrix();
        _initTargetPutCoord();
        _initTargetMoveCoord();
        _initMoveCoord();
    }

    private void _initOrigin() {
        _origin = Coord.of(_output.maxX(), _output.maxY())
            .assignAdd(BB_BODY.divide(2));
    }

    private void _initMatrixSize() {
        final int rowSet = BH_OLDTRUNK + BH_BODY + BH_OLDTRUNK;
        final int x = _output.width() / BW_OLDTRUNK;
        final int y = (_output.height() / rowSet) * 2
            + ((_output.height() % rowSet >= BH_OLDTRUNK) ? 1 : 0);
        _matrixSize = Coord.of(x, y);
    }

    private void _initPreviousMatrix() { _previousMatrix = new Coord(); }
    private void _initMatrix() { _currentMatrix = Coord.zero(); }

    private void _initTargetPutCoord() {
        _targetPutCoord = new Coord();
        _calculateTargetPutCoord();
    }

    private void _initTargetMoveCoord() {
        _targetMoveCoord = new Coord();
        _calculateTargetMoveCoord();
    }

    private void _initMoveCoord() { _moveCoord = Coord.of(_origin); }

    // Main
    private void _main() {
        if (_coordIsPossessed(_targetPutCoord))
            _calculateNextCoord();

        while (true) {
            try {
                _loop();
            } catch (LMIException e) {
                if (e.type() != ET_NO_WORK_TO_DO) throw e;
                alert("추가 통나무를 기다려요");
                sleep(TO_WAIT);
            }
        }
    }

    private void _loop() {
        forceMove(_origin);
        forceLift(_findLogToCarry());
        forceMove(_origin);
        while (true) {
            forceMove(_moveCoord.init(_moveCoord.x, _targetMoveCoord.y));
            while (true) {
                forceMove(_moveCoord.init(_targetMoveCoord.x, _moveCoord.y));
                try {
                    put(_targetPutCoord);
                    _calculateNextCoord();
                    break;
                } catch (LMIException e) {
                    if (e.type() != ET_PUT) throw e;
                    _calculateNextCoord();
                    if (_currentMatrix.y != _previousMatrix.y) {
                        forceMove(_moveCoord.init(_origin.x, _moveCoord.y));
                        break;
                    }
                }
            }
            if (!Self.gob().isLifting()) break;
        }
        forceMove(_moveCoord.init(_origin.x, _moveCoord.y));
        forceMove(_origin);
    }

    /// - Throws
    ///     - ET_NO_WORK_TO_DO
    private Gob _findLogToCarry() {
        _logArrayToCarry = gobArrayIn(_input)
            .compactMap(gob -> {
                    final String resourceName = gob.resourceName();
                    if (resourceName == null) {
                        Util.debugPrint("gob: " + gob);
                        Util.debugPrint("gob is virtual: " + gob.virtual);
                        Util.debugPrint("class name of gob: " + gob.getClass().getName());
                        for (haven.GAttrib attribute : gob.attributeMap().values())
                            Util.debugPrint("name of attribute" + attribute.getClass().getName());
                    }
                    return resourceName.endsWith(RN_LOG) ? gob : null;
                    });

        if (_logArrayToCarry.isEmpty())
            throw new LMIException(ET_NO_WORK_TO_DO);

        return closestGobIn(_logArrayToCarry);
    }

    /// - Throws
    ///     - ET_NO_SPACE_LEFT
    private void _calculateNextCoord() {
        while (true) {
            _calculateNextMatrix();
            _calculateTargetPutCoord();
            _calculateTargetMoveCoord();
            if (!_coordIsPossessed(_targetPutCoord)) break;
        }
    }

    /// - Throws
    ///     - ET_NO_SPACE_LEFT
    private void _calculateNextMatrix() {
        _previousMatrix.init(_currentMatrix);

        ++_currentMatrix.x;
        if (_currentMatrix.x == _matrixSize.x) {
            _currentMatrix.x = 0;
            ++_currentMatrix.y;
        }

        if (_currentMatrix.y == _matrixSize.y)
            throw new LMIException(ET_NO_SPACE_LEFT);
    }

    private void _calculateTargetPutCoord() {
        _targetPutCoord.init(_output.origin)
            .assignAdd(_currentMatrix.multiply(BB_OLDTRUNK))
            .assignAdd(BB_OLDTRUNK.divide(2))
            .assignAdd(0, ((_currentMatrix.y + 1) / 2) * BH_BODY);
    }

    private void _calculateTargetMoveCoord() {
        _targetMoveCoord.init(_targetPutCoord);
        _targetMoveCoord.y += ((BH_OLDTRUNK + BH_BODY) / 2)
            * ((_currentMatrix.y % 2 == 0) ? 1 : -1);
    }

    private boolean _coordIsPossessed(Coord coord) {
        java.util.ArrayList<Gob> gobArray = gobArray();
        for (Gob gob : gobArray) {
            if (gob.isAt(coord))
                return true;
        }
        return false;
    }

    private void _didRun(LMIException e) {
        if (e == null) {
            alert("모든 통나무를 다 정리했어요");
            return;
        }

        switch (e.type()) {
            case ET_INTERRUPTED:
                alert("작업을 중단했어요");
                break;
            case ET_NO_SPACE_LEFT:
                alert("통나무를 둘 남은 공간이 없어요");
                break;
            case ET_NO_WORK_TO_DO:
                alert("모든 통나무를 다 정리했어요");
                break;
            default:
                throw e;
        }
    }

    public static String man() {
        return
            "설  명: 널브러진 통나무들을 지정한 공간에 차곡차곡 정리합니다\n" +
            "\n" +
            "주의 사항: 캐릭터가 이동 시 외부 요인에 의해 멈추면 하려던 작업이 제대로 수행 될 때까지 재시도 합니다\n" +
            "\n" +
            "1. 통나무가 있는 공간 선택\n" +
            "2. 통나무를 쌓아 둘 공간 선택\n" +
            "3. 통나무를 정리합니다\n" +
            "4. 모든 통나무를 정리한 후에는 1분 간격으로 추가 통나무가 존재하는지 확인합니다\n" +
            "";
    }
}
