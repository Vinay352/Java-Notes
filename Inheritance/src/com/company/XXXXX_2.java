package com.company;

class XXXXX_2 extends XXXXX_1 {

    static int x1 = 2;
    int x2 = 22;

    public void a()    {
        System.out.println("    in X_1!a()");
        System.out.println("    in X_1!a()!x1 = " + x1 );
        System.out.println("    in X_1!a()!super.x1 = "
                + super.x1 );
        System.out.println("    in X_1!a()!X_1.x1 = "
                + XXXXX_1.x1 );

        /*   System.out.println("    in X_1!a()!super.x2 = "
         *				+ super.x2);
         *  X_2.java:13: Variable x2 in class
         *		X_1 not accessible from class X_2.
         *                                      ^
         *
         */
    }

    public static void main(String args[])
    {
        XXXXX_2 aX_2 = new XXXXX_2();
        System.out.println("    main!x1 = " + aX_2.x1 );
        System.out.println("    main!x1 = " + aX_2.x2 );
        aX_2.a();
    }
}
