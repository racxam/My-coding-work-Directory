

class linkedListQue {


    Node head;
   public int size;
   linkedListQue(int s){
    this.size=s;
   }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void addF(int data) {
        Node newnode=new Node(data);
        if(head==null){
            head= newnode;
            size++;
            return;
        }
        else{
            newnode.next=head;
            head=newnode;
            size++;
            return;
        }
    }
    public void addL(int data) {
        Node newnode=new Node(data);
        Node curr= head;
        if(head==null){
            head= newnode;
            size++;
            return;
        }
        else{
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newnode;
            newnode.next=null;
            size++;
            return;
        }
    }
    public void addB(int data,int index) {
        Node newnode=new Node(data);
        Node curr= head;
        if(head==null){
            head= newnode;
            size++;
            return;
        }
        else{
           int i=1;
            while(i<=(index-1)){
                curr=curr.next;
                i++;
            }
            newnode.next=curr.next;
            curr.next=newnode;
            size++;
            return;
        }
    }
    //remove
    public void remF() {
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head= head.next;
            size--;
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
            size--;
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
            while(i<=(ind-1)){
                curr=curr.next;
                i++;
            }
            curr.next=(curr.next).next;
            size--;
            return;
        }
    }

    //que1 wala function
    public void getFromBack(int index) {
        if(index<1 || index>size){
            System.out.println("no index available");
            return;
        }
        Node curr= head;
        if(head==null){
            System.out.println("list is empty");
            return;

        }
        else{
            int srch=(this.size-index);
            int i=1;
            while(i<=srch){
                curr=curr.next;
                i++;
            }
            System.out.println(curr.data);
            return;

        }
    }
    public void deleteFromBack(int index) {
        if(index<1 || index>size){
            System.out.println("no index available");
            return;
        }
        else if(index==size){
            head=head.next;
            return;
        }
        else{

        
        Node curr= head;
        if(head==null){
            System.out.println("list is empty");
            return;

        }
        else{
            int srch=(this.size-index);
            int i=1;
            while(i<=(srch-1)){
                curr=curr.next;
                i++;
            }
            curr.next=(curr.next).next;
            size--;
            return;

           }   }
    }
    public int get(int ind) {
        if(ind<0 || ind>=size){
            return 0;
        }
        else{

            Node curr=head;
            int i=1;
            while(i<=ind){
                curr=curr.next;
                i++;
            }
            return curr.data;
        }

        
    }
    public boolean isPalindrome() {
        boolean set=true;
        // Node curr=head;
        int limit= (this.size)/2;
        for (int i = 0; i <limit; i++) {
            if(get(i)==(get((this.size-1)-i))){
                set = set && true;
            }
            else{
                set= set && false;
            }

        }
        return set;
    }
   
    public void printji() {
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.next;
        }

    }
    public static void main(String[] args) {
        linkedListQue list= new linkedListQue(0);
        list.addF(2);
        list.addF(2);
        list.addF(1);
        list.addB(4, 2);
        list.addL(1);
        list.printji();
        // list.remF();
        // list.remB(3);
        // list.remL();
        System.out.println();
        list.printji();

        System.out.println();
        // System.out.println(list.size);
        // list.getFromBack(0);
        // list.deleteFromBack(5);
        // System.out.println();
        // list.printji();
        // System.out.println();
    //    System.out.println( list.get(5));
        boolean s=list.isPalindrome();
        if(s==true){
            System.out.println("It's palindrome");
        }
        else{
            System.out.println("It's not!");
        }
        
        
          //que Find the nth node from last
        //   1-->2-->3-->4-->5-->X 
            //  0   1   2   3   4 
            //  5   4   3   2   1
            // size=5 (size-i);

        // questoin 2 
        // check if the linkedlist is palindromic or not

        


    }
}
