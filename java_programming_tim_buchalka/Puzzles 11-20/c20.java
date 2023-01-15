public class c20 {
    //For 1 to 1000, add together the first 5 numbers that can be divided both by 3 AND 5.
    //Print each number and the sum of these 5 numbers.
    public static void main(String[] args) {
        int totalMax = 0;
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            if (totalMax == 5) {
                System.out.println("Sum of nums = " + total); //Output: 225
                break;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i); //Output: 15, 30, 45, 60, 75
                total += i;
                totalMax ++;
            } 
        }
    }
}
