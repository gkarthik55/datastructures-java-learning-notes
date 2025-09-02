package com.learning.datastructures12.strings;

public class DsaExample_05_Strings_CountWords
{
    // Method 1: trim + split on ANY whitespace (spaces, tabs, newlines)
    public static int countWordsSplit(String sentence)
    {
        String trimmed = sentence.trim();
        
        System.out.println("trimmed:"+trimmed);
        
        if (trimmed.isEmpty())
        {
            return 0;
        }

        return trimmed.split("\\s+").length; // one or more whitespace
    }

    // Remove ONLY spaces (keeps tabs/newlines)
    public static String removeSpacesOnly(String sentence)
    {
        return sentence == null ? "" : sentence.replace(" ", "");
    }

    // Remove ALL whitespace (spaces, tabs, newlines)
    public static String removeAllWhitespace(String sentence)
    {
        return sentence == null ? "" : sentence.replaceAll("\\s+", "");
    }

    public static void main(String[] args)
    {
        String sentence = "  This   is\tmy   country\nIndia    ";

        int words1 = countWordsSplit(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("Word count (split): " + words1);

        System.out.println("Remove ONLY spaces: " + removeSpacesOnly(sentence));
        System.out.println("Remove ALL whitespace: " + removeAllWhitespace(sentence));
    }
}