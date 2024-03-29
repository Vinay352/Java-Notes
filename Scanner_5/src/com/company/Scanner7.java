package com.company;

import java.io.File;
import java.util.Scanner;

public class Scanner7 {
    public static void asIs() {
        Scanner sc  = new Scanner(System.in);
        System.out.print(": ");
        while ( sc.hasNext() )
            System.out.print("-" + sc.next() + "+");
        sc.close();
        System.out.println();
    }
    public static void whiteSpace(String description, String theDelimiter) {
        Scanner sc  = null;
        try {
            sc  = new Scanner(new File( "words.txt") );
        } catch ( Exception e )	{}
        sc.reset();
        sc.useDelimiter(theDelimiter);	// A whitespace character: [ \t\n\x0B\f\r]
        System.out.println(description);
        System.out.println("\tdelimiter: " + theDelimiter);
        while ( sc.hasNext() )
            System.out.println("\t-" + sc.next() + "+");
        sc.close();
        System.out.println();
    }
    public static void main( String[] args ) {
        whiteSpace("white space* comma white spice*", "\\s*,\\s*");
        whiteSpace("white space+ comma white spice*", "\\s+,\\s*");
        whiteSpace("white space* comma or semicolom white space*", "\\s*(,|;)\\s*");
    }
}
