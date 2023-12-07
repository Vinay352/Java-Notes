package com.company;

class XXX_2 extends XXX_1 {

    public XXX_2()    {
        // super();	// default
        super.a();
        System.out.println("	in X_2!X_2()");
    }
    public XXX_2(int x)    {
        // super();	// default
        super(x);
        System.out.println("	in X_2!X_2(int x)");
    }

    public void a()    {
        super.a();
        System.out.println("    in X_2!a()");
    }


    public static void main(String args[])
    {
        XXX_2 aX_2 = new XXX_2();
        aX_2.a();
        XXX_2 anOtherX_2 = new XXX_2(3);
    }
}



