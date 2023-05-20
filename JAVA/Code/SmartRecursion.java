public class SmartRecursion {
    public static int calcPower(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
       if(n%2==0){
         return calcPower(x, n/2)*calcPower(x, n/2);
       } 
       else{
        return x*calcPower(x, n/2)*calcPower(x, n/2);
       }
    }
    public static void main(String[] args) {
        //question is write a piece of code for to calculate the x^n (n==height of stack and it must be log(n))
        int x=2,n=2;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
