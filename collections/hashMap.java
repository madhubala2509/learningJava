package collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/*
hashmap - does not maintain insertion order , can contain one null key and many null values
methods: put(), putAll(), putIfAbsent(), remove(), replace(), replaceAll()

 */
public class hashMap {
    public static void main(String args[]){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"arun");
        mp.put(5,"akash");

        Map<Integer,String> mp1 = new HashMap<>();
        mp1.put(2,"anitha");
        mp.put(3,"ananthi");

        mp.putAll(mp1);

        mp.putIfAbsent(4,"akshaya");
        mp.putIfAbsent(5,"hello");

        for(Map.Entry map:mp.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

        //comparingKey
        System.out.println();
        mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println();

        //comparingKey in descending oder
        mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println();

        //comparingValue
        mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println();

        //comparingValue in descending order
        mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

        //removing elements
        mp.remove(2);

        mp.replace(1,"arun","aarun");

        System.out.println(mp);
    }
}
