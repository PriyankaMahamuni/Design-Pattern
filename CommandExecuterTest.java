/**
 * @purpose 	: Proxy design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 12.06.19
 */

package com.bridgeit.DesignPattern;

public class CommandExecuterTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandExecuter cmdObject=new CommandExecuterProxy("vcx","admin");
		try
		{
			cmdObject.runCommand("ls ltr");
			cmdObject.runCommand("rm -rf abc.pdf");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
