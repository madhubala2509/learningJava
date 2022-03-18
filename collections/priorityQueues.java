package collections;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
default priority - ascending order
we can customize the priority by implementing Comparator interface
 */
public class priorityQueues implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1==o2){
            return 0;
        }
        else if(o1<o2){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Integer> sample = new PriorityQueue<>(new priorityQueues());
        sample.add(18);
        sample.add(67);
        sample.add(5);
        sample.add(13);
        sample.add(38);

        while(sample.peek()!=null){
            System.out.println(sample.poll());
        }
    }

}
