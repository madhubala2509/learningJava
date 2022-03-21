package collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
maintains insertion oder,can contain one null key and many null values
methods - put(), putAll(), putIfAbsent(), remove(), replace, getOrDefault()
 */
public class linkedHashMap {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> sub = new LinkedHashMap<>();
        sub.put(101,"maths");
        sub.put(102,"english");
        sub.put(107,"physics");
        sub.put(111,"chemistry");

        for(Map.Entry mp:sub.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        //fetching keys
        System.out.println("Keys "+sub.keySet());

        //fetching vales
        System.out.println("Values "+sub.values());

        //fetching key,value pair
        System.out.println("Key-value pair"+sub.entrySet());

        System.out.println("get or default "+sub.getOrDefault(1,"Key is missing"));
    }
}
