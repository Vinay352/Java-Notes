package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        long maxCount = 3;
        String text[] = { "dog", "Fog", "Dog", "dad", "a mug"  };
        String patternDefinition = "([Da]?\\s[um]+g)|[^D]og";
        Pattern pattern = Pattern.compile(patternDefinition);

        // Pattern:
        //	Max one of the set {D, a}, followed by a white space character
        // 	followed by one or more of the set {g, u, m}.
        //	The \\ are required for one escape
        //		matches
        //			a mug
        //  or
        // 	not a D followed by og
        //		matches
        //			Fog, dog, but not Dog
        for ( int index = 0; index < text.length; index ++ )	{
            Matcher aMatcher = pattern.matcher(text[index]);
            System.out.println(text[index] + " is matched by " + patternDefinition +  ": " +
                    aMatcher.matches() );
        }
    }
}
