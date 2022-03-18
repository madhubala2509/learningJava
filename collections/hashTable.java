package collections;
import java.util.Hashtable;
import java.util.Map;

/*
hash table - array of lists
contains unique element , does not allow null elements
methods - put(), putAll(), putIfAbsent(), getOrDefault(), remove()
 */
public class hashTable {
    public static void main(String args[]){
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"a");
        ht.put(2,"b");
        ht.put(5,"k");
        ht.put(8,"m");

        for(Map.Entry map:ht.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
