public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    private String name;

    public Car() {
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

        public String startEngine() {
            return this.getClass().getSimpleName() + " -> startEngine()";
    }
        public String accelerate() {
            return this.getClass().getSimpleName() + " -> accelerate()";
    }

        public String brake() {
            return this.getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}