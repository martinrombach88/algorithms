public class c39 {
    //Paint Job
    // Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

    // The getBucketCount method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. If params < 0, return -1. Else, calculate and return the number of buckets he needs.
    // Add a second overloaded getBucketCount method without the 'extra buckets' param, as Bob doesn't like using it.

    public static void main(String[] args) {
        //Original Method
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); //returns 3
        //The wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); //returns -1

        //Overloaded Method 1
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); //returns -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); //→ should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); //→ should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.

        //Overloaded Method 2
        System.out.println(getBucketCount(3.4, 1.5)); 
        // → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
        System.out.println(getBucketCount(6.26, 2.2)); 
        // → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
        System.out.println(getBucketCount(3.26, 0.75));
        // → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double area = width * height;
        double result = Math.ceil((area / areaPerBucket) - extraBuckets);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            return (int) result;
        }   
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double area = (width * height);
        int result = (int) Math.ceil(area / areaPerBucket);

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            return result;
        }   
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int result = (int) Math.ceil(area / areaPerBucket);
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            return result;
        }   
    }
}
