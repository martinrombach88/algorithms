public class HourlyEmployee extends Employee {
    //

    private double hourlyRate;

    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate, double hourlyRate) {
        super(name, birthDate, endDate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    // Overriding the original functionality (return 0.0)
    @Override
    public double collectPay() {
        double pay = Math.ceil(hourlyRate * 160);
        // Ternary operator example in Java (note the condition is in brackets in this
        // syntax)
        return pay;

    }

    public double getDoublePay() {
        double pay = collectPay();
        return pay * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "HourlyEmployee {" +
                " hourlyRate='" + hourlyRate + "'" +
                "}";
    }

}