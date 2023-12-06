package com.company;

public class  NotCorrect	{

    static int counter;
    NotCorrect aNotCorrect =  new NotCorrect();

    public NotCorrect() {
        System.out.println("so Many Calls: " + counter++ );
    }
    public static void main(String args[] )	{
        NotCorrect aNotCorrect = new NotCorrect();
    }
}
