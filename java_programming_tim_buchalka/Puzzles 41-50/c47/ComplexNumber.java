public class ComplexNumber {

    private double real;
    private double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    //Complex numbers are a mathematical concept for numbers on an extra 'i' grid that don't exist in
    //reality (i.e you can't count to 1i, 2i, 3i, 4i) but the grid system creates addition and multiplication
    //options with many applications in engineering and mathematics. It's an important concept to understand.
    //You can expect algorithms on this concept.

    //See images for examples of this grid.
    //Mathematicians endgame for complex numbers is multiplication, and while that is beyond the scope
    //of this exercise, it could be valuable to understand as it may be used in interview questions.
    //Multiplication is achieved through rotation across the grid ('turning the paper').
    //https://youtu.be/5PcpBw5Hbwo -> 1hr lecture

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    //To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.

    //When ComplexNumber is instantiated, you set a real number and an imaginary number.
    //When you call add, you use two new numbers (real and imaginary) and build on the values
    //of the original real and imaginary numbers.
    //You are mutating (does Java use this term?) the fields of the original instantiated object. 

    public void add(double real, double imaginary) {
        //Add the params to the instantiated fields
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    //When entering a class as a param, do not specify a type (e.g. double ComplexNumber).
    //If you do this, Java doesn't add the class, but a variable with the same name as the class.
    //Classes should be added like so - add(ComplexNumber variableName)
    public void add(ComplexNumber complexNumber) {
        //Add the ComplexNumber as a param to the source ComplexNumber 
        //(new ComplexNumber + orig complexNumber)
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    //This code doesn't really do any complex number calculations. The imaginary number
    //has to be entered, meaning its value is worked out before entry and added to the real number.
    //Seeing as you can't enter 3i as a parameter, the user must know the value
    //When adding together.
    //Example:
    //-2+2i + 4+i;
    //Real numbers = -2 + 4 (4 - 2) = 2
    //Imag numbers 2i + i -> You can't entered this as a param.
    //The program takes a calculated version of 2i + i as a parameter.
    
    //Review further!
    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }
}