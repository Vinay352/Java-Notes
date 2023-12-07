package com.company;

public class AAandBBuse implements AA18, BB18 {

    public void a() {		// interface
        System.out.println("AAandBBuse!a");
    }

    public void b(){
        System.out.println("AAandBBuse.b()");
        BB18.super.b();
    }

    public static void main(String argv[])	{
        new AAandBBuse().a();
        new AAandBBuse().b();
    }
}
