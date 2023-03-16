public class c2 {
        
// Write a method called checkNumber with an int parameter number.

// The method should not return any value, and it needs to print out:
// "positive" if the parameter number is > 0
// "negative" if the parameter number is < 0
// "zero" if the parameter number is equal to 0

// NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-1);  
        checkNumber(1);
    }

    public static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("zero");
        } else if (num < 0){
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }

}