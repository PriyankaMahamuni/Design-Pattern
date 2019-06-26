package com.bridgeit.DesignPattern;

public class CommandExecuterProxy implements CommandExecuter{
		private boolean isAdmin;
		private CommandExecuter executer;
		public CommandExecuterProxy(String userName,String password)
		{
			    if(("admin").equals(userName)&& ("admin").equals(password))
			    		isAdmin=true;
			    		
			    executer=new CommandExecuterImplement();
		}
		public void runCommand(String cmd) throws Exception
		{
			if(isAdmin)
			{
				executer.runCommand(cmd);
			}
			else
			{
				if(cmd.trim().startsWith("rm"))
					throw new Exception("rm command not allowed for non-admin User");
				else
					executer.runCommand(cmd);
			}
		}
}
