public class fibonaci {
    public static void fibo(int f, int n,int limit) {
        int m=f+n;
        System.out.print(m+" ");
        f=n;
        n=m;
        limit=(limit)-1;
        if(limit>0){

            fibo(f,n,limit);
        }
        
    }
    public static void main(String[] args) {
        //question print fibonaaci series till the nth term;
        // Ahm using iteration we are printing this
        int limit=8;
        int f=0;
        int n=1;
        System.out.print(0+" "+1+" ");
        // for (int i = 1; i <=limit-2; i++) {
        //     int m=f+n;
        //     System.out.print(m+" ");
        //     f=n;
        //     n=m;
        // }
        fibo(f,n,limit-2);


    }
}
