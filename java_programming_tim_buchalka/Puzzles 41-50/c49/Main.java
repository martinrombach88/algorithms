public class Main {
    // Cylinder
    // 1. Write a class with the name Circle. The class needs one field (instance
    // variable) with name radius of type double.

    // The class needs to have one constructor with parameter radius of type double
    // and it needs to initialize the fields.

    // In case the radius parameter is less than 0 it needs to set the radius field
    // value to 0.

    // 2. Write a class with the name Cylinder that extends Circle class. The class
    // needs one field (instance variable) with name height of type double.

    // The class needs to have one constructor with two parameters radius and height
    // both of type double. It needs to call parent constructor and initialize a
    // radius field.

    // In case the height parameter is less than 0 it needs to set the height field
    // value to 0.

    public static void main(String[] args) {
        Circle circle = new Circle(3.75); // circle.radius= 3.75
        System.out.println("circle.radius= " + circle.getRadius()); // circle.area= 44.178646691106465
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius()); // cylinder.radius= 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight()); // cylinder.height= 7.25
        System.out.println("cylinder.area= " + cylinder.getArea()); // cylinder.area= 96.76890771219959
        System.out.println("cylinder.volume= " + cylinder.getVolume()); // cylinder.volume= 701.574580913447
    }

}