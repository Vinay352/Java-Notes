package com.company.javaProgrammingBasics;

class Return_1 {

    public static int method() {
        System.exit(2);
        return 0;
    }
    public static void main( String args[] ) {
        method() ;
        System.out.println("xxx");
    }
}
