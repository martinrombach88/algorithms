public class Challenge10 {
    //Method Overloading
    //Methods with the multiple copies under the same name are known as 'Overloaded methods'
    //When you run these methods, Java works out which one you need based on the parameters

    //Create 2 methods called convertToCentimeters. 
    //First method takes height in inches as parameter. Returns centimeters as double.
    //Second method takes 1 parameter for feet, 1 for inches. Returns centimeters as double.

    //1 inch = 2.54cm.
    //1 feet = 6 inches.

    public static void main(String[] args) {
        System.out.println("My height is " + convertToCentimeters(67) + "cm"); //170.18
        System.out.println("My height is " + convertToCentimeters(5, 6)+ "cm"); //167.64
        System.out.println("My height is " + convertToCentimeters(6, 0)+ "cm"); //182.88
    }
    private static double convertToCentimeters(int inches) {
        double centimeters = 0;
        centimeters = inches * 2.54; 
        return centimeters;
    }

    private static double convertToCentimeters(int feet, int inches) {
        //Simple formula: feet times 12, then call the first method.
        //Key lesson: Converting the bigger value to the smaller value is easier
        //than the other way around. (feet * 12 is easier than feet + inches converted to fraction)

        //Mistake: Attempted to convert inches to a fraction of feet, then add to feet double. 
        //This needlessly complicated the process, with a much more difficult conversion method.

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double combined = convertToCentimeters(totalInches);
        return combined;

    }

}
