import java.lang.annotation.Retention;
import java.util.concurrent.CountDownLatch;

public class queueUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static class Q{
        
        static Node head;
        static Node tail;
    

    public static boolean isEmpty() {
        boolean s=false;
        if(head==null && tail==null){
            s=true;

        }
        return s;
    }
   
    public static void enqueue(int data) {
        Node newNode= new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }
    public static int dequeue() {
        int s=-1;
        if(isEmpty()){
            return s;
        }
        else{
            s=head.data;
            head=head.next;
        }
        return s;
    }
    public static void peek() {
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("peek element is "+head.data);
        }
    }
    public static void printji() {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

}//end of queue
    public static void main(String[] args) {
        Q que= new Q();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.dequeue();
        que.printji();
        System.out.println();
        que.peek();

    }
}
