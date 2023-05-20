import java.util.*;

import javax.lang.model.element.QualifiedNameable;



public class que {
    public static void main(String[] args) {
        System.out.println("Here we'll learn about the queue");
        Queue<String> nq= new LinkedList<>();
        nq.offer("Hello");
        nq.offer("i");
        nq.offer("am");
        nq.offer("Sumit");
        nq.offer("Jhaldiyal");

        Iterator<String> itr= nq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nOur nq named queue is : "+nq);
        System.out.println(nq.poll());
        System.out.println("\now nq named queue is : "+nq);

        // here peek means which element can be poped
        System.out.println(nq.peek()+" is the next element to be peeked ");



    }
}
