package collections;

import java.util.*;
/*
List<Integer> numbers = new ArrayList<>(); new LinkedList<>(); new Stack<>();new Vector<>();
methods - add(), addAll(), get(), set(), Collections.sort(),

nextIndex(),hasPrevious()  -->not working

we can also user defined linkedList:List<College> ll = new ArrayList<>();

 */
public class Lists {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(6);
        numbers.add(4);

        //iterating in reverse order
        Iterator itr = numbers.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        //Array to List  --> using add method and for loop

        // List to Array
        Integer arr[] = numbers.toArray(new Integer[numbers.size()] );
    }
}
