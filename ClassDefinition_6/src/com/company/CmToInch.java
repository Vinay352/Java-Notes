package com.company;

import static java.lang.Math.PI;

public class  CmToInch {
    static final double centimeterToInchMulitplier = 2.54;
    static CmToInch aCmToInch = null;	// use before define
    // assign object before use
    double inCentimeter = 0;
    double inInch; 			// = 0;
    static double totalCentimeter;
    static double totalInch;


    public CmToInch()    {
    }
    public CmToInch(int inInch)    {
        this.inInch = inInch;
    }
    public void cm(double soLong){
        inCentimeter = soLong;
        inInch       = inCentimeter * centimeterToInchMulitplier;
        totalCentimeter += inCentimeter;
        totalInch += inInch;

    }
    public String toString(){
        return "centimeter/inch = "  + inCentimeter + "/" + inInch;
    }
    public static void total(){
        System.out.println("    totalCentimeter " + totalCentimeter);
        System.out.println("    totalInch "       + totalInch);
    }

    public static void main(String args[] )	{
        System.out.println("pi	= " + PI);	// from where
        System.out.println("e	= " + Math.E);
        CmToInch aCmToInch = new CmToInch();	// which one
        CmToInch aaCmToInch = new CmToInch();

        aCmToInch.cm(1);
        aaCmToInch.cm(10);
        System.out.println(aaCmToInch);
        total();
        new CmToInch().total();
    }
}
