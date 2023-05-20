//we can access the Queue Data structure from Collection framework by 2 means
//1. linked list 
//2. Arraydeque 
// so arraydeque is better than linked list access because of some reason
// Queue is a interface in java and linked list and array deque are the classes of java so , we can only make the instances of classes not of interfaces

// 
import java.util.*;
public class queueusingCOLL {
    public static void main(String[] args) {
     Queue<Integer> q= new LinkedList<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);
     q.add(6);
     while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();

     }
     
     
    }
}


