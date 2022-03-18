package collections;
import java.util.Iterator;
import java.util.TreeSet;
/*
uses tree for storage - access and retrieval is fast
contains unique element, cannot contain null
maintains ascending order
methods : add(), pollFirst(), pollLast(), descendingSet(), headSet(), tailSet(), subSet()
we can create user defined TreeSet :  TreeSet<College> scores = new TreeSet<>();
 */
public class treeSet {
    public static void main(String args[]){
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(198);
        scores.add(174);
        scores.add(121);
        scores.add(220);
        scores.add(111);
        //scores.add(null); ->throws NullPointerException

        Iterator itr = scores.iterator();
        itr.forEachRemaining(items->System.out.println(items));

        System.out.println("Descending set "+scores.descendingSet());
        System.out.println("Headset "+scores.headSet(174));
        System.out.println("Tailset "+scores.tailSet(174));
        //from element will be included but to element will not be included
        System.out.println("Subset "+scores.subSet(111,198));

        System.out.println("Highest value is "+scores.pollLast());  //removes the first and last element from the set
        System.out.println("Lowest value is "+scores.pollFirst());
    }
}
