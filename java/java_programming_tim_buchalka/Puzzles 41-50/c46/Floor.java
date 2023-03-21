public class Floor {
    private double width;
    private double length;


    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

        //Eddie: Using a ternary
        // this.width=(width<0) ? 0 : width;
        // this.length=(length<0) ? 0 : length;
    }
    
    public double getArea() {
        return this.width * this.length;
    }

    
}
