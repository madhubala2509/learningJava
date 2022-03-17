package javaFeatures.java4and5Features;

import java.util.ArrayList;
import java.util.List;

/*
traverses one element by element
used for collections or arrays
 */
public class forEachLoop {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,};
        for(int values:arr){
            System.out.println(values);
        }

        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        for(int num:li){
            System.out.println(num);
        }
    }
}
