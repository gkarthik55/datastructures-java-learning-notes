package com.learning.designpatterns03.builderdesignpattern;

public class BuilderDesignExample 
{
	public static void main(String[] args) 
	{
		// Using builder to get the object in a single line of code and 
		// without any inconsistent state or arguments management issues		
		Laptop comp = new Laptop.LaptopBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
		.setGraphicsCardEnabled(true).build();
	}
}
