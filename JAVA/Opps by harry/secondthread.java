class Thread1 extends Thread{
    Thread1(String name){
        super(name);

    }
    public void run(){
        int i=0;
        while(i<=10){

            System.out.println("Thank you so much");
            i++;
        }
    }
}
class NewThread implements Runnable{
  public void run(){
    System.out.println("Hello i am good");
  }
}
public class secondthread {
    public static void main(String[] args) {
        // Thread1 o1= new Thread1("Sumit");
        // Thread o2= new Thread1("Amit");

        // o1.start();
        // o2.start();

        // System.out.println("The id of the thread 1 is "+o1.getId());
        // System.out.println("The name of the thread 1 is "+o1.getName());
        // System.out.println("The id of the thread 2 is "+o2.getId());
        // System.out.println("The name of the thread 2 is "+o2.getName());
        
        NewThread t1= new NewThread();
        NewThread t2= new NewThread();
        
        Thread gun1=new Thread(t1,"sumit");
        Thread gun2=new Thread(t2,"Amit");
        
        gun1.start();
        gun2.start();
        
        System.out.println("The id of the thread 1 is "+gun1.getId());
        System.out.println("The name of the thread 1 is "+gun1.getName());
        System.out.println("The id of the thread 2 is "+gun2.getId());
        System.out.println("The name of the thread 2 is "+gun2.getName());

        

    }
}
