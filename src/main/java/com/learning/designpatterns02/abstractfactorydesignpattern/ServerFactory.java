package com.learning.designpatterns02.abstractfactorydesignpattern;

public class ServerFactory implements ComputerAbstractFactory
{
	private String processor;
	private String ram;
	private String hdd;
	
	ServerFactory(String processor, String ram, String hdd)
	{
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
	}
		
	public String getProcessor() 
	{
		return processor;
	}

	public String getRAM() 
	{
		return ram;
	}
	
	public String getHDD() 
	{
		return hdd;	
	}
	
	public String toString() 
	{
		return "Pc [processor=" + processor + ", ram=" + ram + ", hdd=" + hdd + "]";
	}
	
	public Computer createComputer() 
	{
		return new Server(processor,ram,hdd);
	}
}
