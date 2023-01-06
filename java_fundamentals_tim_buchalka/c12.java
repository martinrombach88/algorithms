public class c12 {
    //Area Calculator
    //Write two overloaded methods called area

    //area 1 returns a circle area from a double parameter called radius
    //area 2 returns a square area from two double parameters x and y

    // TIP: ​The formula for calculating a circle area is radius * radius * PI.
    // TIP: For PI use a constant from Math class e.g. Math.PI
    // TIP: ​The formula for calculating the area of a rectangle is x * y.

    //area(5.0); should return 78.53975
    //area(-1);  should return -1 since the parameter is negative
    //area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
    //area(-1.0, 4.0);  should return -1 since first the parameter is negative
    public static void main(String[] args) {
        System.out.println(area(5.0)); //78.53975
        System.out.println(area(-1)); //-1
        System.out.println(area(5.0, 4.0)); //20.0
        System.out.println(area(-1.0, 4.0)); //-1
    }

    public static double area(double radius) {
        double result = 0.0;

        if (radius < 0) {
            result = -1;
        } else {
            result = (radius * radius) * Math.PI;
        }
        return result;
    }

    public static double area(double x, double y) {
        double result = 0.0;

        if (x < 0 || y < 0) {
            result = -1.0;
        } else {
            result = x * y;
        }
        return result;
    }
}
