package com.bridgeit.DesignPattern;
import java.util.*;
public class MyTopic implements Subject{
	private List<Observer>observers;
	private String message;
	private boolean changed;
	private Object Mutex=new Object();
	MyTopic()
	{
		this.observers=new ArrayList<>();
	}
	public void registered(Observer obj)
	{
		if(obj==null)throw new NullPointerException("null Observer");
		synchronized (Mutex) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
	}
	public void notRegistered(Observer obj)
	{
		synchronized(Mutex)
		{
			observers.remove(obj);
		}
	}
	public void notifyObservers()
	{
		List<Observer> localObserver=null;
		synchronized(Mutex)
		{
			if(!changed)
				return;
			localObserver=new ArrayList<>(this.observers);
			this.changed=false;
		}
	}
	public Object getUpdate(Observer obj)
	{
		return this.message;
	}
	public void postMessage(String msg)
	{
		System.out.println("Message Posted to Topic : "+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers(); 
	}
}
