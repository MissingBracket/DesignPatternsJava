package interfaces;

import java.io.IOException;

/**
 * @author smileperience
 * Interface for running system commands
 */
public interface CommandExecutor {
	/**
	 * @param cmd - system command to be executed 
	 * @throws Exception - if authentication fails or IOException if system command execution fails
	 */
	public void runCommand(String cmd) throws IOException;
}
