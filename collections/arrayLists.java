package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*
methods: get(), set(), add(), addAll(anotherList), remove(), removeAll(anotherList), clear()
size(), capacity(), retainAll(anotherList), isEmpty(), removeIf()
Collections.sort()
 */
class College{
    String name;
    int code;
    int rating;
    College(int code,String name,int rating){
        this.code = code;
        this.name = name;
        this.rating = rating;
    }
}
public class arrayLists {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Madhu");
        names.add("Kavi");
        names.add("Vijay");
        names.add("Gokul");

        //printing arraylist
        System.out.println(names);

        //printing using iterator
        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //get and set methods
        String u1 = names.get(1);
        System.out.println("User at index 1 is "+u1);

        names.set(2,"Kani");
        names.set(3,"Kiru");
        System.out.println(names);

        //sorting
        Collections.sort(names);
        System.out.println("After sorting");
        System.out.println(names);

        //adding elements
        names.add("kavya");
        names.add(1,"amuthan");
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("prakash");
        names1.add("pragathi");
        names.addAll(2,names1);
        System.out.println(names);

        //removing elements
        names.remove("prakash");
        names.remove(6);
        System.out.println("After using remove"+names);

        names.removeAll(names1);
        System.out.println("After using removeAll"+names);

        //names.clear(); --> clears the entire list
        System.out.println(names.size());

        //user defined arraylist
        ArrayList<College> col = new ArrayList<>();
        col.add(new College(101,"abcd",5));
        col.add(new College(102,"efgh",4));
        col.add(new College(107,"lmnop",4));
        for(College cc1:col){
            System.out.println(cc1.name);
        }
    }
}
