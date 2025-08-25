package com.learning.designpatterns04.factorydesignpattern;

public class Pc implements Computer
{
	@Override
	public String toString() {
		return "Pc [processor=" + processor + ", ram=" + ram + ", hdd=" + hdd + "]";
	}

	private String processor;
	private String ram;
	private String hdd;
	
	Pc(String processor, String ram, String hdd)
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
