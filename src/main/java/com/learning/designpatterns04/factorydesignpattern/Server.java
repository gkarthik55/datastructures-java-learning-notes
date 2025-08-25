package com.learning.designpatterns04.factorydesignpattern;

public class Server implements Computer
{
	private String processor;
	private String ram;
	@Override
	public String toString() {
		return "Server [processor=" + processor + ", ram=" + ram + ", hdd=" + hdd + "]";
	}

	private String hdd;
	
	Server(String processor, String ram, String hdd)
	{
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
	}
		
	@Override
	public String getProcessor() 
	{
		return processor;
	}

	@Override
	public String getRAM() 
	{
		return ram;
	}
	
	@Override
	public String getHDD() 
	{
		return hdd;	
	}
}
