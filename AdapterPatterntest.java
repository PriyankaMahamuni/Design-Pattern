/**
 * @purpose 	: Adapter design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 13.06.19
 */
package com.bridgeit.DesignPattern;

public class AdapterPatterntest {
	public static void main(String args[])
	{
		classAdapterTest();
		objectAdapterTest();
	}
	private static  void classAdapterTest()
	{
		SocketAdapter socket=new SocketClassImp();
		Volt v3=getVoltData(socket,3);
		Volt v12=getVoltData(socket,12);
		Volt v120=getVoltData(socket,120);
		System.out.println("v3 Volts using class mplementation : "+v3.getVolt());
		System.out.println("v12 Volts using class mplementation : "+v12.getVolt());
		System.out.println("v120 Volts using class mplementation : "+v120.getVolt());
	}
	private static void objectAdapterTest()
	{
		SocketAdapter socket=new SocketObjectImp();
		Volt v3=getVoltData(socket,3);
		Volt v12=getVoltData(socket,12);
		Volt v120=getVoltData(socket,120);
		System.out.println("v3 Volts using Object implementation : "+v3.getVolt());
		System.out.println("v12 Volts using Object implementation : "+v12.getVolt());
		System.out.println("v120 Volts using Object implementation : "+v120.getVolt());
	}
	private static Volt getVoltData(SocketAdapter adapter,int i)
	{
		switch(i)
		{
				case 3:return adapter.get3Volt();
					   
				case 12:return adapter.get12Volt();
						
				case 120:return adapter.get120Volt();
						
				default :return adapter.get120Volt();
		}
	} 
}
