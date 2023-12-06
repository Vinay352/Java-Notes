package com.company;

public class Flock {

    private static int soManyBirds = 0;
    static final int   maxNumberOfBirds = 3;

    public Flock()	{
        soManyBirds ++;
    }
    public int soManyBirds()	{
        return soManyBirds;
    }
    public String toString()	{
        return ""  + soManyBirds;
    }
}