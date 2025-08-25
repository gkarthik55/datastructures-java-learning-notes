package com.learning.designpatterns04.factorydesignpattern;

public class ComputerFactory 
{
	public static Computer getComputerInstance(ComputerType computerType, String processor, String ram, String hdd)
	{
		Computer computerObj = null;
		
		switch(computerType)
		{			
			case PC: 
				computerObj = new Pc(processor, ram, hdd);
				break;
					 
			case SERVER: 		 
				computerObj = new Server(processor, ram, hdd);
				break;
		}
		
		return computerObj;
	}
}