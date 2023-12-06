package com.company;

import java.util.regex.Pattern;

public class P {

    public static void main(String[] args) {
        String[] texts		   = { "aaa", "ab" };

        String[] patternDefinition = {"a*b"};

        for ( int allWords = 0; allWords < texts.length; allWords ++ )	{
            for ( int allPatterns = 0; allPatterns < patternDefinition.length; allPatterns ++ )	{
                System.out.println(texts[allWords] + " is matched by " + patternDefinition[allPatterns]
                        +  ": " + Pattern.matches(patternDefinition[allPatterns], texts[allWords]) );
            }
        }
    }
}
