/**
 * @purpose 	: Observer design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 13.06.19
 */

package com.bridgeit.DesignPattern;

public class ObserverPatternTest {
		public static void main(String args[])
		{
			MyTopic topic=new MyTopic();
			Observer obj1=new MyTypeSubscriber("obj1");
			Observer obj2=new MyTypeSubscriber("obj2");
			Observer obj3=new MyTypeSubscriber("obj3");
			
			topic.registered(obj1);
			topic.registered(obj2);
			topic.registered(obj3);
			
			obj1.setSubject(topic);
			obj2.setSubject(topic);
			obj3.setSubject(topic);
			
			obj1.update();
			
			topic.postMessage("New Message");
		}
}
