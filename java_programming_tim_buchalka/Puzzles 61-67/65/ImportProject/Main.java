import com.series.Series;

public class Main {
    public static void main(String[] args) {
        //nSum(int n) returns the sum of all numbers from 0 to n.
        // The first 10 numbers are:0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(Series.nSum(i) + ", ");
            } else {
                System.out.print(Series.nSum(i));
                System.out.println();
            }
        }

        // factorial(int n) returns the product of all numbers from 1 to n.
        // The first 10 factorials are: 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(Series.factorial(i) + ", ");
            } else {
                System.out.print(Series.factorial(i));
                System.out.println();
            }
        }

        //fibonacci(n) returns the nth Fibonacci number.
        //The first 10 fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(Series.fibonacci(i) + ", ");
            } else {
                System.out.print(Series.fibonacci(i));
                System.out.println();
            }
        }
    }

}
