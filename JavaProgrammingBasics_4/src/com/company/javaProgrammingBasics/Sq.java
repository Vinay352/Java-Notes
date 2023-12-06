package com.company.javaProgrammingBasics;

class Sq {

    public static void main(String args[]) {
        String aString = "0";
        String bString = "0" + "1";
        System.out.println(aString + "1" == "01" );
        System.out.println((aString + "1").equals("01") );
    }
}
