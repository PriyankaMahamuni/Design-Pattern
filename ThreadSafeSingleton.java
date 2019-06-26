/**
 * @purpose 	: Thread safe singleton pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton singletonObect;
	private ThreadSafeSingleton(){}
	public static ThreadSafeSingleton getInstance()
	{
		if(singletonObect==null)
		{
			synchronized(ThreadSafeSingleton.class)
			{
				singletonObect=new ThreadSafeSingleton();
			}
		
		}
		return singletonObect;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeSingleton obj=ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj1=ThreadSafeSingleton.getInstance();
	}

}
