public class Main {
//Workers

// Challenge - Create a class hierarchy of workers: A worker class, employee class, salaried employee and hourly employee class.
// Super: Worker class -> name: String, birthDate String, endDate String. Methods: int getAge(), double collectPay(), terminate (String endDate)
// Sub (of Worker): Employee - employeeId long, hireDate String
// Sub (of Employee): SalariedEmployee - annualSalary double, isRetired boolean, Method - retire()
// Sub (of Employee): HourlyEmployee -  hourlyPayRate double, method - getDoublePay

// Then create a main method that will create either a SalariedEmployee or HourlyEmployee
// and call the methods getAge, collectPay and the method related to the class you implemented.

    public static void main(String[] args) {
    //When we instantiate worker, we have 3 params.
    //    Worker martin = new Worker("Martin", "1988-06-05", "2022-12-12");

    //When we instantiate employee, with 3 params from worker and 2 extra params.
    // Employee martin = new Employee("Martin", "1988-06-05", "2022-12-12", 225, "2021-06-20");
    SalariedEmployee martin = new SalariedEmployee("Martin", "1988-06-05", "2022-12-12", 225, "2021-06-20", 40000, false);

    martin.getAge();
    martin.collectPay(0, 19);
    martin.terminate("2022-12-12");
    martin.retire();
    }
}