public class c39 {
//     Paint Job
    // Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

    // The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. If params < 0, return -1. Else, calculate and return the number of buckets he needs.

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); //returns 3
        //The wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); //returns -1
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double area = width * height;
        //Incorrect but good guess, return some correct answers.
        double result = Math.round((area / areaPerBucket) - extraBuckets);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            return (int) result;
        }   
    }

//     public static double getBucketCount(double width, double height, double areaPerBucket) {
        
//     }
}
