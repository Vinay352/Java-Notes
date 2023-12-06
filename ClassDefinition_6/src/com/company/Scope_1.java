package com.company;

public class  Scope_1	{

    String aString = null;

    public void method(String aString)	{
        this.aString = aString;
    }
    public Scope_1 test()	{
        String aString = new String("set in test");

        method(aString);
        return this;
    }
    public static void main(String args[] )	{
        System.out.println((new Scope_1().test()).aString);

    }
}
