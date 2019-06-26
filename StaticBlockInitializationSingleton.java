/**
 * @purpose 	: static block singleton pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 12.06.19
 */

package com.bridgeit.DesignPattern;

public class StaticBlockInitializationSingleton {
	private static StaticBlockInitializationSingleton singletonObject;
	/*
	 * @purpose : creating static block to initialize object
	 */
	static
	{
		try
		{
			singletonObject=new StaticBlockInitializationSingleton();
		}
		catch(RuntimeException e)
		{
			System.out.println("Exception has occured during executing program");
		}
	}
	/*
	 * @purpose : creating private Constructor
	 */
	private StaticBlockInitializationSingleton()
	{
		System.out.println("Instance Created");
	}
	/*
	 * @purpose : creating static method that return object
	 */
	public static StaticBlockInitializationSingleton getInstance()
	{
		return singletonObject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockInitializationSingleton obj=StaticBlockInitializationSingleton.getInstance();
		StaticBlockInitializationSingleton obj1=StaticBlockInitializationSingleton.getInstance();
		StaticBlockInitializationSingleton obj2=new StaticBlockInitializationSingleton();
		obj2.getInstance();
	}

}
