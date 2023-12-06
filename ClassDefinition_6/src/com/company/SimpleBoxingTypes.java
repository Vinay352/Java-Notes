package com.company;

public class SimpleBoxingTypes {
    public static void main( String[] args ) {
        Float float42Object    	= Float.valueOf(42F);
        Integer integer42Object = Integer.valueOf(42);
        Double double42Object 	= Double.valueOf(42.0);

        double floatObject  = float42Object + (double)integer42Object + (double)double42Object;
        float ff  = floatObject + (float)integer42Object + ((float)double42Object);

        System.out.println(floatObject);
    }
}
