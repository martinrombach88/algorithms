import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //PSEUDO
        //Convert everything into one seconds total
        //minutes = minutes + hours * 60
        //seconds = seconds + minutes * 60

        //How much time is there between the two times?
        //seconds 2 - seconds 1

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = Integer.parseInt(scanner.nextLine());
        int minutes1 = Integer.parseInt(scanner.nextLine());
        int seconds1 = Integer.parseInt(scanner.nextLine());
        int hours2 = Integer.parseInt(scanner.nextLine());
        int minutes2 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        minutes1 = minutes1 + (hours1 * 60);
        seconds1 = seconds1 + (minutes1 * 60);
        minutes2 = minutes2 + (hours2 * 60);
        seconds2 = seconds2 + (minutes2 * 60);
        System.out.println(seconds2 - seconds1);

    }


}