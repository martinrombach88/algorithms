public class Circle {
    // 1. Write a class with the name Circle. The class needs one field (instance
    // variable) with name radius of type double.

    // The class needs to have one constructor with parameter radius of type double
    // and it needs to initialize the fields.

    // In case the radius parameter is less than 0 it needs to set the radius field
    // value to 0.

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = (radius <= 0) ? 0 : radius;
    }

    public double getRadius() {

        return this.radius;
    }

    public void getArea() {
        this.radius = (radius * radius) * Math.PI;
    }
}
