package com.company;

class AX extends A {

    public int x;

    public A a(int x)	{
        System.out.print("= in AX!a");
        return this;
    }

    public static void main(String args[])	{
        AX aAX = new AX();
        A  aA  = (A)aAX;

        System.out.println("aAX.a(42)	" + aAX.a(42) );
        System.out.println("aAX.a(43)	" + aAX.aa(43) );

        System.out.println("aA.aa(44)	" + aA.aa(44) );
        System.out.println("aA.a(45)	" + aA.a(45) ); // <--
    }
}
