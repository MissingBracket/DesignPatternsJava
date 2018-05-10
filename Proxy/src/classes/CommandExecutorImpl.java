package classes;

import java.io.IOException;

import interfaces.CommandExecutor;

/**
 * Implementation of interface functions responsible for executing system commands
 * @author smiley
 */
public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws IOException  {
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + " Now in action");
		
	}

}
