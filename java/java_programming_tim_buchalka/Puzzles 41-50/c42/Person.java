public class Person {
    private String firstName;
    private String lastName;
    private int age;
    

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
    
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }
    
    public String getFullName() {
        String result = " ";
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
           result = this.firstName + " " + this.lastName;
        } else if (this.firstName.isEmpty() && this.lastName != null){
            result = this.lastName;
        } else if(this.firstName != null && this.lastName.isEmpty()) {
            result = this.firstName;
        } 
        return result;
       
    }

}
