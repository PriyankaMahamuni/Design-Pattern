/**
 * @purpose 	: Serialized design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

import java.io.*;
public class SerializedSingleton {
	public static void main(String args[])throws FileNotFoundException,IOException,ClassNotFoundException
	{
		SerializeSingleton instanceone=SerializeSingleton.getInstance();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("newFile.ser"));
		out.writeObject(instanceone);
		out.close();
		ObjectInput in=new ObjectInputStream(new FileInputStream("newFile.ser"));
		SerializeSingleton instancetwo=(SerializeSingleton)in.readObject();
		System.out.println("Instance One : "+instanceone.hashCode());
		System.out.println("Instance Second : "+instancetwo.hashCode());
	}
}
