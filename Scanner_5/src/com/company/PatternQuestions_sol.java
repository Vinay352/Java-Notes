package com.company;

import java.util.regex.Pattern;

public class PatternQuestions_sol {

    public static void main(String[] args) {
// Find a text to match the pattern
        String patternDefinition;
        String text;

        text		  = "aa";
        patternDefinition = "a+b*";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = "xaab";
        patternDefinition = "x[a-z]+b";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = "aabi";
        patternDefinition = "^a[a-z][b-z]i";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = " 1w";
        patternDefinition = "\\s\\S\\w";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = "a";
        patternDefinition = "a*b*c*.";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = "123.12";
        patternDefinition = "[0-9]{3}t[0-9]{2}";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

        text		  = "123.12";
        patternDefinition = "[0-9]{3}\\.[0-9]{2}";
        System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

    }
}
