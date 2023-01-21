import java.time.LocalDate;
import java.time.Period;


public class Worker {
    private String name;
    private String birthDate;
    private String endDate;


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

    public double collectPay(double salary, double hourlyRate) {
        double pay = 0;
        if (salary > 0 && hourlyRate <= 0) {
            pay = Math.ceil(salary / 12);
        } else {
            pay = Math.ceil(hourlyRate * 160);
        }
        System.out.println("Pay for this month is $" + pay);
        return pay;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        LocalDate lastDay = LocalDate.parse(this.endDate);
        System.out.println("Termination confirmed. " + name + "'s last day will be " + lastDay);
    }
}
