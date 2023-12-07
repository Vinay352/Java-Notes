package com.company;

class UseBandC {

    public static void main(String args[] )	{
        int sum = 0;
        final int MAX; 		// or final int MAX = 6;
        MAX = 3;
        Object[] aArray = new Object[MAX];	// ***
        // A1[] aArray = new A1[MAX];		// ***

        for ( int i = 0; i < aArray.length; i ++ )
            if ( i % 2 == 0 )
                aArray[i] = new B11(); 	// ***
            else
                aArray[i] = new C1(); 	// ***

        for ( int i = 0; i < aArray.length; i ++ )	{
//            sum += aArray[i].isAbstract();  // *** // funtion present in child classes but not in parent classes
            sum += ( (A1)aArray[i] ).isAbstract();  // ***
        }

    }

}
