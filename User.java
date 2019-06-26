package com.bridgeit.DesignPattern;

public abstract class User {
	protected ChatMediator mediator;
	protected String Name;
	public User(ChatMediator med,String name)
	{
		this.mediator=med;
		this.Name=name;
	}
	public abstract void send(String message);
	public abstract void receive(String message);
}
