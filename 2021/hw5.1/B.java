public class  B extends A {

    int    aInstanceInt;

    B()	{
        aInstanceInt = 2;
    }
    int  aInstanceIntSet(int aInstanceInt) {
        this.aInstanceInt =  aInstanceInt;
        return aInstanceInt;
    }
    int  aInstanceIntGet() {
        return aInstanceInt;
    }
    public String toString()	{
        return "B: " + aInstanceIntGet();
    }
    public static void main(String args[] )       {
        B aB = new B();
        aB.aInstanceIntSet( 1 + aB.aInstanceIntSet(0));
        System.out.println(aB);
    }
}

//public class B {
//
//    int aBint;
//
//    public B()	{
//        System.out.println("public B()" );
//    }
//    public B(int aBint)	{
//        this.aBint = aBint;
//        System.out.println("public B(int aBint)" );
//    }
//    public String toString()	{
//        return ""  + getClass();
//    }
//    public static void main(String args[])	{
//        System.out.println("1: " + new B());
//        System.out.println("2: " + new B(42));
//    }
//}


class BB extends B {

    int aBBint;
    public int x;

    public BB()	{
        System.out.println("public BB()" );
    }
    public BB(int aBBint)	{
        this.aBBint = aBBint;
        System.out.println("public BB(int x)" );
    }
    public String toString()	{
        return "" + getClass();
    }
    public static void main(String args[])	{
        System.out.println("1: " + new BB());
        System.out.println("2: " + new BB(42));
    }
}