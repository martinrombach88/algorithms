import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] box1 = scanner.nextLine().split(" ");
        String[] box2 = scanner.nextLine().split(" ");
        processBoxes(box1, box2);
    }

    public static void processBoxes(String[] box1Scan, String[] box2Scan) {
        //check - will b1 fit inside b2 of x
        //1. if none fit in x, incompatible
        //2. if fits in x, check y and check z
        int[] b1 = sortBox(box1Scan);
        int[] b2 = sortBox(box2Scan);
        if (b1[0] > b2[0] && b1[1] > b2[1] && b1[2] > b2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (b1[0] < b2[0] && b1[1] < b2[1] && b1[2] < b2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }

    public static int[] sortBox(String[] box) {
        ArrayList boxList = new ArrayList<>();
        for (String num : box) {
            boxList.add(Integer.parseInt(num));
        }
        boxList.sort(Comparator.reverseOrder());

        int[] boxArray = new int[box.length];

        for (int i = 0; i < boxList.size(); i++) {
            boxArray[i] = (int) boxList.get(i);
        }

        return boxArray;
    }
}
