package com.company;

abstract class A1 {

    public abstract int isAbstract();

    public A1 concrete()	{
        System.out.println("A!concrete()");
        return this;
    }

}

