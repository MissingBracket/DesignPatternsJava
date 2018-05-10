package classes;

import java.io.IOException;

import interfaces.CommandExecutor;

/**
 * Proxy Class responsible for executing system commands
 * with simple authentication capabilities 
 * @author smiley
 */
public class CommandExecutorProxy implements CommandExecutor{

	private boolean has_privileges = false;
	private CommandExecutor executor;
	
	/**
	 * @param login - administrator login
	 * @param password - administrator password
	 */
	public CommandExecutorProxy(String login, String password) {
		if(login.equals("login") || password.equals("password")){
			has_privileges=true;
		}
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws IOException {
		if(has_privileges){
			try {
				executor.runCommand(cmd);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			throw new IOException("User is not allowed to run commands");
		}
		
	}

}
