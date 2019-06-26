package com.bridgeit.DesignPattern;

public class Fruit implements ItemElement{
	private int PricePerKg;
	private int Weight;
	private String Name;
	Fruit(int costPerKg,int weight,String name)
	{
		this.PricePerKg=costPerKg;
		this.Weight=weight;
		this.Name=name;
	}
	public int getPricePerKg()
	{
		return PricePerKg;
	}
	public int getWeight()
	{
		return Weight;
	}
	public String getName()
	{
		return Name;
	}
	@Override
	public int accept(ShoppingCardVisitor Visitor) {
		// TODO Auto-generated method stub
		return Visitor.visit(this);
	}

}
