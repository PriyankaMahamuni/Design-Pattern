package com.bridgeit.DesignPattern;
import java.util.*;
public class ChatMediatorImplement implements ChatMediator{

		private List<User>users;
		public ChatMediatorImplement() {
		
			users=new ArrayList<User>();
		}
	@Override
	public void sendMediator(String message, User user) {
		// TODO Auto-generated method stub
		for(User u:users)
		{
			if(!(u==user))
			{
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

}
