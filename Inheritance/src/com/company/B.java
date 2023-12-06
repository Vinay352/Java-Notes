package com.company;

public class B {

    int aBint;

    public B()	{
        System.out.println("public B()" );
    }
    public B(int aBint)	{
        this.aBint = aBint;
        System.out.println("public B(int aBint)" );
    }
    public String toString()	{
        return ""  + getClass();
    }
    public static void main(String args[])	{
        System.out.println("1: " + new B());
        System.out.println("2: " + new B(42));
    }
}

