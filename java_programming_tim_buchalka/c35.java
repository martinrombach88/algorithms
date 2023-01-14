public class c35 {
    public static void main(String[] args) {
        printSquareStar(5);
    }   
    
    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid value.");
        }
        for (int col = 1; col < n; col ++) {
            if (col > 1) {
                
                System.out.println("*");
            }
            for (int row = 1; row < 5; row++) {
                
                System.out.print("*");
            }

        }
    }
}