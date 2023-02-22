import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        while (n > 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
        }
        System.out.println(n);

    }
}