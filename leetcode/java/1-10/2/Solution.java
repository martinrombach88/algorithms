import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        isPalindrome(121); // true;
        isPalindrome(-121); // false;
        isPalindrome(10); // false;
    }

    public static boolean isPalindrome(int x) {
        boolean result = false;
        if (x >= 0) {
            String strX = Integer.toString(x);
            String revX = "";
            
            for (int i = 0; i < strX.length(); i++) {
                revX = strX.charAt(i) + revX;
            }

            result = strX.equals(revX) ? true : false;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}