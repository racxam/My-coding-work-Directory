import java.lang.*;
class Mythread1 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<100){

            System.out.println("Thread one is implementing right now");;
            i++;
        }
    }
}
class Mythread2 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<100){
        System.out.println("12325433746854435224");
        i++;
        }
    }
}
public class threadusingrunnable {

    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2= new Mythread2();

        Thread tt1= new Thread(t1); 
        Thread tt2= new Thread(t2); 

        tt1.start();
        tt2.start();

        
    }
}
