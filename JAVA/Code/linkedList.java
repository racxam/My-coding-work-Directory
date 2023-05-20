
//Linked list is a data structure which uses random bits of memory and those bits/nodes are connected to each other
// insertion in between is way easier here than arrays
// searching takes O(n) time bcz the memory is not contagious here
// we can also add a lot elements unless the memory is not full
// memory locations are not contagious here
// insertion - O(1)
// Serch- O(n)
// linked list are made up of nodes 
//nodes consists of two variables - data and next
// data store the data 
// next stores the next memory location
 // linked list are of three types 
 // singular - data nd next
 // double - data nd next and prev
 //  cicrular- same as linked list it is just that the last node is not to null but it's connectd to the first node
 //head and tail

 //Java ka null- null
 // c++ ka null= NULL



class linkedList {
   public Node head;
    
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null; 
        }
        
        
    }
    linkedList(){
        this.head= null;
    }
    //add first, last
    public void addFirst(String data) {
        Node newNode = new Node(data); 
        if(head== null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head= newNode; 

    }
    // add last
    public void addLast(String data) {
        Node newNode= new Node(data);
        Node curr=head;
        while (curr.next!=null) {

            curr=curr.next;
        }
        curr.next=newNode;


    }
    // at the middle
    public void addMiddle(String data,int ind) {
        Node newNode= new Node(data);
        Node curr=head;
        int i=0;
        while(i<(ind-1)){
            curr= curr.next;
            i++;

        }
        newNode.next=curr.next;
        curr.next=newNode;

        
        
    }

    //remove functions
    public void removef () {
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    else{

        head=head.next;
        return;
    }
        
    }
    public void removeL(){
        if(head==null){
            System.out.println("list is not empty\n");
            return;
        }
        Node secLast= head;
        Node last=head.next;
        if(head.next==null){
            head=null;
            return;
        }
        while (last.next!=null) {
            last=last.next;
            secLast=secLast.next;
        }
        secLast.next=null; 
        // while((curr.next).next==null){
        //     curr=curr.next;
        // }
        // (curr.next)=null;
        
    }
    
    public void removeBet(int ind) {
        if(head==null){
            System.out.println("list is not empty\n");
        }
        else{
            Node curr= head;
            int i=1;
            while(i<ind){
                curr=curr.next;
                i++;
            }
            curr.next= (curr.next).next;

        }
    }
    //print
    public void printji() {
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr= head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println("NULL");
    }


   public static void main(String[] args) {
    linkedList list= new linkedList(); 
    list.addFirst("a");
    list.addFirst("is");
    list.addLast("list");
    list.addMiddle("sumit",2);
    // list.removef();
    // list.removeL();
    list.removeBet(2);

    list.printji();



    
   } 
}
