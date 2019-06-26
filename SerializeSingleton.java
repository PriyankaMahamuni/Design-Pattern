/**
 * @purpose 	: Serialized design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

import java.io.Serializable;

public class SerializeSingleton implements Serializable{
	private static final long SerializeID = -956599355654654L;
	private SerializeSingleton() {}
	private static class Singleton
	{
		static final SerializeSingleton instanceOne=new SerializeSingleton();
	}
	public static SerializeSingleton getInstance()
	{
		return Singleton.instanceOne;
	}
	
}
