public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
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
    
}
