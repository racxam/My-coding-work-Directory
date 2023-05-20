import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        //uses minheap

         Queue<Integer> q= new PriorityQueue<>();
        //  Queue<Integer> q= new PriorityQueue<>(Comparator.reverseOrder());// changes min heap to max heap
        //max heap mein sabse bada elelemt sabse pehle aata hai 
        // and min heap mein sabse chota element sabse pahle aata hai
         
         q.offer(40);
         q.offer(1);
         q.offer(2);
         q.offer(3);
         q.offer(4);
         q.offer(5);

         System.out.println(q);
         q.poll();
         System.out.println(q);


    }
}
