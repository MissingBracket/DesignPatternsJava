package classes;

import interfaces.CommandExecutor;

/**
 * @author smileperience
 * Proxy Class responsible for executing system commands
 * with simple authentication capabilities 
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
	public void runCommand(String cmd) throws Exception {
		if(has_privileges){
			executor.runCommand(cmd);
		}else{
			throw new Exception("User is not allowed to run commands");
		}
		
	}

}
