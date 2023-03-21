package com.series;

public class Series {
    //PSEUDO - see comments


    public static int nSum(int n) {
        int total = 0;
        //for number in n -> for i = 0; i <= n; i++
        //add i to total, return total.
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    };
    // factorial
    public static int factorial(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (total == 0) {
                total += i;
            } else {
                total *= i;
            }
        }

        return total;
    }
    public static int fibonacci(int n) {
        int fibo = 0;

        //for number in n ->
        if (n == 0 || n == 1) {
            fibo = n;
        } else {
        //Version 1: recursive line.
        //calls the method inside itself to find previous 2 numbers
          return fibonacci(n - 1) + fibonacci(n - 2);

        //Version 2: conditional block (complete when ready)
        }

        return fibo;
    }


}
