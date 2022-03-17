package javaFeatures.java4and5Features;
import java.util.ArrayList;
import java.util.List;
public class Generics {
    //generic method
    static<E> void print(E[] elements){
        for(E e:elements){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();    //type safety
        li.add(1);
        //li.add("1");   throws error at compile time itself
        li.add(2);
        li.add(3);

        int res = li.get(0);  //no type casting is required

        Integer arr[] = {1,2,3,4,5};
        Character ch[] = {'a','b','c','d','e'};
        print(arr);
        print(ch);

    }
}
