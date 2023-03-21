import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //PSEUDO
        //Convert to long to pass tests
        String[] scan = scanner.nextLine().split(" ");
        long num1 = Long.parseLong(scan[0]);
        String operator = scan[1];
        long num2 = Long.parseLong(scan[2]);


        switch(operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                if(num1 == 0 || num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                System.out.println(num1 / num2);
                }

                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }


    }
}