package com.company;

import java.util.Vector;

class UseBandCandV {

    public static void main(String args[] )	{

        int sum = 0;
        final int MAX = 4;
        Vector aVector = new Vector();

        for ( int i = 0; i < MAX; i++ )
            if ( i % 2 == 0 )
                aVector.add( new B());
            else
                aVector.add( new C());

        for ( int i = 0; i < MAX; i ++ ) {
//            sum += aVector.elementAt(i).isAbstract();  ///////	Why does this not compile
//            sum += ((A)aVector.elementAt(i)).isAbstract();  ///////
        }

    }
}
