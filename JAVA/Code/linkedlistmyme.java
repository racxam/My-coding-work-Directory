import java.nio.channels.SelectableChannel;
import java.rmi.server.RemoteStub;
import java.security.DrbgParameters.NextBytes;

class linkedlistmyme {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    linkedlistmyme(){
        this.head=null;
    }
    public void addF(int data) {
       Node newNode=new Node(data);
       
       if(head==null){
          head= newNode;
          return;
       }
       else{
        newNode.next=head;
        head= newNode;
        return;

       }
        
    }
    public void addL(int data) {
        Node newNode= new Node(data);
        Node curr= head;
        if(head==null){
            head=newNode;
            return;

        }
        else{
            while (curr.next!=null) {
                curr=curr.next;

            }
            curr.next=newNode;
            return;

        }
    }
    public void addB(int data,int ind) {
        Node newNode= new Node(data);
        Node curr= head;
        if(head==null){
            head= newNode;
            return;
        }
        else{
            int i=1;
            while(i<ind){
                curr= curr.next;
                i++;
            }
            newNode.next=curr.next;
            curr.next= newNode;
            return;
        }
    }
    public void remF() {
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head= head.next;
            return;
        }
    }
    public void remL() {
        Node curr= head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while((curr.next).next!=null) {
                curr=curr.next;
            }
            curr.next= null;
        }
    }
    public void remB(int ind) {
        Node curr=head;
        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        else{
            int i=1;
            while(i<ind){
                curr=curr.next;
                i++;
            }
            curr.next=(curr.next).next;
            return;
        }
    }
    public Node reverseRecur(Node head){
        if(head==null||head.next==null){
            return head;
        }

        
        Node newHead=reverseRecur(head.next);
        (head.next).next=head;
        head.next=null;
        return newHead;}
    public void reverseIter() {
        if(head==null|| head.next==null){
            return;
        }
        Node prev=head;
        Node curr= head.next;
        while(curr!=null){
            Node nextNode= curr.next;
            curr.next=prev;
            //update
            prev= curr;
            curr=nextNode;

        }
        head.next=null;
        head=prev;
         
    }
    public void printji() {
      

        Node curr= head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{

            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }

            System.out.println("NULL");
            
        }
        
    }
    
    public static void main(String[] args) {
        linkedlistmyme list= new linkedlistmyme();
        list.addF(3);
        list.addF(2);
        list.addF(1);
        list.addL(5);
        list.addB(4, 3);
        // list.remL();
        // list.remF();
        list.remB(4);
        list.printji();
        // list.reverseIter();
        System.out.println();
        list.head=list.reverseRecur(list.head);

        list.printji();
        
    }
}
