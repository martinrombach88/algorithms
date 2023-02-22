class Main {
    public static void main(String[] args) {

    //Enter the value of the result variable after the following code is executed:

        int result = 5;
        int a = 1; //0
        int b = --a; //0
        //--a takes 1 from 'a' immediately before return.
        //This affects both a and b.

        System.out.println("Init");
        System.out.println("a " + a); //0
        System.out.println("b " + b); //0

        a++;

        System.out.println("a++");
        System.out.println("a " + a); //1 a changes value after return
        System.out.println("b " + b); //0 b retains original value


        result += a + (--a / ++b);
        //a = 1
        //(--a = 0, b = 1), a / b = 0.
        //1 + 0 doesn't affect result.
        System.out.println("After result");
        System.out.println("a " + a); //0
        System.out.println("b " + b); //1
        System.out.println(result); //6


        int d = 4;
        int e = d++;
        //e = 4

        int f = --d + e++;
        //--d = 4, e++ = 4 (f = 8)

        int result2 = ++d - (f++ - e) + f;
        //++d = 5, f++ = 8, e = 5, f = 9
        //5 - 3 (8-5=3) = 2 -> 2 + 9
        System.out.println(result2);
    }
}