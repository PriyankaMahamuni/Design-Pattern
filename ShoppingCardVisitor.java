package com.bridgeit.DesignPattern;

public interface ShoppingCardVisitor {
		public int visit(Book book);
		public int visit(Fruit fruit);
}
