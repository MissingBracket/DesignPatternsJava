package classes;

import interfaces.CommandExecutor;

/**
 * Main class for executing Proxy Design pattern demonstration
 * @author smiley
 */
public class Main {

	public static void main(String[] args) {
		CommandExecutor executorAdmin = new CommandExecutorProxy("login", "password");
		CommandExecutor executorUser = new CommandExecutorProxy("user", "notpassword");
		try{
			executorAdmin.runCommand("echo");
			System.out.println("Admin ran command");
			executorUser.runCommand("echo");
			System.out.println("user ran command");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
