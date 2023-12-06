package com.company;

class BB extends B {

    int aBBint;
    public int x;

    public BB()	{
        System.out.println("public BB()" );
    }
    public BB(int aBBint)	{
        this.aBBint = aBBint;
        System.out.println("public BB(int x)" );
    }
    public String toString()	{
        return "" + getClass();
    }
    public static void main(String args[])	{
        System.out.println("1: " + new BB());
        System.out.println("2: " + new BB(42));
    }
}
