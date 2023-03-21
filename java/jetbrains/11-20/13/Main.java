import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String[] userIndexes = scanner.nextLine().split(" ");
        int start = Integer.parseInt(userIndexes[0]);
        int end = Integer.parseInt(userIndexes[1]) + 1;
        System.out.println(userString.substring(start, end));
    }
}