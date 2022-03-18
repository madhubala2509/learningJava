package collections;
import java.util.Iterator;
import java.util.LinkedList;
/*
methods: add(), addAll(), addFirst(), addLast()
remove(), removeAll(), removeFirst(), removeLast(), removeFirstOccurrence(), removeLastOccurrence(), clear()
we can also user defined linkedList:LinkedList<College> ll = new LinkedList<>();
 */
public class linkedLists {
    public static void main(String args[]){
        LinkedList<String> fruits = new LinkedList<>();
        //adding elements
        fruits.add("apple");
        fruits.add("mango");
        fruits.add(1,"watermelon");
        fruits.addLast("Banana");
        fruits.addFirst("Banana");
        fruits.add("apple");

        //reversing the list
        System.out.println("Reversing the list");
        Iterator itr = fruits.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //removing elements
        fruits.removeFirstOccurrence("apple");
        fruits.removeLastOccurrence("Banana");
        System.out.println("After removing"+fruits);
    }
}
