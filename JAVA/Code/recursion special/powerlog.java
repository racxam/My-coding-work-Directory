

public class powerlog {
    public static int powLOG(int x,int n) {
        // x= x^n/2* x^n/2;
        if(n==0){
            return 1;
        }

        int ans= powLOG(x,n/2)*powLOG(x,n/2);
        if(n%2!=0)
        {
            ans=powLOG(x,n/2)*powLOG(x,n/2)*x;
        }
       
        return ans;
    }
    public static void main(String[] args) {
        int ans=powLOG(3,2);
        System.out.println(ans);
    }
    
}
