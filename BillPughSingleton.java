/**
 * @purpose 	: Bill  pugh singleton pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 10.06.19
 */

package com.bridgeit.DesignPattern;

public class BillPughSingleton {
	private BillPughSingleton(){}
	/*
	 * Purpose : creating inner static class
	 */
	private static class SigletonHelper
	{
		static final BillPughSingleton instance=new BillPughSingleton();
	}
	public static BillPughSingleton getinstance()
	{
		return SigletonHelper.instance;
	}
	public static void main(String args[])
	{
		/*
		 * @purpose :  at the time of calling getInstance method SingletonHelper class will be loaded
		 */
		BillPughSingleton obj=BillPughSingleton.getinstance();
	}
}
