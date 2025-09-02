package com.learning.datastructures12.strings;

//Program to count vowels, consonant, digits and special characters in string.

//Ascii values : A-Z = 65-90, a-z= 97-122, 0-9 = 48-57
public class DsaExample_04_Strings_CountVowelsConsonantDigits
{
	public static void main(String[] args) 
	{
		String str = "GeeksForGeeks@123";
		
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int special = 0;
		
		char charArr[] = str.toLowerCase().toCharArray();
		int len = charArr.length;
		
		for(int i=0; i<len; i++)
		{
			if(charArr[i] >= 'a' && charArr[i] <= 'z')
			{
				if(charArr[i] == 'a' || charArr[i] == 'e' 
						|| charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(charArr[i] >= 48 && charArr[i] <= 57)
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		
		System.out.println("vowels count :"+vowels);
		System.out.println("consonants count :"+consonants);
		System.out.println("digits count :"+digits);
		System.out.println("special character count :"+special);
		
		// Print Capital A-Z letters
		for(char i=65; i<=90; i++)
		{
			System.out.print("\t"+i);
		}
		
		System.out.println("");
		// Print Small A-Z letters
		for(char i=97; i<=122; i++)
		{
			System.out.print("\t"+i);
		}
		
		System.out.println("");
		// Print Only Digits
		for(char i=48; i<=57; i++)
		{
			System.out.print("\t"+i);
		}
	} 
}	         
