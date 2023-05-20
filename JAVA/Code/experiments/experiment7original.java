class unknown{
    void printing(String str){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello "+str+ " i am running thread with no "+i);
        }
    }
}
class T1 extends Thread{
    unknown s;
    T1(unknown s){
        this.s=s;
    }
    public void run(){
        s.printing("Sumit");
    }
    }
    class T2 extends Thread{
        unknown s1;
        T2(unknown s1){
            this.s1=s1;
        }
        public void run(){
            s1.printing("Amit");
        }
        }
    
    
    public class experiment7original {
        public static void main(String[] args) {
            unknown obj=new unknown();
            T1 one=new T1(obj);
            T2 two=new T2(obj);
            one.start();
            two.start();
    
        }
    }
    