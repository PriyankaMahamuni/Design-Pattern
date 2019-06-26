package com.bridgeit.DesignPattern;

public class ShoppingCardVisitorImplement implements ShoppingCardVisitor {

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		int cost=0;
		if(book.getprice()>50)
		{
			cost=book.getprice()-5;
		}
		else
		{
			cost=book.getprice();
		}
		System.out.println("Book Java has code  "+book.getisbnNumber()+" will has Cost  :  "+ cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int cost=fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName()+"Friut for "+fruit.getPricePerKg()+" per Kg will be cost :"+cost);
				return cost;
	}

}
