package com.company.javaProgrammingBasics;

class StringLiteral {

    public static void main( String args[] ) {
        String aString = "you";
        String bString = "yo" + "u";	// compiler
        String cString = "you";

        if ( cString == aString )
            System.out.println("1. equal");
        if ( cString.equals(aString) )
            System.out.println("2. equal");
        if ( "you".equals(aString) )
            System.out.println("3. equal");
        if ( bString.equals(aString) )
            System.out.println("4. equal");
        if ( "yo" + "u" == aString )
            System.out.println("5. ==");
        if ( bString == aString )
            System.out.println("6. ==");
        if ( bString == new String("you") )
            System.out.println("7. ==");
        else
            System.out.println("8. !=");

    }
}
