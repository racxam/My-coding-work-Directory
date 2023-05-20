public class fiboseries {
    public static int prinf(int n) {
        int o;
        if(n==0||n==1){
            System.out.print(n+" ");
            return n;
        }
        else{
            o=prinf(n-1)+prinf(n-2);
            System.out.println(o);
            return o;
        }
    }
    public static void main(String[] args) {
        int n=2;
        prinf(n);
    }
}
