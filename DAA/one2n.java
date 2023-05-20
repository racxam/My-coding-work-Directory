public class one2n{
    public static int prin(int n) {
        int o;
        if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            o=1+prin(n-1);
            System.out.println(o);
            return o;
        }
    }
    public static void main(String[] args) {
        prin(20);
    }
}