package com.company;

public class TrainEx {

    String honkSound = "choo-choo";

    public void honk()	{
        System.out.println(honkSound);
    }
    public static void main(String[] args )	{
        new Vehicle().honk();
        new Train().honk();

        Train   aTrain   = new Train();
        Vehicle aVehicle = aTrain; // new Vehicle();
        Vehicle aVehicleOtherReference = aVehicle;
        System.out.println(aVehicle + "	" +aTrain);
        System.out.println(aVehicle + "	" +aVehicle);
        aVehicle.honk();
        aTrain.honk();
        System.out.println("--------------------");
        aVehicle.setSound("ringADing");
        aVehicle.honk();
        aTrain.honk();
        System.out.println("aVehicle.honkSound: " + aVehicle.honkSound);
        System.out.println("aTrain.honkSound: " + aTrain.honkSound);

    }
}