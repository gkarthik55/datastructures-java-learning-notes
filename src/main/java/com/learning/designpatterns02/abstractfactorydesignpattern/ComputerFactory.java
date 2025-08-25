package com.learning.designpatterns02.abstractfactorydesignpattern;

public class ComputerFactory 
{
	public static Computer createComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}
}