/**
 * @purpose 	: Reflection design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationSingleton instanceone=EagerInitializationSingleton.getinstance();
		EagerInitializationSingleton instancetwo=null;
		try
		{
			Constructor[] constructors=EagerInitializationSingleton.class.getDeclaredConstructors();
			for(Constructor construct:constructors)
			{
				construct.setAccessible(true);
				instancetwo=(EagerInitializationSingleton)construct.newInstance();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Instance One : "+instanceone.hashCode());
		System.out.println("Instance second : "+instancetwo.hashCode());
		
	}

}
