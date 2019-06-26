package com.bridgeit.DesignPattern;

public interface Subject {
		public void registered(Observer obj);
		public void notRegistered(Observer obj);
		public void notifyObservers();
		public Object getUpdate(Observer obj);
}
