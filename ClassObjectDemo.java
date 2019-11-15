class Student{
    private String name;
    private int age;
    Student(String s, int a){
        this.name=s;
        this.age=a;
        Student.increaseCount();
    }
    void display(){
        System.out.println(this.name+" is "+this.age+" years old. ");
    }
    void sayHello(){
        System.out.println("Hello");
    }
    void saySomething(){
        this.sayHello();
    }
    protected void finalize(){//this function is run when the object is just about to be claimed by the garbage collector.
        System.out.println("Inside finalize");
    }
    //Method Overloading ~ can only be done by changing number of arguments and/or changing data type of arguments. Not changin return type
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    //NOTE: You can also overload the main() method but JVM will only call the one with string array as argument
    //Static Methods-> Belongs to a class and is shared among instances
    //-> They can only call other static methods and can only access static data
    static int count=0;
    static void increaseCount(){
        count+=1;//only work on static variables
        Student.showCount();//only call other static methods
    }
    static void showCount(){
        System.out.println("Number of instances of class Student: "+count);
    }
    static{
        System.out.println("This static block code is run only when the class Student is loaded into memory.");
    }
    static{
        System.out.println("You can have multiple static blocks in a class, but why would you?( Just because you can huh?)");
    }
}
public class ClassObjectDemo{
    public static void main(String[] args){
        Student s=new Student("Hamza",20);
        s.display();
        
        Student s2=new Student("Haider",16);
        s2.display();
        System.out.println("Function Overloading");
        System.out.println(s.add(23, 46));
        System.out.println(s.add(23,43,3));
        
        short a=2;
        short b=3;
        System.out.println(s.add(a, b));//type promotion. short got promoted to int. byte->short->int->float or long or double
        
    }
}