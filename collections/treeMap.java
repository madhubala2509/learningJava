package collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/*
maintains ascending order , cannot contain null key or value
methods - put(), putAll(), remove()
 */
public class treeMap {
    public static void main(String args[]){
        TreeMap<String,Integer> juices = new TreeMap<>();
        juices.put("apple",75);
        juices.put("mango",65);
        juices.put("apple",90);  //takes this and avoids the first entry


        for(Map.Entry mp:juices.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        //NavigableMap

        NavigableMap<String,Integer> trees = new TreeMap<>();
        trees.put("mango",30);
        trees.put("coconut",10);
        trees.put("banana",40);
        trees.put("jackfruit",1);
        trees.put("drumstick",2);

        System.out.println("Head map "+trees.headMap("drumstick",false));
        System.out.println("Tail map "+trees.tailMap("banana",true));
        System.out.println("Sub map "+trees.subMap("banana",true,"jackfruit",true));
        System.out.println("Descending map "+trees.descendingMap());
    }
}
