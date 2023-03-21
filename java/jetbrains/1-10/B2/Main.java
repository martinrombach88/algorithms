public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //prints before condition, so 3 even tho i < 3 in if
            System.out.println("i " + i);
            if (i < 3) {
                continue;
                //once i hits 3, only the j code is run
            } else {
                //j code only runs when i > 3 and i < 5
                for (int j = 0; j < 5; j++) {
                    System.out.println("j " + j);
                }
            }
        }
    }

    //Output: 0, 1, 2, 3, 0, 1, 2, 3, 4, 4, 0, 1, 2, 3, 4
}
