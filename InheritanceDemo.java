class Human {
    int age;
    String name;
    Address address = new Address();// aggregation

    void set_information(final int age, final String name, final String streetName, final String pin) {
        this.age = age;
        this.name = name;
        this.address.set_address(streetName, pin);
    }

    void get_information() {
        System.out.println(this.name + " is " + this.age + " years old.");
    }
}

class Address {
    String streetName;
    String pinCode;

    void set_address(final String n, final String pin) {
        this.streetName = n;
        this.pinCode = pin;
    }
}

class Employee extends Human {
    String employeeCode;
    float salary;

    void set_information(final int age, final String name, final String streetName, final String pin,
            final String employeeCode, final float salary) {
        this.age = age;
        this.name = name;
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.address.set_address(streetName, pin);
    }

    void get_information() {
        System.out
                .println(this.name + " is " + this.age + " years old. Also, his employee code is :" + this.employeeCode
                        + " and he earns " + this.salary + "INR per month." + "He lives at " + this.address.streetName);
    }

}

public class InheritanceDemo {
    public static void main(final String[] args) {
        final Employee e1 = new Employee();
        e1.set_information(20, "Hamza Ali Rizvi", "Himalaya Hostel", "160012", "17103008", 30_000.0f);
        e1.get_information();
    }
}