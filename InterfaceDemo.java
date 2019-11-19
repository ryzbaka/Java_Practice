//while an abstract class can have both abstract and non abstract methods
//an interface can only have abstract methods.
//Multiple inheritance is hence possible through interfaces as there would be no ambiguity
//The implementation of the methods would be clearly defined in the class that implements the interface.
interface Animal{
    void saySomething();
    void doSomething();
}
interface Mammal{
    void growHair();
}
class Sheep implements Animal,Mammal{
    @Override
    public void saySomething(){
        System.out.println("Ba.");
    }
    @Override
    public void doSomething(){
        System.out.println("Ate grass");
    }
    @Override
    public void growHair(){
        System.out.println("The sheep grew hair.");
    }
}
public class InterfaceDemo{
    public static void main(String[] args){
        Sheep sean=new Sheep();
        sean.saySomething();
        sean.growHair();
    }
}