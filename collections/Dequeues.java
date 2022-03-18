package collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

/*
dequeue - insert and delete at both the ends
double ended queue with dynamic array implementation
methods - add(), addFirst(), addLast(), push(), pop(), poll(), pollFirst(), pollLast()
            descendingIterator(), element(), offer(), offerFirst(), offerLast()
            peek(), peekFirst(), peekLast(), size()
 */
public class Dequeues {
    public static void main(String args[]){
        Deque<Integer> sample = new ArrayDeque<>();
        sample.add(67);
        sample.add(8);
        sample.add(18);
        sample.addFirst(13);
        sample.addLast(5);
        sample.offer(38);
        sample.offerFirst(1);
        sample.offerLast(24);
        sample.push(42);

        System.out.println(sample);

        System.out.println("Pop "+sample.pop());
        System.out.println("Poll "+sample.poll());
        System.out.println("Poll First "+sample.pollFirst());
        System.out.println("Poll Last "+sample.pollLast());
        System.out.println("Peek "+sample.peek());
        System.out.println("Peek first "+sample.peekFirst());
        System.out.println("Peek Last "+sample.peekLast());
        System.out.println("size "+sample.size());

        System.out.println(sample);
        System.out.println("Printing queue in reverse order");
        Iterator it = sample.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
