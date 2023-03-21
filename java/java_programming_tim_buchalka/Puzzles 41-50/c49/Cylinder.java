public class Cylinder extends Circle {
    // 2. Write a class with the name Cylinder that extends Circle class. The class
    // needs one field (instance variable) with name height of type double.

    // The class needs to have one constructor with two parameters radius and height
    // both of type double. It needs to call parent constructor and initialize a
    // radius field.

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        // ternaries must be assigned to a variable
        this.height = height <= 0 ? 0 : height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.getArea() * this.height;

    }
}