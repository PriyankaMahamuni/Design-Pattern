/**
 * @purpose 	: Mediator design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 10.06.19
 */

package com.bridgeit.DesignPattern;

public class ChatClient {
		public static void main(String args[])
		{
			ChatMediator mediator=new ChatMediatorImplement();
			User user1=new UserImplement(mediator, "Pooja");
			User user2=new UserImplement(mediator,"Aara");
			User user3=new UserImplement(mediator,"Soniya");
			User user4=new UserImplement(mediator,"Sakshi");
			mediator.addUser(user1);
			mediator.addUser(user2);
			mediator.addUser(user3);
			mediator.addUser(user4);
			user1.send("Hi Hello");
			user2.send("How are you?");
		}
}
