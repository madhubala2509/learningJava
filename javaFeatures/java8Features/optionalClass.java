package javaFeatures.java8Features;

import java.util.Optional;

/*
to deal with null pointer exception in java
 */
public class optionalClass {
    public static void main(String args[]){
        String input[] = new String[5];

        Optional<String>  check = Optional.ofNullable(input[3]);
        if(check.isPresent()){
            System.out.println(check);
        }
        else{
            System.out.println("the string is empty or null");
        }

    }
}
