import java.time.LocalDate;
import java.time.Period;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate birthday = LocalDate.parse(this.birthDate);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthday, today);
        return age.getYears();
    }

    public double collectPay() {
        // Leave this as a placeholder for sub classes.
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        LocalDate lastDay = LocalDate.parse(this.endDate);
        System.out.println(name + "'s last day will be " + lastDay);
    }

    @Override
    public String toString() {
        return "Worker {" +
                "name='" + name + "'" +
                ", birthDate='" + birthDate + "'" +
                ", endDate='" + endDate + "'" +
                "}";
    }

    // double pay = 0;
    // if (salary > 0 && hourlyRate <= 0) {
    // pay = Math.ceil(salary / 12);
    // } else {
    // v
    // }
    // System.out.println("Pay for this month is $" + pay);
    // return pay;

}
