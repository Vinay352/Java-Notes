package com.company;

public class SubclassOfS_25 extends S {

    public int intS;

    static {
        System.out.println("SubclassOfS: Static 1");
    }

    public SubclassOfS_25 ()	{
        System.out.println("in SubclassOfS constructor");
    }

    public static void main(String args[])	{
        System.out.println("In SubClass of S");
        SubclassOfS aSubclassOfS = new SubclassOfS();
    }
}
