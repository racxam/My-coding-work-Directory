
class turtol extends Thread{
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
class rabbit extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Rabbit" +" ");
            if(i==7){
                try {
                    Thread.sleep(3000);
                    
                } catch (Exception e) {
    
                }
            }
        }
    }
}
public class th {
    public static void main(String[] args) {
        turtol t1= new turtol();
        rabbit t2= new rabbit();
        t1.start();

        t2.start();
    }
}
