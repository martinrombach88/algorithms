public class c34mentor { 
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(55));
        System.out.println(isPrime(6));
    }
 
 private static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        int hcf = findHcf(num);
        if (hcf == num) {
            return true;
        } else {
            return false;
        }
    }

 private static int findHcf(int num) {
        boolean foundLcf = false;
        int testnum = 2;
        int result = num;
        while (!foundLcf && testnum < num) {
            if (num % testnum == 0) {
                result = num/testnum;
                foundLcf = true;
            }
            testnum = testnum + 1;
        }
        return result;
    }

}