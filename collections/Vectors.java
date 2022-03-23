package collections;
import java.util.Vector;
/*
vector - dynamic array which can grow or shrink in size
used in thread safe implementation only
methods - add(), addElement(), size(), capacity(), indexOf, firstElement(), lastElement(), contains(), remove(), get()
 */
public class Vectors {
    public static void main(String args[]){
        Vector<String> vec = new Vector<String>();
        vec.add("madhu");
        vec.add("kavi");
        vec.add("gokul");
        vec.add("vijay");

        //addElement()
        vec.addElement("kani");
        vec.addElement("kiru");

        //size()
        System.out.println("Size of the vector is "+vec.size());

        //capacity()
        System.out.println("Capacity of the vector is "+vec.capacity());

        //indexOf()
        System.out.println("Index of gokul is "+vec.indexOf("gokul"));

        //firstElement() and lastElement()
        System.out.println("First element is "+vec.firstElement());
        System.out.println("Last element is "+vec.lastElement());

        //contains()
        System.out.println("Contains kavya "+vec.contains("kavya"));
        System.out.println("Contains vijay "+vec.contains("vijay"));

        //remove()
        System.out.println("after removing "+vec.remove(2));
        System.out.println(vec);

        //get
        System.out.println("Getting element at 2 "+vec.get(2));
    }
}
