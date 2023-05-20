
class turtol implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Turtol  ");
            try {
                Thread.sleep(20);
                
            } catch (Exception e) {

            }
        }
    }
} 
class rabbit implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Rabbit" +" ");
            if(i==9){
                try {
                    Thread.sleep(3000);
                    
                } catch (Exception e) {
    
                }
            }
        }
    }
}
public class thrunable {
    public static void main(String[] args) {
        turtol t1= new turtol();
        rabbit t2= new rabbit();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}

