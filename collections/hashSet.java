package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/*
hash table for storage
does not maintain insertion order
unique elements only , permits null
methods : add(), addAll(), remove(), removeAll(), clear(), removeIf()
we can also create user defined hashset : HashSet<College> hs1 =new HashSet<>();
 */
public class hashSet {
    public static void main(String args[]){
        HashSet<String> names = new HashSet<>();
        names.add("madhu");
        names.add("kavi");
        names.add("kani");
        names.add("kiru");
        names.add("madhu");    //avoids duplicate elements

        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //using removeIf
        names.removeIf(str->str.contains("a"));
        System.out.println(names);

        //hashSet from another collection
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(23);
        ll.add(45);
        ll.add(67);
        HashSet<Integer> hs1 = new HashSet<>(ll);
        hs1.add(89);
        System.out.println(hs1);
    }
}
