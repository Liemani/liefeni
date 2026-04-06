package lmi;

import java.io.PrintWriter;
import java.lang.reflect.Method;

import haven.*;

import lmi.AgentManager.Agent;
import static lmi.Api.*;
import static lmi.Constant.ExceptionType.*;

public class Command implements haven.Console.Command {
  // haven.Console.Command Requirement
  public void run(Console cons, String[] args) throws Exception {
    ObjectShadow.ui().cons.out.println("==============================");
    String commandString = null;
    try {
      if (args.length == 1) throw new LMIException(ET_COMMAND_ERROR);

      commandString = args[1];
      if (commandString.contentEquals("help"))
        throw new LMIException(ET_COMMAND_HELP);

      _invokeCommand(commandString, args);
    } catch (Exception e) {
      if (e instanceof LMIException) {
        final LMIException lmiException = (LMIException)e;
        switch (lmiException.type) {
          case ET_COMMAND_ERROR:
            _printError(ObjectShadow.ui().cons.out);
            break;
          case ET_COMMAND_HELP:
            _printHelp(ObjectShadow.ui().cons.out);
            break;
          case ET_COMMAND_MATCH:
            error("[" + (commandString != null ? commandString : "") + "]가 뭔지 모르겠어요");
            break;
          case ET_COMMAND_INITIALIZER:
            error("[" + (commandString != null ? commandString : "") + "]는 기본 생성자가 없어요");
            break;
          case ET_COMMAND_IMPLEMENT:
            error("[" + (commandString != null ? commandString : "") + "]는 실행이 불가능해요");
            break;
          default:
            Util.debugPrint(e);
            e.printStackTrace();
            break;
        }
      } else {
        Util.debugPrint(e);
        e.printStackTrace();
      }
    }
  }

  private void _invokeCommand(String commandString, String[] fullArgs) throws Exception {
    final Class<? extends Agent> c = AgentManager.getClass(commandString);

    if (c == null)
      throw new LMIException(ET_COMMAND_MATCH);
    if (!Agent.class.isAssignableFrom(c))
      throw new LMIException(ET_COMMAND_IMPLEMENT);

    final String[] args = java.util.Arrays.copyOfRange(fullArgs, 1, fullArgs.length);
    AgentManager.run(c, args);
  }

  // Help
  private static void _printError(PrintWriter writer) {
    message("  [lmi Manual]");
    error("사용법: lmi <Agent>");
    message("설  명: 에이전트를 실행합니다");
    writer.println(" ");
    AgentManager.printCommandStringList(writer);
  }

  private static void _printHelp(PrintWriter writer) {
    message("  [lmi Manual]");
    alert("사용법: lmi <Agent>");
    message("설  명: 에이전트를 실행합니다");
    writer.println(" ");
    AgentManager.printCommandStringList(writer);
  }
}
