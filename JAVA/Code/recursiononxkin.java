public class recursiononxkin {
    public static int fun(int x,int n) {
        if(n>=1){
            n=n-1;

            return x=x*fun(x, n);
        
        }
        else if(x==0){

            return 0;
        }
        else if(n==0){
            return 1;
        }
        else{
            n=n-1;
            return x=x*1;
        }

    }
    public static void main(String[] args) {
        //question ki x^n recursive function mein stack ki heigh n rakho
        int x=7,n=2;
        int ans=fun(x,n);
        System.out.println(ans);
    }
}
