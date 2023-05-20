public class TowerOfHanoi {
    public static void TOH(int n,String src, String helper, String dest) {
        if(n==1){

            System.out.println("Tranfered disc "+ n+" from "+src+" to "+dest);
            return;
        }
        else{

            TOH(n-1, src, dest, helper);// n-1 disc ko src se helper pr dalna hai
            System.out.println("Tranfered disc "+ n+" from "+src+" to "+dest);
            TOH(n-1, helper, src, dest);
        }
        
    }
    public static void main(String[] args) {
        int n=3;
        TOH(n, "S", "H", "D");
    }
}
