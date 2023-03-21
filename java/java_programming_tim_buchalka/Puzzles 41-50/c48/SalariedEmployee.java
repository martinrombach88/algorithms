public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        // Tim doesn't include 'isRetired' in the constructor. The default false,
        // and we want the user to call retire to change the nature of this variable.
        // Users shouldn't need to specify whether a new employee is retired.
    }

    public void retire() {
        if (this.isRetired) {
            System.out.println(this.name + " is already retired.");
        } else {
            System.out.println(this.name + " decided to retire on " + this.endDate + ".");
            System.out.println("Best of luck " + name + "!");
            isRetired = true;
        }
    }

    // Overriding the original functionality (return 0.0)
    @Override
    public double collectPay() {
        double pay = Math.ceil(this.annualSalary / 12);
        // Ternary operator example in Java (note the condition is in brackets in this
        // syntax)
        double adjustedPay = (isRetired) ? pay * 0.9 : pay;
        return adjustedPay;

    }

    @Override
    public String toString() {
        return super.toString() + " SalariedEmployee {" +
                " annualSalary='" + annualSalary + "'" +
                ", isRetired='" + isRetired + "'" +
                "}";
    }

}
