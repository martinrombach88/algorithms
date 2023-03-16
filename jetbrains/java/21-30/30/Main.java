public class Main {
//     There is a class Person that has two fields: name and age. Your task is to implement the method changeIdentities. It should swap all information (age and name) between two persons p1 and p2.

// It is known that objects p1 and p2 can't be null.

    public static void main(String[] args) {
        Person steve = new Person();
        steve.name = "Steve";
        steve.age = 100;
        Person bucky = new Person();
        bucky.name = "Bucky";
        bucky.age = 101;

        MakingChanges.changeIdentities(steve, bucky);
        System.out.println("steve: " + steve.name + " age: " + steve.age);
        System.out.println("bucky: " + bucky.name + " age: " + bucky.age);

    }
}


class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {

        // Set temporary instances of p1 and p2
        String temp1Name = p1.name;
        int temp1Age = p1.age;
        String temp2Name = p2.name;
        int temp2Age = p2.age;

        // implement changes to original objects
        p1.name = temp2Name;
        p1.age = temp2Age;
        p2.name = temp1Name;
        p2.age = temp1Age;

    }
}
