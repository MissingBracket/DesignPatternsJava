package tests;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import classes.CommandExecutorProxy;
import interfaces.CommandExecutor;

public class ProxyTests {
	
	private CommandExecutor executorAdmin;
	private CommandExecutor executorUser; 
	
	
	@Before
	public void setUp() throws Exception {
		executorAdmin = new CommandExecutorProxy("login", "password");
		executorUser = new CommandExecutorProxy("user", "notpassword");
	} 

	@Test
	public void testCommandExecutionSuccess() throws IOException {
		executorAdmin.runCommand("echo");
	}
	
	@Test(expected=IOException.class)
	public void testCommandExecutionFailure() throws IOException{
		executorUser.runCommand("echo");
	}

}
