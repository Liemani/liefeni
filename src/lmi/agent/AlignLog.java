package lmi.agent;

import lmi.AgentManager;
import lmi.AgentContext;
import lmi.job.AlignLogJob;

public class AlignLog extends AgentManager.Agent {
  @Override
  public void run(String[] args) {
    // Context tracking can be optional. Here we use it.
    this.context = new AgentContext();
    new AlignLogJob().run(this.context, args);
  }

  public static String man() {
    return "AlignLog v0.4.0\n" +
      "Description: Organizes logs into a designated area.\n" +
      "Usage: a AlignLog [--help]\n";
  }
}
