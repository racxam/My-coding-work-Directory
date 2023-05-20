public class sum {
    public static int summa(int n) {
        int ans=-1;
        if(n==1){
            return 1;

        }
        else{
            ans=n+summa(n-1);
            return ans;
        }

    }
    public static void main(String[] args) {
        int n=20;
        int ans=summa(n);
        System.out.println(ans);
    }
}
