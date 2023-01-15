public class c35 {
    //Diagonal Star
    // Write a method named printSquareStar with one parameter of type int named number. 

    // If number is < 5, the method should print "Invalid Value".

    // The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

    //Note: It's looks more like a cross in a box than a star!

    public static void main(String[] args) {
        printSquareStar(5);
        //Print:
        // *****
        // ** **
        // * * *
        // ** **
        // *****
        
        printSquareStar(8);
        //Print:
        // ********
        // **    **
        // * *  * *
        // *  **  *
        // *  **  *
        // * *  * *
        // **    **
        // ********

        // printSquareStar(25); //Makes huge cross box
    }   
    
    public static void printSquareStar(int n) {
        //If less than 5, can't build star with console
        if (n < 5) {
            System.out.println("Invalid value.");
        }
        //Make rows 
        for (int row = 1; row < (n + 1); row ++) {
            System.out.println("");
            for (int col = 0; col < n; col++) {
                if (row == 1 || row == n) {
                    System.out.print("*");
                } else {
                    //This condition decides when to print star
                    //Use breakpoints to check whether you print in the right place
                    //col == 0 --> always print first column
                    //col == row - 1 --> makes diagonal line down and right
                    //col == (n - row) --> makes diagonal line down and left
                    //col == (n-1) --> always print last column
                    if (col == 0 || col == (row - 1) || col == (n - row) || col == (n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    
                }
            }

        }
    }
}