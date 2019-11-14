import java.util.Vector;
public class Vectors{
    public static void main(String[] args) {
        Vector v=new Vector(0);
        System.out.println("Capacity: "+v.capacity());
        System.out.println("Size: "+v.size());
        System.out.println("Is empty? "+v.isEmpty());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        System.out.println("Inserted 3 elements");
        System.out.println("Capacity: "+v.capacity());
        v.addElement(4);
        System.out.println("Added one more element");
        System.out.println(v.capacity());
        v.addElement(6);
        System.out.println("Added one more element");
        System.out.println("Capacity: "+v.capacity());
        System.out.println("Size: "+v.size());
        for(int i=0;i<v.size();i++){
            System.err.println("Element: "+v.elementAt(i));
        }
        System.out.println("First element "+v.firstElement());
        System.out.println("Last element "+v.lastElement());
        System.out.println("Is empty?"+v.isEmpty());
        System.out.println(v.indexOf(6));
        System.out.println(v.toString());
        v.trimToSize();//trims the size of the capacity of the vector to its size 
        System.out.println("Capacity: "+v.capacity());
        System.out.println("Size: "+v.size());
    }
}