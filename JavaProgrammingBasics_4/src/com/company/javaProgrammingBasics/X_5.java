package com.company.javaProgrammingBasics;

class X_5 {

    public static void main( String args[] ) {

        int n = 0;

        while ( true )	{
            System.out.println("xx");
            if ( n++ == 0 )	{
                System.out.println("n == 0");
            } else if ( n++ == 1 )	{
                System.out.println("n == 1");
            } else if ( n-- == 2 )
                System.out.println("n == 2");

        }
    }
}
