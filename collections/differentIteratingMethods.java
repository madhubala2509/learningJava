package collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class differentIteratingMethods {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        li.add(4);
        li.add(3);
        li.add(7);
        li.add(9);

        //1.By Iterator interface
        System.out.println("By Iterator interface");
        Iterator it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //2.By for each loop
        System.out.println("By for each loop");
        for(Integer i:li){
            System.out.println(i);
        }

        //3.By list iterator interface
        System.out.println("By List Iterator interface");
        Iterator itr = li.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //4.By for loop
        System.out.println("By for loop");
        for(int j=0;j<li.size();j++){
            System.out.println(li.get(j));
        }

        //5.By for each method
        System.out.println("By for each method");
        li.forEach(items -> System.out.println(items));

        //6.By for each remaining method
        System.out.println("By for each remaining method");
       Iterator itr1 = li.listIterator();
       itr1.forEachRemaining(items -> System.out.println(items));

    }
}
