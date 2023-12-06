package com.company;

public class Pigeon extends Flock {

    private String name;

    public Pigeon()	{
    }
    public Pigeon(String name)	{
        this.name = name;
    }
    private static void test()	{
        int soManyBirdsCreated = 0;
        String name = "a";
        Pigeon lastOne = null;	// why?
        while (  soManyBirdsCreated++ < maxNumberOfBirds )	{
            lastOne = new Pigeon(name += "a");
        }
        System.out.println("so many are in the flock: " + lastOne.soManyBirds());
        System.out.println("last name used = " + name );
    }
    public static void main(String[] args )	{
        test();
    }
}
