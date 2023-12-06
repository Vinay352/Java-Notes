package com.company;

public class Train extends Vehicle {

    String honkSound = "choo-choo";
    int wheels       = 32;

    public void setSound (String honkSound)    {
        this.honkSound = honkSound;
    }
    public int soManyWheels ()    {
        return wheels;
    }
    public void onlyAtrainCanDoThis()	{
    }
    public void honk()	{
        System.out.println(honkSound);
    }
    public void de()	{
        System.out.println("de");
    }
    public static void main(String[] args )	{
        new Vehicle().honk();
        new Train().honk();
        new Train().de();
    }
}
