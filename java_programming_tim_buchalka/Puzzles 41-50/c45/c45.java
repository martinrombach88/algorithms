public class c45 {
//     Point
// You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance()); 
        //output: distance(0,0)= 7.810249675906654

        // System.out.println("distance(second)= " + first.distance(second));
        //output: distance(second)= 5.0
        // System.out.println("distance(2,2)= " + first.distance(2, 2));
        //output: distance(2,2)= 5.0
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        //output:distance()= 0.0
    }


}