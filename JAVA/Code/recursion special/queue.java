public class queue {
    public static class node{
        static int front;
        static int back;
        static int size;
        static int arr[];
        node(int s){
            this.size=s;
            this.front=-1;
            this.back=-1;
            arr=new int[size];
        }
        public static boolean isEmp() {
            boolean s=false;
            if(back==-1 && front==-1){
                s=true;
            }
          
            return false;
        }
        public static boolean isFull() {
            boolean s=false;
            if(back==size-1){
                s=true;
            }
            return false;
        }
        public static void enqueue(int data) {
            if(!isFull()){

                
                    back++;
                    arr[back]=data;
                    
                
            }
            else{
                System.out.println("This is full!!");
            }
        }
        public static int dequeue() {
            int temp=-1;
            if(isEmp()){
                System.out.println("queue is empty");
            }
            else{
                front++;
                temp=arr[front];
            }
            return temp;
        }
       
        public static void printji() {
            front++;
            if(isEmp()){
                System.out.println("This queue is empty");
            }
            
            else{
                int i=front;
                while (i<=back) {
                    System.out.print(arr[i]+" ");
                    i++;

            }
        }
        }
        public static void peek() {
            if(isEmp()){
                System.out.println("queue is empty");
            }
            else{
                System.out.println("The peek element is "+arr[front]);
            }
        }
    }

    public static void main(String[] args) {
        node q= new node(5);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(5);

        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.back);
        q.printji();
        System.out.println();
        q.peek();

        
    }
}
