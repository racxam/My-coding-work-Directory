// we using the principal of mathematical induciton to use recurisoin
// 1. Assume for K
// 2. prove for K+1 and 1, then recursion will run best
// how to use this in recursion
// 1. make expection that fourmulla will work for k+1
// 2. then faith that k is true
// 3. prove for 1 


public class printdecreasing {
    public static void printDecreasing(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        printDecreasing(5);
    }
}
