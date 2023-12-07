package com.company;

public class Cuse implements C18 {

    public void a() {
        System.out.println("CUse!a");
        // System.out.println("B  = " + A.AB);
    }

    public void b() {
        System.out.println("CUse!b");
    }
    public void c() {
        System.out.println("CUse!c");
    }

    public static void main(String argv[])	{
        new Cuse().a();
        System.out.println("A  = " + A);
        System.out.println("B  = " + B);
    }
}
