package javaFeatures.java7Features;

import java.util.ArrayList;
import java.util.List;
/*
java compiler is smart to infer the type of generic instance
 */

public class typeInference {
    public static void main(String args[]){
        //Before java7
        List<Integer> li = new ArrayList<Integer>();

        //After java7
        List<Integer> liNew = new ArrayList<>();

    }
}
