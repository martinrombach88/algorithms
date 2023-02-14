
package com.series;
public class Main {

    public static void main(String[] args) {
        //nSum -> returns the sum of all numbers from 0 to n.
        // 0, 1 (0 + 1), 3 (2 + 1), 6 (1 + 2 + 3), 10, 15, 21, 28, 36, 45, 55.
        System.out.println("-".repeat(20));
        System.out.println("Series.nSum");
        System.out.println(Series.nSum(0)); //0
        System.out.println(Series.nSum(1)); //1
        System.out.println(Series.nSum(2)); //3
        System.out.println(Series.nSum(3)); //6
        System.out.println(Series.nSum(4)); //10
        System.out.println(Series.nSum(5)); //15
        System.out.println(Series.nSum(6)); //21
        System.out.println(Series.nSum(7)); //28
        System.out.println(Series.nSum(8)); //36
        System.out.println(Series.nSum(9)); //45
        System.out.println(Series.nSum(10)); //55


        System.out.println("-".repeat(20));
        System.out.println("Series.factorial");
        System.out.println(Series.factorial(0)); //0
        System.out.println(Series.factorial(1)); //1
        System.out.println(Series.factorial(2)); //3
        System.out.println(Series.factorial(3)); //6
        System.out.println(Series.factorial(4)); //10
        System.out.println(Series.factorial(5)); //15
        System.out.println(Series.factorial(6)); //21
        System.out.println(Series.factorial(7)); //28
        System.out.println(Series.factorial(8)); //36
        System.out.println(Series.factorial(9)); //45
        System.out.println(Series.factorial(10)); //55

        // fibonacci(n) returns the nth Fibonacci number. If not 0/1 -> f(n) = f(n-1) + f(n-2)
        // The first 10 fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        System.out.println("-".repeat(20));
        System.out.println("Series.fibonacci");
        System.out.println(Series.fibonacci(0)); //0
        System.out.println(Series.fibonacci(1)); //1
        System.out.println(Series.fibonacci(2)); //1
        System.out.println(Series.fibonacci(3)); //2
        System.out.println(Series.fibonacci(4)); //3
        System.out.println(Series.fibonacci(5)); //5
        System.out.println(Series.fibonacci(6)); //8
        System.out.println(Series.fibonacci(7)); //13
        System.out.println(Series.fibonacci(8)); //21
        System.out.println(Series.fibonacci(9)); //34
        System.out.println(Series.fibonacci(10)); //55
    }


}
