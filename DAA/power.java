import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class power {
    public static int pow(int x,int n) {
        if(n==1){
            return x;
        }
        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        int x=10,n=3;
        int ans=pow(x,n);
        System.out.println(ans);
    }
}
