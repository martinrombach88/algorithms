
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null || firstName != "") {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null || lastName != "") {
            this.lastName = lastName;
        }
    }


    public String getFullName() {
        if (firstName == null && lastName == null || firstName == "" & lastName == "") {
            return "Unknown";
        } else if (lastName == "" || lastName == null) {
            return firstName;
        } else if (firstName == "" || firstName == null) {
            return lastName;
        }
        return this.firstName + " " + this.lastName;

    }
}