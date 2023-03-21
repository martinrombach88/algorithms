import java.util.Scanner;
public class Main {
//    Find the first occurrence of the word "the"
//    Write a program that takes a sentence as input and returns the index of the first occurrence of the word "the" (can be part of a word), regardless of the capitalization. If there is no occurrence of it, it must output -1.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Example
        System.out.println(indexFinder("I ate the red apple", "the"));

        //User Input
        System.out.println(indexFinder(scanner.nextLine(), scanner.nextLine()));
    }

    public static int indexFinder(String sentence, String target) {
            return sentence.toLowerCase().indexOf(target.toLowerCase());
    };
}



