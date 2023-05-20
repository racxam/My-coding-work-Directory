public class programthread {
    public static void main(String[] args) {
        

        
        Thread t1= new Thread(){
            public void run(){
                for (int i = 1; i < 9; i+=2) {
                        System.out.println(i);
                }
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        Thread t2= new Thread(){
           synchronized public void run(){
                for (int i = 2; i <100 ; i+=2) {
                        System.out.println(i);
                }
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //       System.out.println(e);  
        //     // TODO: handle exception
        // }
        t2.start();
    }
}
