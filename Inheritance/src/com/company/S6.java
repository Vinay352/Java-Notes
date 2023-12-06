package com.company;

public class S6 extends S5  {

    public int inS6andS5 = 2;

    public void both()	{
        inS6andS5 = 22;
    }
    public String toStringSuper()      {
        return super.toString();
    }
    public String toString()      {
        return "S6: " + "inS6andS5 =  " + inS6andS5 + " inS5Only =  " + inS5Only ;
    }
    public int superA()      {
        return super.inS6andS5;
    }

    public static void main(String args[]) {
        S6 aS6 = new S6();
        S5 aS5 = (S5)aS6;

        aS6.both();
        System.out.println("1. aS6 = " + aS6 );
        System.out.println("1. aS5 = " + aS5 + "\n" );
        aS5.both();
        System.out.println("2. aS6 = " + aS6 );
        System.out.println("2. aS5 = " + aS5 );
        System.out.println("2. aS6.toStringSuper() = " + aS6.toStringSuper() + "\n" );

        aS6.inS6andS5 = 3;
        System.out.println("aS6.inS6andS5 = 3;");
        System.out.println("3. aS6 = " + aS6 );
        System.out.println("3. aS5 = " + aS5 + "\n" );

        aS6.inS5Only = 4;
        System.out.println("aS6.inS5Only = 4;");
        System.out.println("4. aS6 " + aS6);
        System.out.println("4. aS5 " + aS5 + "\n");

        aS5.inS5Only = 5;
        System.out.println("aS5.inS5Only = 5;");
        System.out.println("5. aS6 " + aS6);
        System.out.println("5. aS5 " + aS5);

    }
}
