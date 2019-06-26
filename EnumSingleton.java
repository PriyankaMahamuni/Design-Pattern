/**
 * @purpose 	: Enum Singleton Pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 10.06.19
 */

package com.bridgeit.DesignPattern;

public enum EnumSingleton {
	Instance;
	public static EnumSingleton  getInstance()
	{
		System.out.println("Object Created");
		return Instance;
	}
	public static void main(String args[])
	{
		EnumSingleton.getInstance();
		
	}
}
