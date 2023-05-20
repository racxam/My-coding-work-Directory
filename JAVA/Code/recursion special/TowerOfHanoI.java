

public class TowerOfHanoI {
    public static void TOH(int n, int t1, int t2, int t3) {
        if(n==0){
            return;
        }
        TOH(n-1, t1, t3, t2);// will print the instructions to moce the disk from t1 to t3 using t2
        System.out.println(n+ " moved from "+ t1 +" to "+ t3);
        TOH(n-1, t3, t2, t1);

         

    }
    public static void main(String[] args) {
        TOH(3, 1, 2, 3);

        
    }
}
