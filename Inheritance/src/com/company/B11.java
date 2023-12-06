package com.company;


class B11 extends A1 {

    public B11()	{
        System.out.println("    B()");
    }

    public int isAbstract()	{
        System.out.println("	B!isAbstract()");
        return 1;
    }

    public A1 concrete()	{
        System.out.println("B!concrete()");
        return this;
    }

}
