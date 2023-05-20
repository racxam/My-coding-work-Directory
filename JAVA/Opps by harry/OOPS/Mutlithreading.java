class Th1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=400000){

            System.out.println("Cooking!!");
            System.out.println("Sad");
            i++;
        }
    }
}
class Th2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=400000){

            System.out.println("Chatting!!");
            System.out.println("Happy");
            i++;
        }
    }
}
public class Mutlithreading {
    public static void main(String[] args) {
        Th1 t1=new Th1();
        Th2 t2=new Th2();

        t1.start();
        t2.start();
        
    }
}
