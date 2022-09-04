package lmi.api;

import lmi.*;

// constant
import lmi.Constant.*;
import lmi.Constant.StatusCode;
import lmi.Constant.Action;

import static lmi.Constant.StatusCode.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.Action.Custom.*;
import static lmi.Constant.SelfAction.*;
import static lmi.Constant.Input.Mouse.*;
import static lmi.Constant.Input.Modifier.*;
import static lmi.Constant.InteractionType.*;
import static lmi.Constant.MeshId.*;
import static lmi.Constant.TimeOut.*;
import static lmi.Constant.Gauge.Index.*;
import static lmi.Constant.Gauge.HitPointIndex.*;

// resource
import static lmi.Constant.gfx.borka.*;
import static lmi.Constant.gfx.hud.curs.*;

public class Self {
    // access properties
    public static haven.Gob gob() {
        if (ObjectShadow.mapView() == null)
            return null;

        return ObjectShadow.mapView().player();
    }

    public static haven.Coord2d location() { return gob().rc; }
    public static double direction() { return gob().a; }
    public static double velocity() { return GobHandler.velocity(gob()); }
    public static haven.Skeleton.Pose pose() { return gob().getpose(); }

    public static haven.Coord locationInCoord() {
        return CoordinateHandler.convertCoord2dToCoord(Self.location());
    }

    public static double hardHitPoint() {
        return haven.LMI.gaugeWidgetGaugeArray(ObjectShadow.gaugeWidgetArray()[GI_HIT_POINT])
            .get(GI_HARD)
            .a;
    }

    public static double softHitPoint() {
        return haven.LMI.gaugeWidgetGaugeArray(ObjectShadow.gaugeWidgetArray()[GI_HIT_POINT])
            .get(GI_SOFT)
            .a;
    }

    public static double stamina() {
        return haven.LMI.gaugeWidgetGaugeArray(ObjectShadow.gaugeWidgetArray()[GI_STAMINA])
            .get(0)
            .a;
    }

    public static double energy() {
        return haven.LMI.gaugeWidgetGaugeArray(ObjectShadow.gaugeWidgetArray()[GI_ENERGY])
            .get(0)
            .a;
    }

    public static boolean hasPose(String pose) { return GobHandler.hasPose(Self.gob(), pose); }

    // move
    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_MOVE
    public static StatusCode move(haven.Coord2d point) {
        if (sendClickMessage_(point) == SC_INTERRUPTED) return SC_INTERRUPTED;
        return new MoveManager(Self.gob()).waitMove(point);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_MOVE
    public static StatusCode move(haven.Coord point) {
        if (sendClickMessage_(point) == SC_INTERRUPTED) return SC_INTERRUPTED;
        return new MoveManager(Self.gob()).waitMove(point);
    }

    // etc
    public static StatusCode moveNorthTile() {
        haven.Coord northTile = CoordinateHandler.northTile(Self.locationInCoord());
        return move(northTile);
    }

    public static StatusCode moveEastTile() {
        haven.Coord eastTile = CoordinateHandler.eastTile(Self.locationInCoord());
        return move(eastTile);
    }

    public static StatusCode moveWestTile() {
        haven.Coord westTile = CoordinateHandler.westTile(Self.locationInCoord());
        return move(westTile);
    }

    public static StatusCode moveSouthTile() {
        haven.Coord southTile = CoordinateHandler.southTile(Self.locationInCoord());
        return move(southTile);
    }

    public static double distance(haven.Gob gob) {
        return Self.location().dist(GobHandler.location(gob));
    }

    public static StatusCode moveCenter() {
        haven.Coord2d center = CoordinateHandler.tileCenter(Self.location());
        return move(center);
    }

    // carry
    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_LIFT
    public static StatusCode lift(haven.Gob gob) {
        if (sendCarryMessage_() == SC_INTERRUPTED) return SC_INTERRUPTED;
//          if (waitCursorChange_(RN_HAND) == SC_INTERRUPTED) return SC_INTERRUPTED;
        final StatusCode result = waitCursorChange_(RN_HAND);
        lmi.Util.debugPrint(Self.class, "result: " + result);
        if (result == SC_INTERRUPTED) return SC_INTERRUPTED;

        if (WidgetMessageHandler.actionClick(gob) == SC_INTERRUPTED) return SC_INTERRUPTED;
        new MoveManager(Self.gob()).waitMove();
        return waitLift_(gob);
    }

    public static StatusCode put(haven.Coord2d point) {
        if (put_(point) == SC_INTERRUPTED) return SC_INTERRUPTED;
        new MoveManager(Self.gob()).waitMove();
        return waitPut_();
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_PUT
    public static StatusCode put(haven.Coord point) {
        if (put_(point) == SC_INTERRUPTED) return SC_INTERRUPTED;
        new MoveManager(Self.gob()).waitMove();
        return waitPut_();
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode waitCursorChange_(String cursor) {
        while (true) {
            if (isCursorChanged_(cursor)) return SC_SUCCEEDED;
            switch (WaitManager.waitTimeOut(A_CHANGE_CURSOR, TO_TEMPORARY)) {
                case SC_SUCCEEDED: return SC_SUCCEEDED;
                case SC_INTERRUPTED: return SC_INTERRUPTED;
                case SC_TIME_OUT: break;
                default:
                    new Exception().printStackTrace();
                    return SC_INTERRUPTED;
            }
        }
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static boolean isCursorChanged_(String cursor) {
        return WidgetManager.cursor().get().name.endsWith(cursor);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_LIFT
    private static StatusCode waitLift_(haven.Gob gob) {
        if (isLifting_(gob)) return SC_SUCCEEDED;
        switch (WaitManager.waitTimeOut(gob, AC_DID_LIFT, TO_TEMPORARY)) {
            case SC_SUCCEEDED: return SC_SUCCEEDED;
            case SC_INTERRUPTED: return SC_INTERRUPTED;
            case SC_TIME_OUT: return isLifting_(gob) ? SC_SUCCEEDED : SC_FAILED_LIFT;
            default:
                new Exception().printStackTrace();
                return SC_INTERRUPTED;
        }
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_FAILED_PUT
    private static StatusCode waitPut_() {
        if (!isLifting_()) return SC_SUCCEEDED;
        switch (WaitManager.waitTimeOut(Self.gob(), AC_DID_PUT, TO_TEMPORARY)) {
            case SC_SUCCEEDED: return SC_SUCCEEDED;
            case SC_INTERRUPTED: return SC_INTERRUPTED;
            case SC_TIME_OUT: return !isLifting_() ? SC_SUCCEEDED : SC_FAILED_PUT;
            default:
                new Exception().printStackTrace();
                return SC_INTERRUPTED;
        }
    }

    private static boolean isLifting_() { return Self.hasPose(RN_BANZAI); }
    private static boolean isLifting_(haven.Gob gob) { return GobHandler.isGobLifting(Self.gob(), gob); }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode dig_() {
        return sendActionMessage_(A_DIG);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode mine_() {
        return sendActionMessage_(A_MINE);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode sendCarryMessage_() {
        return sendActionMessage_(A_CARRY);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode destroy_() {
        return sendActionMessage_(A_DESTROY);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode fish_() {
        return sendActionMessage_(A_FISH);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode inspect_() {
        return sendActionMessage_(A_INSPECT);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode repair_() {
        return sendActionMessage_(A_REPAIR);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode crime_() {
        return sendActionMessage_(A_CRIME);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode swim_() {
        return sendActionMessage_(A_SWIM);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode tracking_() {
        return sendActionMessage_(A_TRACKING);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode aggro_() {
        return sendActionMessage_(A_AGGRO);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode shoot_() {
        return sendActionMessage_(A_SHOOT);
    }

    // send message shadow
    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode sendClickMessage_(haven.Coord2d point) {
        return sendClickMessage_(CoordinateHandler.convertCoord2dToCoord(point));
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode sendClickMessage_(haven.Coord point) {
        return WidgetMessageHandler.sendClickMessage(
                ObjectShadow.mapView(),
                Util.mapViewCenter(),
                point,
                IM_LEFT,
                IM_NONE);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode sendActionMessage_(String action) {
        return WidgetMessageHandler.sendActionMessage(WidgetManager.menuGrid(), action);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode put_(haven.Coord2d point) {
        haven.Coord pointInCoord = CoordinateHandler.convertCoord2dToCoord(point);
        return WidgetMessageHandler.put(pointInCoord);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode put_(haven.Coord point) {
        return WidgetMessageHandler.put(point);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode sendCancelActionMessage_() {
        return WidgetMessageHandler.sendCancelActionMessage();
    }
}