public class c23 {
    //Sum the Digits 

    //Break a number down and sum the digits, return the sum. (e.g. 125 = 1 + 2 + 5 = 8. Return 8.)

    //Formula 1 - n % 10 (third digit)
    //Formula n = n/10 (drop the last digit as you loop)

    public static void main(String[] args) {
        System.out.println(sumDigits(125)); //5 + 2 + 1 = 8
        System.out.println(sumDigits(1000)); //0 + 0 + 0 + 1 = 1
        System.out.println(sumDigits(1234));  //4 + 3 + 2 + 1 = 10
        System.out.println(sumDigits(-125)); //-1 (invalid)
        System.out.println(sumDigits(4)); //4 (no sum)
        System.out.println(sumDigits(32123)); // 3 + 2 + 1 + 2 + 3 = 11

    }

    public static int sumDigits(int num) {
        int result = -1;
        
        if (num > 0) {
            int total = 0;
            int breakNum = num;
            while (breakNum > 0) {
                //Modulo 10 returns lowest number
                total += breakNum % 10;
                //Dividing by 10 removes the last number, so the next number can be obtained in next iteration
                breakNum = breakNum / 10;
            }
            result = total;
        }
        return result;
    }
}
