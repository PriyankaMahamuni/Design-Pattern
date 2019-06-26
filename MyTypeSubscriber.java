package com.bridgeit.DesignPattern;

public class MyTypeSubscriber implements Observer{
		private String name;
		private Subject Topic;
		MyTypeSubscriber(String name)
		{
			this.name=name;
		}
		@Override
		public void update() {
			// TODO Auto-generated method stub
			String msg=(String)Topic.getUpdate(this);
			if(msg==null)
			{
				System.out.println(name+":: No new Message");
			}
			else
			{
				System.out.println(name+":: Message Comsuming : "+msg);
			}
		}
		@Override
		public void setSubject(Subject sub) {
			// TODO Auto-generated method stub
			this.Topic=sub;
		}
		
}
