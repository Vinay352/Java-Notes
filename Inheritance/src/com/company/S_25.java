package com.company;

public class S_25 {

    static public int intS;

    public S_25 ()	{
        System.out.println("in S constructor");
    }

    static {
        System.out.println("S:Static 1");
    }

    static {
        System.out.println("S: Static 2");
    }

    public static void main(String args[])	{
        System.out.println("new S()     " +  new S_25());
    }
}


