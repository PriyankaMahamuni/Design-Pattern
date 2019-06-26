package com.bridgeit.DesignPattern;

public class UserImplement extends User{

	public UserImplement(ChatMediator med,String message)
	{
		super(med,message);
	}
	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" Sending message "+message);
		mediator.sendMediator(message, this);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" receiving message "+message);
	}

	
}
