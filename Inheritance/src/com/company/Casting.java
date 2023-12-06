package com.company;

public class Casting {

    String honkSound = "choo-choo";

    public void honk()	{
        System.out.println(honkSound);
    }
    public static void main(String[] args )	{
        new Vehicle().honk();
        new Train().honk();

        Train   aTrain   = new Train();
        Vehicle aVehicle = (Train)aTrain;
        Vehicle aVehicleOtherReference = aVehicle;
        System.out.println(aTrain + "	" +aTrain);
        System.out.println(aVehicle + "	" +aVehicle);
        aVehicle.honk();
        System.out.println("aVehicle.soManyWheels() = " + aVehicle.soManyWheels());
        aVehicle.honk();
        aVehicle.setSound("ring ring");
        aTrain.setSound("ring ring");
        aVehicle.honk();
        aTrain.honk();

        // aVehicle.onlyAtrainCanDoThis();
        aVehicle.wheels = 0;
        System.out.println("aVehicle.soManyWheels() = " + aVehicle.soManyWheels());
        System.out.println("aTrain.soManyWheels() = " + aTrain.soManyWheels());
        System.out.println("aVehicleOtherReference.soManyWheels() = " + aVehicleOtherReference.soManyWheels());
        System.out.println("aVehicle.wheels = " + aVehicle.wheels);
    }
}