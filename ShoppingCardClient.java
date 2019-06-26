/**
 * @purpose 	: Visitor design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 11.06.19
 */

package com.bridgeit.DesignPattern;

public class ShoppingCardClient {
		public static void main(String args[])
		{
			ItemElement []items=new ItemElement[] {new Book(20, "98659"),new Book(400,"36265"),new Fruit(30, 5, "Banana"),new Fruit(50,5,"Orange")};
			int total=calculateTotal(items);
			System.out.println("Total Cost : "+total);
		}
		public static  int calculateTotal(ItemElement []items)
		{
			ShoppingCardVisitor visitors=new ShoppingCardVisitorImplement();
			int sum=0;
			for(ItemElement item:items)
			{
				sum+=item.accept(visitors);
			}
			return sum;
		}
}
