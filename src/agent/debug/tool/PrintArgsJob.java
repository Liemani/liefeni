package agent.debug.tool;

import agent.Job;

import lmi.Api;
import lmi.AgentContext;

public class PrintArgsJob extends Job {
    @Override
    public void run(AgentContext ctx, String[] args) {
        if (args.length <= 2) {
            Api.message("No arguments provided.");
            return;
        }

        Api.message("--- Received Arguments ---");
        for (int i = 2; i < args.length; i++) {
            Api.message("arg[" + (i - 2) + "]: " + args[i]);
        }
    }

    public static String info() {
        return "Prints all arguments passed to the job.\nUsage: a PrintArgs [arg1] [arg2] ...";
    }
}
