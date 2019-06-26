package com.bridgeit.DesignPattern;
import com.bridgeit.DesignPattern.*;
public class SocketClassImp extends Socket implements SocketAdapter {
		public Volt get120Volt()
		{
			return getVolts();
		}
		private Volt convertVolt(Volt v,int no)
		{
			return new Volt(v.getVolt()/no);
		}
		public Volt get12Volt()
		{
			Volt v=getVolts();
			return convertVolt(v, 10);
		}
		public Volt get3Volt()
		{
			Volt v=getVolts();
			return convertVolt(v, 40);
		}
						
}
