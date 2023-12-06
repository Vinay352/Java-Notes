package com.company.javaProgrammingBasics;

class X_4
{
    public static void main(String args[])
    {
        int i = 0;
        i += 63;
        System.out.println("1. " + ( i++ >> 2 ) );
        System.out.println("2. " + ( 1 > 2 ? 3 : 6 ));


        /*
         *	a ? b : c ? d : e ? f : g
         *	means the same as
         *	a ? b : (c ? d : (e ? f : g)).
         */
        System.out.println("3. " +
                ( 1 > 2 ? 3 : 4 < 5 ? 6 : 9 < 10 ? 7 : 8));
        System.out.println("4. " +
                (1 > 2 ? 3 : (4 < 5 ? 6 : (9 < 10 ? 7 : 8))));
    }
}
