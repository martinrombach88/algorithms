//When the keyword super cannot be used
//Given the following class hierarchy, select all illegal usages of the keyword super:


//1 legal -> super uses default constructor
//2 legal -> A contains field a
//3 illegal -> A does not contain field b
//4 illegal -> B does not contain single param constructor
//5 legal -> B contains two param constructor


//Do not run, code will have errors!

class A {

    protected int a;
}

class B extends A {

    protected int b;
    
    public B(int a, int b) {
        super();     // 1
        super.a = a; // 2
        super.b = b; // 3
    }
}

class C extends B {

    protected int c;

    public C(int a, int b) {
        super(a); // 4
    }
    
    public C(int a) {
        super(a, 10); // 5
    }
}