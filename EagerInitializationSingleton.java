/**
 * @purpose 	: EagerIniialization design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 10.06.19
 */

package com.bridgeit.DesignPattern;

public class EagerInitializationSingleton {
	  
	/*
	 * @Purpose : creating static object
	 */
	static EagerInitializationSingleton singletonOject=new EagerInitializationSingleton();
	
	/*
	 * @purpose : making private class Constructor
	 */
	private EagerInitializationSingleton()
	{
		System.out.println("Instance Created");
	}
	/*
	 * @purpose : creating static method that return object
	 */
	public static EagerInitializationSingleton getinstance()
	{
		return singletonOject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationSingleton obj=EagerInitializationSingleton.getinstance();
		/*
		 * @purpose : it will not create another object it will refer to same object
		 */
		EagerInitializationSingleton obj1=EagerInitializationSingleton.getinstance();
	}

}
