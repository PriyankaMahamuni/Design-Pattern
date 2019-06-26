package com.bridgeit.DesignPattern;

import java.io.IOException;

public class CommandExecuterImplement implements CommandExecuter{
		public void runCommand(String cmd) throws IOException
		{
			Runtime.getRuntime().exec(cmd);
			System.out.println(cmd+" Command Executed !");
		}
}
