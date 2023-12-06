package com.company;

class C1 extends A1 {

    public C1()	{
        System.out.println("    C()");
    }

    public int isAbstract()	{
        System.out.println("	C!isAbstract()");
        return 2;
    }

    public static void main(String args[] )	{
        B11 aB = new B11();
        C1 aC = new C1();

        aB.isAbstract();
        aC.isAbstract();

        (aB.concrete()).isAbstract();
        (aC.concrete()).isAbstract();

    }

}
