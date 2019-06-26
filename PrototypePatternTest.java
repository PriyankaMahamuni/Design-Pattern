/**
 * @purpose 	: Prototype design pattern.
 * @author 		: Priynka Mahamuni
 * @version 	: 1.0
 * @since 		: 12.06.19
 */

package com.bridgeit.DesignPattern;
import java.util.*;
public class PrototypePatternTest {
	public static void main(String args[])
	{
		Employee empObject=new Employee();
		empObject.load();
		Employee empObjectNew =(Employee)empObject.clone();
		Employee empObjectNewOne=(Employee)empObject.clone();
		List<String>list=empObjectNew.getList();
		list.add("Jyoti");
		List<String>listNew=empObjectNewOne.getList();
		listNew.remove("Priyanka");
		System.out.println("Original List : "+empObject.getList());
		System.out.println("After Cloning : "+empObjectNew.getList());
		System.out.println("After Cloning : "+empObjectNewOne.getList());
	}
}
