public class c33 {
    //     Flour Pack Problem
    // Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 

    // The parameter bigCount represents the count of big flour bags (5 kilos each).

    // The parameter smallCount represents the count of small flour bags (1 kilo each).

    // The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

    // Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.
    
    public static void main(String[] args) {
        // System.out.println(canPack (1, 0, 4)); 
        // //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

        // System.out.println(canPack (1, 0, 5)); 
        // //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

        // System.out.println(canPack (0, 5, 4)); 
        // // should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

        // System.out.println(canPack (2, 2, 11)); 
        // // should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 

        // System.out.println(canPack (-3, 2, 12));
        // // should return false since bigCount is negative.

        // System.out.println(canPack (2, 1, 5)); //returns true 1 big bag covers the goal

        System.out.println(canPack (26, 0, 70));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //1. Check negative results
        //2. Check if goal is too large
        //3. A condition to check bigCount and smallCount additions
        
        if (goal < 0 || smallCount < 0 || bigCount < 0) {
            //If you return here, the code block following doesn't affect the results.
            return false;
        //Anything greater than goal returns as false.
        } else if (goal > ((bigCount * 5) + smallCount)) {
            return false;
        
        //Additional bags
        //Divide by 5 (bigCount is worth 5 so modulo cuts down to small count left)
        
        //Why does this handle large big counts? 
        //With modulo, the code doesn't try to use every bigCount, it checks if 5 can go into it.
        //by showing us the division of five and the remainder.
        //If the goal is too big for bigCount, it's already handled in line 43.
        //If bigCount is big and smallCount is zero, it's safe to say it fits when dividing by 5.
        //Which means after dividing by 5, you can compare smallCount with the remainder.

        //If the remainder is bigger than small count, return false.
        } else {
            // int remainder =  goal % 5;
            // System.out.println(remainder);
            return (goal % 5 <= smallCount);
        
        //Udemy Eddie - Alternative while loop for this part:

        //Here Eddie uses a version of goal and bigCount consumed in this is scope in a whileLoop
        //The logic similar to modulo, break down goal by 5. 
        //By deleting in these increments, eventually either bigCount will equal 0, 
        //or goal will be less than 5, 
        //therefore ready to compare with smallCount.
            // while (bigCount > 0 && goal >= 5) {
            //     goal -= 5;
            //     bigCount--;
            // }
            // return smallCount >= goal; 
        }

    }
}