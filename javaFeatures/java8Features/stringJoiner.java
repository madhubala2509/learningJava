package javaFeatures.java8Features;

import java.util.StringJoiner;
/*
methods: .length() , .charAt(), .add()
 */

public class stringJoiner {
    public static void main(String args[]){
        StringJoiner sj = new StringJoiner(",");
        sj.add("Apple");
        sj.add("Mango");
        sj.add("Papaya");

        System.out.println(sj);

        //Merging two string joiners

        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("Apple");
        sj1.add("Orange");

        StringJoiner sj2 = new StringJoiner(",","[","]");
        sj2.add("Potato");
        sj2.add("Tomato");

        StringJoiner mergeRes  = sj1.merge(sj2);
        System.out.println(mergeRes);
    }
}
