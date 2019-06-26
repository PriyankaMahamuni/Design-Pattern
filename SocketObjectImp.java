package com.bridgeit.DesignPattern;
import com.bridgeit.DesignPattern.*;
public class SocketObjectImp implements SocketAdapter{
		Socket socket=new Socket();
			
			@Override
			public Volt get3Volt() {
				// TODO Auto-generated method stub
				Volt v=socket.getVolts();
				return convertVolt(v,40);
			}
			
			@Override
			public Volt get12Volt() {
				// TODO Auto-generated method stub
				Volt v=socket.getVolts();
				return convertVolt(v, 10);
			}
			
			@Override
			public Volt get120Volt() {
				// TODO Auto-generated method stub
				return socket.getVolts();
			}
		
		public Volt convertVolt(Volt v,int n)
		{
			v=socket.getVolts();
			return new Volt(v.getVolt()/n);
		}
}
