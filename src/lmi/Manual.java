package lmi;

import java.io.PrintWriter;
import java.lang.reflect.Method;

import haven.*;

import static lmi.Api.*;
import static lmi.Constant.ExceptionType.*;

public class Manual implements Console.Command {
    // Console.Command Requirement
	public void run(Console cons, String[] args) throws Exception {
        new Thread(new MainRunnable(args)).start();
    }

    private static class MainRunnable implements Runnable {
        private String[] _args;
        private MainRunnable(String[] args) { _args = args; }

        // Runnable Requirment
        public void run() {
            ObjectShadow.ui().cons.out.println("==============================");
            String commandString = null;
            try {
                _checkArgument();

                commandString = _args[1];
                if (commandString.contentEquals("help"))
                    throw new LMIException(ET_COMMAND_HELP);

                _printManPage(commandString);
            } catch (Exception e) {
                if (e instanceof LMIException) {
                    final LMIException lmiException = (LMIException)e;
                    switch (lmiException.type()) {
                        case ET_COMMAND_ERROR:
                            _printError(ObjectShadow.ui().cons.out);
                            break;
                        case ET_COMMAND_HELP:
                            _printHelp(ObjectShadow.ui().cons.out);
                            break;
                        case ET_COMMAND_MATCH:
                            error("[" + (commandString != null ? commandString : "") + "]가 뭔지 모르겠어요");
                            break;
                        case ET_COMMAND_IMPLEMENT:
                            error("[" + (commandString != null ? commandString : "") + "]는 실행이 불가능해요");
                            break;
                        default:
                            break;
                    }
                } else {
                    Util.debugPrint(e);
                    e.printStackTrace();
                }
            }
        }

        private void _checkArgument() {
            if (_args.length != 2) throw new LMIException(ET_COMMAND_ERROR);
        }

        private void _printManPage(String commandString) throws Exception {
            final Class<?> c = AutomationManager.getClass(commandString);

            if (c == null)
                throw new LMIException(ET_COMMAND_MATCH);

            Method manMethod;
            try {
                manMethod = c.getMethod("man", (Class<?>[])null);
            } catch (NoSuchMethodException e) {
                throw new LMIException(ET_MAN_IMPLEMENT);
            }
            message("  [" + commandString + " Manual]");
            message((String)manMethod.invoke(null));

        }

        // Help
        private static void _printError(PrintWriter writer) {
            message("  [man Manual]");
            error("사용법: man <자동화 프로그램>");
            message("설  명: 자동화 프로그램에 대한 man page를 출력합니다");
            writer.println(" ");
            AutomationManager.printCommandStringList(writer);
        }

        private static void _printHelp(PrintWriter writer) {
            message("  [man Manual]");
            alert("사용법: man <자동화 프로그램>");
            message("설  명: 자동화 프로그램에 대한 man page를 출력합니다");
            writer.println(" ");
            AutomationManager.printCommandStringList(writer);
        }
    }
}
