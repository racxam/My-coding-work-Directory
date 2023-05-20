import java.rmi.StubNotFoundException;
import java.util.*;
public class arraydequepro {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.offer(1);
        ad.offer(2);
        ad.offerFirst(0);
        ad.offerLast(3);

        Iterator<Integer> itr= ad.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Our queue is "+ad);
        System.out.println(ad.peek());
        System.out.println("Our queue is "+ad);
        System.out.println(ad.peekFirst());
        System.out.println("Our queue is "+ad);
        System.out.println(ad.poll());
        System.out.println("Our queue is "+ad);
        System.out.println(ad.pollFirst());
        System.out.println("Our queue is "+ad);
        System.out.println(ad.pollLast());
        System.out.println("Our queue is "+ad);



    }
}
