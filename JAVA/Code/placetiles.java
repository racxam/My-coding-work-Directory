

public class placetiles {
    public static int placeTiles(int n ,int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
       int vertical= placeTiles(n-m, m);
       //horizontally
       int horizontal= placeTiles(n-1, m);
       return vertical+horizontal;



    }
    public static void main(String[] args) {
        int m=2,n=4;
       int u= placeTiles(n, m);
       System.out.println(u);

    }
}
