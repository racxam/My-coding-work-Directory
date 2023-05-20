

public class power2 {
    public static int pow(int x,int n) {
        if(n==1){
            return x;
        }
        else if(n%2==0){
            return pow(x,n/2)*pow(x,n/2);
    }
    else{
        return x*pow(x,n/2)*pow(x,n/2);
    }
}
    public static void main(String[] args) {
        int x=10;
        int n=7;
        int ans=pow(x,n);
        System.out.println(ans);
    }
}
