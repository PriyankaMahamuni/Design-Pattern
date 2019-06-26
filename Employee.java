package com.bridgeit.DesignPattern;
import java.util.*;
public class Employee implements Cloneable {
	private List<String> employeeList;
	Employee()
	{
		employeeList=new ArrayList<String>();
	}
	Employee(List<String> employeeList)
	{
		this.employeeList=employeeList;
	}
	public void load()
	{
		employeeList.add("Pooja");
		employeeList.add("Sakshi");
		employeeList.add("Madhuri");
		employeeList.add("Sulakshana");
		employeeList.add("Priyanka");
	}
	public List<String> getList()
	{
		return employeeList;
	}
	public Object clone() {
		List<String> temp=new ArrayList<String>();
		for(String s:this.getList())
		{
			temp.add(s);
		}
		return new Employee(temp);
	}

}
