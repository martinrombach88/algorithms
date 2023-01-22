public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    //Static id ready for implementation 
    //(if non static, every instance would have a new employeeNo with property of 1)
    private static int employeeNo = 1;
    
    public Employee(String name, String birthDate, String endDate, String hireDate) {

        super(name, birthDate, endDate);
        //Increment the employee id
        this.employeeId = Employee.employeeNo++; //employeeId set to number, employeeNo permanently += 1
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    public long getEmployeeId() {
        return this.employeeId;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    //Adding the code below shows how the object is both a Worker and an Employee in the string provided.
    @Override
    public String toString() {
        return super.toString() + " Employee {" +
            " employeeId='" + employeeId + "'" +
            ", hireDate='" + hireDate + "'" +
            "}";
    }
    

}
