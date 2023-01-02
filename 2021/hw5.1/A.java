public class  A {

    int    aInstanceInt;

    A()	{
        aInstanceInt = 1;
    }
    int  aInstanceIntSet(int aInstanceInt) {
        this.aInstanceInt =  aInstanceInt;
        return aInstanceInt;
    }
    int  aInstanceIntGet() {
        return aInstanceInt;
    }
    public String toString()	{
        return "A: " + aInstanceIntGet();
    }
    public static void main(String args[] )       {
        A aA = new A();
        aA.aInstanceIntSet( 1 + aA.aInstanceIntSet(0));
        System.out.println(aA);
    }
}