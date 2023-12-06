// homework 2.2

class StringThing {
    public static String method1()	{
        return "123";
    }
    public static String method2()	{
        return method1();
    }
    public static void main( String args[] ) {
        int counter = 0;
        int theNumberThree = 3;
// first block begins 		/////////////////////////////////////////////////////////////
        String aString = "123"; // literal, same as aString
        String bString = "123"; // literal, same as aString
        String cString = "12" + "3"; // concat operation of literal and literal is done at compile time => literal, same as aString
        String dString = "12" + theNumberThree; // concat operation of literal and variable is done at runtime, therefore a new string
        String eString = "123" + aString; // concat operation of literal and variable is done at runtime, therefore a new string
        String fString = "123123"; // literal

        System.out.println("" + ++counter + ".	" +   ( aString  == bString ) );
        System.out.println("" + ++counter + ".	" +   ( bString  == cString ) );
        System.out.println("" + ++counter + ".	" +   ( cString  == dString ) );
        System.out.println("" + ++counter + ".	" +   ( eString  == fString ) );
// first block ends 		/////////////////////////////////////////////////////////////

// second block begins 		/////////////////////////////////////////////////////////////
        String aaString = "123"; // literal
        String bbString = new String("123");// runtime -> new string
        String ccString = new String(aString); // runtime -> new string
        String ddString = method1(); // return literal -> same as aString
        String eeString = method2(); // return literal -> same as aString
        String ffString = method1() + method2(); // although both methods return literals => concat of methods/variables is done at runtime => new string

        System.out.println("" + ++counter + ".	" +   ( aaString  == bbString ) );
        System.out.println("" + ++counter + ".	" +   ( aaString  == ccString ) );
        System.out.println("" + ++counter + ".	" +   ( aaString  == ddString ) );
        System.out.println("" + ++counter + ".	" +   ( aaString  == eeString ) );
        System.out.println("" + ++counter + ".	" +   ( ffString  == "123123" ) );
// second block ends 		/////////////////////////////////////////////////////////////

    }
}
