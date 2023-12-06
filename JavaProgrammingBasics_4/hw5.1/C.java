// homework 5.1

public class  C extends B {

    int    aInstanceInt;

    static C aC;
    static B aB;
    static A aA;

    C()	{
        aInstanceInt = 3;
    }
    int  aInstanceIntSet(int aInstanceInt) {
        this.aInstanceInt =  aInstanceInt; // changes the variable value of the current class
        return aInstanceInt;
    }
    int  aInstanceIntGet() {
        return aInstanceInt;
    }
    public String toString()	{
        return "C: " + aInstanceIntGet();
    }
    public static void print(String location)	{
        System.out.println(location);
        System.out.println("	" + aA);
        System.out.println("	" + aB);
        System.out.println("	" + aC);
        System.out.println("	" + aA.aInstanceInt);
        System.out.println("	" + aB.aInstanceInt);
        System.out.println("	" + aC.aInstanceInt);
    }
    public static void main(String args[] )       {
        aC = new C(); // aint = 3
        aB = new B();// aint = 2
        aA = new A();// aint = 1
        aB = (B)aC; // c object typecasted to parent B, i.e. aB can access methods of child class but variables of its own only

        aB.aInstanceIntSet(200); // accesses method of child c, sets variable of c object to = 200
        aA   = (A)aB; // b object typecasted to parent A, i.e. aA can access methods of child class but variables of its own only
        aA.aInstanceIntSet(100); // accesses method of child c, sets variable of c object to = 100
        print("1: ");
//        System.out.println(location); // 1:
//        System.out.println("	" + aA); // 100, accesses method of child c, uses its variable
//        System.out.println("	" + aB); // 100, accesses method of child c, uses its variable
//        System.out.println("	" + aC); // 100, accesses method of child c, uses its variable
//        System.out.println("	" + aA.aInstanceInt); // 1, accesses its own variable
//        System.out.println("	" + aB.aInstanceInt);// 2, accesses its own variable
//        System.out.println("	" + aC.aInstanceInt);// 100, accesses its own variable

        aA.aInstanceInt = 42; // changes aA.aint = 42
        aC.aInstanceInt = 44;// changes aC.aint = 44
        print("2: ");
//        System.out.println(location); // 2:
//        System.out.println("	" + aA); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aB); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aC); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aA.aInstanceInt); // 42, accesses its own variable
//        System.out.println("	" + aB.aInstanceInt); // 2, accesses its own variable
//        System.out.println("	" + aC.aInstanceInt); // 44, accesses its own variable

        aB.aInstanceInt = 43; // changes aB.aint = 43
        print("3: ");
//        System.out.println(location); // 3:
//        System.out.println("	" + aA); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aB); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aC); // 44, accesses method of child c, uses its variable
//        System.out.println("	" + aA.aInstanceInt); // 42, accesses its own variable
//        System.out.println("	" + aB.aInstanceInt);// 43, accesses its own variable
//        System.out.println("	" + aC.aInstanceInt);// 44, accesses its own variable

    }
}