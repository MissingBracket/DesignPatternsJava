package classes;

import interfaces.CommandExecutor;

/**
 * @author smileperience
 * Implementation of interface functions responsible for executing system commands
 */
public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + " Now in action");
		
	}

}
