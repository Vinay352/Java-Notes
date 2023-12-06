package com.company;

public class S5 {

    public int inS6andS5 = 1;
    public int inS5Only = 1;

    public String toString()	{
        return "S5: " + "inS6andS5 =  " + inS6andS5 + " inS5Only =  " + inS5Only ;
    }
    public void both()    {
        inS6andS5 = 11;
    }
    public static void main(String args[]) {
        System.out.println(new S5());
    }
}