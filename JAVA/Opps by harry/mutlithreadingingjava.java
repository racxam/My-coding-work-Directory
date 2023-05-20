class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<=100){

            System.out.println("Process 1\n");
            i++;
        }


    }
}
class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=100){

            System.out.println("Process 2\n");
            i++;
        }


    }
}
public class mutlithreadingingjava {
    public static void main(String[] args) {
        MyThread1 bullet1 =new MyThread1();
        MyThread2 bullet2 =new MyThread2();

        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
        
    }
}
