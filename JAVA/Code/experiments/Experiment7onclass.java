class T1 extends Thread{
public void run(){
for (int i = 0; i < 10; i++) {
    System.out.println(" i am using T1 no *"+i);
    // try{  
    //     Thread.sleep(4000);  
    //    }catch(Exception e){System.out.println(e);}  
     
}
}
}
class T2 extends Thread{
public void run(){
    for (int i = 0; i < 10; i++) {
        try{  
            Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
        
        System.out.println(" i am using T2 no *"+i);
      
    }
}
}
public class Experiment7onclass {
    public static void main(String[] args) {
        T1 one=new T1();
        T2 two=new T2();
        one.start();
        two.start();

    }
}
