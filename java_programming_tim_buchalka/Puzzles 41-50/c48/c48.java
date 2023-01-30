public class c48 {
    // Workers

    // Challenge - Create a class hierarchy of workers: A worker class, employee
    // class, salaried employee and hourly employee class.
    // Super: Worker class -> name: String, birthDate String, endDate String.
    // Methods: int getAge(), double collectPay(), terminate (String endDate)
    // Sub (of Worker): Employee - employeeId long, hireDate String
    // Sub (of Employee): SalariedEmployee - annualSalary double, isRetired boolean,
    // Method - retire()
    // Sub (of Employee): HourlyEmployee - hourlyPayRate double, method -
    // getDoublePay

    // Then create a main method that will create either a SalariedEmployee or
    // HourlyEmployee
    // and call the methods getAge, collectPay and the method related to the class
    // you implemented.

    // NOTE: If you can't use the sysout shortcut, check you are within a method.
    public static void main(String[] args) {
        // When we instantiate worker, we have 3 params.
        Worker martin = new Worker("Martin", "1988-06-05", "2022-12-12");

        System.out.println(martin.toString());
        System.out.println(martin.name + " is " + martin.getAge() + " years old.");
        martin.terminate("2023-05-13");
        System.out.println(martin.name + " is leaving on " + martin.endDate + ".");

        // When we instantiate employee, with 3 params from worker and 2 extra params.

        Employee steve = new Employee("Steve", "1987-03-22", null, "2021-05-04");

        System.out.println("");
        System.out.println(steve.toString());
        System.out.println(steve.name + " is " + steve.getAge() + " years old.");
        System.out.println(steve.name + " was hired on " + steve.getHireDate());

        // Employee ids are being incremented.
        Employee mary = new Employee("Mary", "1988-04-28", null, "2020-03-04");
        System.out.println("");
        System.out.println(mary.toString());

        System.out.println("");
        Employee terry = new SalariedEmployee("Terry", "1968-07-30", null, "1999-01-01", 900000);
        System.out.println(terry.toString());
        System.out.println("This month, " + terry.name + " earned $" + terry.collectPay());

        System.out.println("");
        SalariedEmployee ryan = new SalariedEmployee("Ryan", "1945-06-05", "2023-01-22", "1977-09-01", 50000);
        System.out.println(ryan.toString());
        ryan.retire();

        System.out.println("");
        HourlyEmployee dave = new HourlyEmployee("Dave", "1978-02-26", null, "2021-04-01", 20);
        System.out.println(dave.toString());
        System.out.println("This month, " + dave.name + " earned $" + dave.collectPay());
        System.out.println("This month, " + dave.name + " earned double: $" + dave.getDoublePay());
    }

}