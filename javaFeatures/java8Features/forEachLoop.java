package javaFeatures.java8Features;
import java.util.List;
import java.util.ArrayList;

public class forEachLoop {
    public static void main(String args[]){
        List<String> li = new ArrayList<>();
        li.add("Milk");
        li.add("Egg");
        li.add("Potato");

        li.forEach(items -> System.out.println(items));
    }
}
