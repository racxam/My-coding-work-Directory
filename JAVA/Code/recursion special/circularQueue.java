

public class circularQueue {
    public static class cicularQ{
        static int front=-1;
        static int rear=-1;
        static int size;
        static int arr[];
        cicularQ(int s){
            this.size=s;
            this.arr= new int[s];
            
        }
        public static boolean isEmp() {
            boolean sol= false;
            if(front==-1 && rear==-1){
                sol=true;
                
                return sol;
            }
            return sol;
        }
        public static boolean isFull() {
            boolean sol= false;
            if((rear+1)%size==front){
                return sol;
            }
            return sol;
        }
        public static void add(int data) {
          if(isFull()){
            System.out.println("Queue is full");
            return;
          }
          if(front==-1){
            rear=(rear +1)%size;
            front=(front+1)%size;
            arr[rear]=data;
        }
        else{
              rear=(rear +1)%size;

            arr[rear]=data;
          }
        }
        public static int remove() {
          if(isEmp()){
            System.out.println("Queue is Empty");
            return 0;

          }
          //single line
          int temp=arr[front];
          if(front==rear){
            front=-1;
            rear=-1;
          }
          else{

              front=(front+1)%size;
          }
          return temp;
          
        }
        public static int peek(){
            int sol=-1;
            if(isEmp()){
                System.out.println("Queue is empty");
                return -1;

            }
            else{
                sol=arr[front];
            }
            return sol;
        }

        public static void printji() {
            int tempF=front;
            int tempR=rear;
            if(isEmp()){
                System.out.println("Queue is empty");
                return;
            }
            else{

                while((tempF<tempR)){
                    System.out.println(arr[tempF]);
                    tempF=(tempF+1)%size;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        cicularQ q=new cicularQ(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();



        // q.printji();
        System.out.println(q.peek());


    }   
}
