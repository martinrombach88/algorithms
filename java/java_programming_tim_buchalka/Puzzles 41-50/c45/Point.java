public class Point {
    private int x;
    private int y;


    public Point() {
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.

    public double distance() {
        return Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));

        //Helper function not allowed by challenge.
        // return calcDistance(0, this.y, 0, this.x);
    }

    // Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.

    public double distance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

        // return calcDistance(y, this.y, x, this.x);
    }

    // Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

    public double distance(Point xy){
        return Math.sqrt((this.x - xy.x) * (this.x - xy.x) + (this.y - xy.y) * (this.y - xy.y));
    }
    
    // public double calcDistance(int yA, int yB, int xA, int xB){
    //     return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    // }
}
