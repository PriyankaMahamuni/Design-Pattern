package com.bridgeit.DesignPattern;

public class Book implements ItemElement{
		public int price;
		private String isbnNumber;
		public Book(int price,String isbnNumber)
		{
			this.price=price;
			this.isbnNumber=isbnNumber;
		}
		public int getprice()
		{
			return price;
		}
		public String getisbnNumber()
		{
			return isbnNumber;
		}
		@Override
		public int accept(ShoppingCardVisitor Visitor) {
			// TODO Auto-generated method stub
			return Visitor.visit(this);
		}
		
}
