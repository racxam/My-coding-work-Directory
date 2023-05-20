

public class powerlinear {
   public static int pow(int x,int n) {
    if(n==0){
        return 1;
    }
    return x*pow(x, n-1);
    
   }
    public static void main(String[] args) {
       int ans= pow(8,0);
       System.out.println(ans);
    }
}
