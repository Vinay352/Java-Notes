package com.company;

class XXXX_2 extends XXXX_1 {

    int x1 = 2;

    public void a()    {
        System.out.println("    in X_1!a()");
        System.out.println("    in X_1!a()!x1 = " + x1 );
        System.out.println("    in X_1!a()(X_1)this.x1 = " + this.x1 );
        System.out.println("    in X_1!a()!super.x1 = "
                + super.x1 );
    }

    public static void main(String args[])
    {
        XXXX_2 aX_2 = new XXXX_2();
        System.out.println("    main!x1 = " + aX_2.x1 );
        aX_2.a();
    }
}

