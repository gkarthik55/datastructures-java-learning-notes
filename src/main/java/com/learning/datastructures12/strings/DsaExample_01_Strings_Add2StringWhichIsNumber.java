package com.learning.datastructures12.strings;

public class DsaExample_01_Strings_Add2StringWhichIsNumber 
{
	public static void main(String[] args) 
	{	
		String s1 = "1234";
		String s2 = "5678";
		
		Integer sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		System.out.println(" Sum of 2 numbers : "+sum);
		
		String originalString = "   Hello World   ";
        System.out.println("Original String: \"" + originalString + "\"");

        // Using the trim() method
        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: \"" + trimmedString + "\"");

        // Example with only leading or trailing spaces
        String leadingSpaces = "   Java";
        String trailingSpaces = "Programming   ";
        System.out.println("Leading spaces trimmed: \"" + leadingSpaces.trim() + "\"");
        System.out.println("Trailing spaces trimmed: \"" + trailingSpaces.trim() + "\"");

        // Example with no spaces to trim
        String noSpaces = "NoSpacesHere";
        System.out.println("No spaces to trim: \"" + noSpaces.trim() + "\"");
	}
}
