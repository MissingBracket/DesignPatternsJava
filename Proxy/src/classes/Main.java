package classes;

import interfaces.CommandExecutor;

/**
 * @author smiley
 * Main class for executing Proxy Design pattern demonstration 
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
