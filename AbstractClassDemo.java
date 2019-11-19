//Abstract classes cannot be instantiated
//It can have abstract or non abstract methods
//It needs to be extended and then implemented
//abstract methods only have method declarations and no body
abstract class Vehicle{
    String name;
    public String getName(){
        return name;
    }
    abstract public void move();//no body
    //A class has to be abstract for it to have an abstract method in it.
}
class Car extends Vehicle{
    public void move() {
        System.out.println("The car moved");
        //super.move() I cannot access the abstract method directly since it's just a declaration
    }
}
class Toyota extends Car{
    public void move2(){
        System.out.println("The toyota moved");
    }
}
public class AbstractClassDemo{
    public static void main(String[] args){
        Car honda =new Car();
        honda.move();
        Toyota supra=new Toyota();
        supra.move();
        supra.move2();
    }
}