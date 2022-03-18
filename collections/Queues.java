package collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.PriorityQueue;
/*
queue - orders element in FIFO
priority queue - elements are stored based on priority which is ascending by default
priority queue does not follow FIFO rule
can contain duplicate elements, while removing, removes the first occurrence
cannot contain null - throws null pointer exception

methods - peek() or element() - gives the head element
poll() - retrieves and deleted the elements from the queue
remove() - removes the head element
offer(), add() - inserting
 */
public class Queues {
    public static void main(String args[]){
        Queue<String> que = new PriorityQueue<>();
        que.add("arun");
        que.add("varsha");
        que.add("bala");
        que.add("murugaa");
        que.add("nandha");
        que.offer("akash");
        que.add("akil");
        que.add("akash");

        que.remove("akash");
        System.out.println("Getting the head element "+que.element());
        //iterating queue using queue
        while(que.peek()!=null){
            System.out.println(que.poll());
        }


        // while using iterator sometimes it doesn't show the elements in ascending because of heap memory
        //so it's better to use queue methods while iterating the queue
//        Iterator itr = que.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
