/**
 * @purpose 	: Lazy initialization design Pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 10.06.19
 */

package com.bridgeit.DesignPattern;

public class lazyIntializationSingleton {
	private static lazyIntializationSingleton singletonObject;
	private lazyIntializationSingleton(){
	}
	public static lazyIntializationSingleton getInstance()
	{
		if(singletonObject==null)
		{
			singletonObject=new lazyIntializationSingleton();
			System.out.print("Instance Created");
			
		}
		return singletonObject;
	}
	public static void main(String args[])
	{
		lazyIntializationSingleton obj=lazyIntializationSingleton.getInstance();
		//second instance 
		lazyIntializationSingleton obj2=lazyIntializationSingleton.getInstance();
		
	}
}
