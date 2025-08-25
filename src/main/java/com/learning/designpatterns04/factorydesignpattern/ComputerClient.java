package com.learning.designpatterns04.factorydesignpattern;

public class ComputerClient {

	public static void main(String[] args) 
	{
		Computer c1 = ComputerFactory.getComputerInstance(ComputerType.PC, "Core i5", "8 Gb", "500 GB");
		Computer c2 = ComputerFactory.getComputerInstance(ComputerType.SERVER, "AMD Rysan", "32 Gb", "2 TB");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
