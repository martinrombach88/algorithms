import java.util.Scanner;

public class Main {

    //PSEUDO
    //Use x for all variables and class names.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        X X = new X(0);
        System.out.println("Enter a number: ");
        X.x = scanner.nextInt();
        x(X);
    }

    public static void x (X X) {
        System.out.println("Multiplication table for " + X.x);
        for (int x = 1; x < 11; x++) {
            System.out.println(x + " times " + X.x + " = " + (x * X.x));
        }
    }
}
