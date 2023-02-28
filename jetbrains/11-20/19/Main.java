// Class hierarchy
// What is the output of invoking the main method of the Main class? Type the numbers without whitespaces in one line into the input field.

//PSEUDO
//1. main calls C constructor 1.
//2. constructor 1 calls constructor 2 with value 5. (at the end of this code, constructor 1 will print value of n)
//4. B constructor calls super, which does nothing.
//5. B constructor prints n (20)
//6. C sets super.n to n. n is now 5.
//7. C constructor 2 prints out n (5 -> the local method scope n.)
//8. C constructor 1 prints out n (30 -> the class n)

//Output 20530 (System.out.print has no spaces/line breaks)


public class Main {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    protected int n = 10;
}

class B extends A {
    protected int n = 20;

    public B() {
        super();
        System.out.print(n);
    }
}

class C extends B {
    protected int n = 30;

    public C() {
        this(5);
        System.out.print(n);
    }

    public C(int n) {
        super();
        super.n = n;
        System.out.print(n);
    }
}