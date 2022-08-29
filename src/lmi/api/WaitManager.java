package lmi.api;

import lmi.*;
import lmi.Constant.StatusCode;
import lmi.Constant.Command;
import lmi.Constant.TimeOut;

public class WaitManager {
    // status code shadow
    private static final StatusCode SC_SUCCEEDED = StatusCode.SUCCEEDED;
    private static final StatusCode SC_INTERRUPTED = StatusCode.INTERRUPTED;
    private static final StatusCode SC_FAILED = StatusCode.FAILED;
    private static final StatusCode SC_TIME_OUT = StatusCode.TIME_OUT;

    // property
    private static Object monitor_ = new Object();
    private static String command_ = null;
    private static Command.Custom customCommand_ = Command.Custom.NONE;

    // wait
    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_TIME_OUT
    public static StatusCode waitTimeOut(String command, long timeOut) {
        init_(command);
        return waitTimeOut_(timeOut);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_TIME_OUT
    public static StatusCode waitTimeOut(Command.Custom customCommand, long timeOut) {
        init_(customCommand);
        return waitTimeOut_(timeOut);
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    ///     - SC_TIME_OUT
    private static StatusCode waitTimeOut_(long timeOut) {
        final long startTime = System.currentTimeMillis();
        if (wait_(timeOut) == SC_INTERRUPTED) return SC_INTERRUPTED;
        final long endTime = System.currentTimeMillis();
        if (startTime + timeOut >= endTime)
            return SC_SUCCEEDED;
        else
            return SC_TIME_OUT;
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    public static StatusCode waitCommand(String command) {
        init_(command);
        return wait_();
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    public static StatusCode waitCommand(Command.Custom customCommand) {
        init_(customCommand);
        return wait_();
    }

    public static void notifyCommand(String command) {
        if (command_ == null || command == null) return;

        if (!commandEquals_(command)) return;
        notify_();
    }

    public static void notifyCommand(Command.Custom customCommand) {
        if (!commandEquals_(customCommand)) return;
        notify_();
    }

    // private methods
    private static void clear_() {
        command_ = null;
        customCommand_ = Command.Custom.NONE;
    }

    private static void init_(String command) {
        clear_();
        command_ = command;
    }

    private static void init_(Command.Custom customCommand) {
        clear_();
        customCommand_ = customCommand;
    }

    private static boolean commandEquals_(String command) {
        return command.contentEquals(command_);
    }

    private static boolean commandEquals_(Command.Custom customCommand) {
        return customCommand == customCommand_;
    }

    // wrap wait
    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode wait_(long timeOut) {
        try {
            synchronized (monitor_) {
                monitor_.wait(timeOut);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return SC_INTERRUPTED;
        }
        return SC_SUCCEEDED;
    }

    /// - Returns:
    ///     - SC_SUCCEEDED
    ///     - SC_INTERRUPTED
    private static StatusCode wait_() { return wait_(TimeOut.NONE); }

    // wrap notify
    private static void notify_() {
        synchronized (monitor_) {
            monitor_.notify();
        }
    }
}