class Human{
    int age;
    String name;
    void set_information(int age, String name){
        this.age=age;
        this.name=name;
    }
    void get_information(){
        System.out.println(this.name+" is "+this.age+" years old.");
    }
}

class Employee extends Human{
    String employeeCode;
    float salary;
    void set_information(int age,String name,String employeeCode,float salary){
        this.age=age;
        this.name=name;
        this.employeeCode=employeeCode;
        this.salary=salary;
    }
    void get_information(){
        System.out.println(this.name+" is "+this.age+" years old. Also, the employee code is :"
        +this.employeeCode+" and they earn "+this.salary+"INR");
    }

}
public class InheritanceDemo{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.set_information(20, "Hamza Ali Rizvi", "17103008", 30_000.0f);
        e1.get_information();
    }
}