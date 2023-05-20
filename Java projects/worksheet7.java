public class worksheet7 {

    
    worksheet7(){

    }
    public static void main(String[] args) throws InterruptedException {


       Runnable t1=()->{
        for (int i = 0; i < 20; i++) {
            System.out.print("Turtoise: "+(i+1)+"m\n");
            if(i==19){

                System.out.println("\n\n Turtoise has Won the Race\n ");


                
            }
            try{
                Thread.sleep(170);
            }catch(Exception e){ }

            
            
        }
    };
        Runnable t2=()->{
            for (int j = 0; j < 20; j++) {
                
                System.out.print("Hare: "+(j+1)+"m\n");
                try {
                    Thread.sleep(60);
                } catch (Exception e) {

                }
                if(j==14){
                    try {
                        Thread.sleep(8000);
                    } catch (Exception e) {
                    }
                    
                    
                }
                if(j==19){

                    System.out.println("\n\n Now hare completed the race!!!!");

                    // won="Hare";
                    
                }
                
            }
        };
 
        Thread th1= new Thread(t1);
        Thread th2= new Thread(t2);

        th1.start();
        th2.start();
       
        




       
    }

}
