import java.util.*;

public class two {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("head: "+q.peek());
        System.out.println("head: "+q.element());

        Iterator itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        q.remove();
        q.peek();
        System.out.println("after removal");
        Iterator itr1 = q.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
