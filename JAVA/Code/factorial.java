// public class factorial {

//     public static int fact(int n) {
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             return n*fact(n-1);
//         }
       


//     }
//     public static void main(String[] args) {
//         // int pro=1;
//         int ans=fact(0);
//         System.out.println(ans);
//     }
// }

public class factorial {

    public static void fact(int n,int pro) {
        if(n==0||n==1){
            pro=pro*1;
            fact(n-1, pro);
            
        }
        else if(n>1){
            pro=pro*n;
            fact(n-1,pro);
        }
        else{
            System.out.println(pro);
        }
       
    }
    public static void main(String[] args) {
        int pro=1;
        int n=3;
       fact(n,pro);
    }
}
