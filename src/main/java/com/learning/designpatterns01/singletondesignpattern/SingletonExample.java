package com.learning.designpatterns01.singletondesignpattern;

public class SingletonExample 
{
	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.hashCode());
	}
}

class Singleton
{
	private static Singleton obj = new Singleton();
	
	private Singleton()
	{}
	
	public static synchronized Singleton getInstance()
	{
		return obj;
	}
	
	// We can also have this extra	
	//	private static class InnerSingleton
	//	{
	//		private static final Singleton innerobj = new Singleton();
	//	}
}
