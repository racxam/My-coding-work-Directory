

public class stack {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data) {
            Node newNode= new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            



        }
        public static int pop() {
            if(isEmpty()){

                return -1;
            }
            else{
                int temp= head.data;
                head= head.next;
                return temp;

            }
        }
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            else{
               
                return head.data;
            }

        }
       public static void pushbtm(int data) {
        Node newNode= new Node(data);
        if(isEmpty()){
            head=newNode;
        }
        else{
            Node curr= head;
            while(curr.next!=null) {
                curr=curr.next;
                
            }
            curr.next=newNode;
            

        }
       }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        s.pushbtm(67);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println(s.pop());
        }
    }
}
