class MyThread1 extends Thread{
   public MyThread1(String name){
        super(name);

    }
@Override

public void run(){
    int i=0;
  while(i<100){
    System.out.println("I am sumit"+Thread.currentThread().getName());

    // System.out.println("I am sumit"+Thread.currentThread().getPriority());

    try {
        Thread.sleep(455);
    } catch (Exception e) {
            System.out.println(e);    
        // TODO: handle exception
    }
    i++;
  }  
}
}
class MyThread2 extends Thread{
    public MyThread2(String name){
        super(name);

    }
@Override

public void run(){
    int i=0;
  while(i<100){
    System.out.println("1232423453668785423434656856787-----");
    // System.out.print(Thread.currentThread().getName());
    // System.out.println("   " +Thread.currentThread().getPriority());
    i++;
  }  
}
}
public class threading {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1("lund");
        MyThread2 t2= new MyThread2("chut");

        t1.start();
        // try {
        //     t1.join();

        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
        
    }
}
