package com.bridgeit.DesignPattern;

public class PC extends Computer {
	public String ram;
	public String hdd;
	public String cpu;
	PC(String ram,String hdd,String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	public String getRAM()
	{
		return this.ram;
		
	}
	public String getHDD()
	{
		return this.hdd;
	}
	public String getCPU()
	{
		return this.cpu;
	}
}
