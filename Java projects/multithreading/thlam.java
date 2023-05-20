// join will wait for the other two to complete  
// .getpriority se priority de skte form 1 to 10
public class thlam{
    public static void main(String[] args) {
        Runnable t1=()->
          {
                for (int i = 0; i < 10; i++) {
                    System.out.print("Turtol  ");

                    try {
                        Thread.sleep(20);
                        
                    } catch (Exception e) {
        
                    }
                }
            

        };
       Runnable t2=()->{
           
                for (int i = 0; i < 10; i++) {
                    System.out.print("Rabbit" +" ");
                    if(i==9){
                        try {
                            Thread.sleep(3000);
                            
                        } catch (Exception e) {
            
                        }
                    }
                
            }
        };
        
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2,"Rabbit");
        th1.setName("tutorl");
        // th2.setName("Rabbit");
        System.out.println(th1.getName());
        th1.setPriority(1);
        th2 .setPriority(5);

        System.out.println(th2.getName());
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        th1.start();
        th2.start();
    }
}

