 // synchronisec method  wlaa example hai ye


 
//  class Table{
//    synchronized public void printTable(int n){

//         for (int i = 0; i < 5; i++) {
//             System.out.println(n*(i+1));
//             try{
//                 Thread.sleep(400);

//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//     }
// }

// ye synchronised block wala hai which is i think more efficient than synchronised method
 class Table{
    public void printTable(int n){
        synchronized(this){

        
        for (int i = 0; i < 5; i++) {
            System.out.println(n*(i+1));
            try{
                Thread.sleep(400);

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }
}
public class SyncUsingANnonoymusclass {
    public static void main(String[] args) {
        Table t1= new Table();
        Thread th1= new Thread(){
            public void run(){
                t1.printTable(5);
            }
        };

        Thread th2= new Thread(){
            public void run(){
                t1.printTable(100);
            }
        };
        th1.start();
        th2.start();
    }
}
