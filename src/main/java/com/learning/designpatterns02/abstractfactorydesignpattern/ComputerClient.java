package com.learning.designpatterns02.abstractfactorydesignpattern;

public class ComputerClient {

	public static void main(String[] args) 
	{
		Computer c1 = ComputerFactory.createComputer(new PcFactory("Core i5", "8 Gb", "500 GB"));
		Computer c2 = ComputerFactory.createComputer(new ServerFactory("AMD Rysan", "32 Gb", "2 TB"));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
