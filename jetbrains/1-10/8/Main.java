import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value;
        int top = 0;
        do {
            value = scanner.nextInt();
            top = top < value ? value : top;
        } while (value != 0);
        System.out.println(top);
    }
}