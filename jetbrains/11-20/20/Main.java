class Main {
    //What string does the following code print?
    // There should be a single whitespace between elements of the string.

    //1 B constructor calls super, with n (100).
    //2 A constructor sets n to 100
    //3 B constructor sets B's s to txt.
    //4 B constructor sets A's ch to k
    //5 B prints A's n (100), A's s (abc), and B's ch (z)
    public static void main(String[] args) {
        B b = new B(100, "txt", 'k');
        b.print();
    }
}

class A {

    protected int n = 10;
    protected String s = "abc";
    protected char ch = 'q';

    public A(int n) {
        this.n = n;
    }
}

class B extends A {

    protected int n = 20;
    protected String s = "str";
    protected char ch = 'z';

    public B(int n, String s, char ch) {
        super(n);
        this.s = s;
        super.ch = ch;
    }

    public void print() {
        System.out.println(super.n + " " + super.s + " " + ch);
    }
}


