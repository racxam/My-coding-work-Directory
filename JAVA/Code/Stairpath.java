import java.util.*;
public class Stairpath {
    public static ArrayList<String> getPath(int n) {
        if(n==0){
            ArrayList<String> sr=new ArrayList<>();
            sr.add("");
            return sr;
        }
        else if(n<0){
            ArrayList<String> srr=new ArrayList<>();
            // srr.add("");
            return srr;
        }
        ArrayList<String> l1= getPath(n-1);//f
        ArrayList<String> l2= getPath(n-2);//f
        ArrayList<String> l3= getPath(n-3);//f
        ArrayList<String> mres=new ArrayList<>();
     
           for (String s :l1 ) {
                mres.add("1"+s);
           }
           for (String u :l2 ) {
                mres.add("2"+u);
           }
           for (String v :l3 ) {
                mres.add("3"+v);
           }
        return mres;

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> list=getPath(n);
        System.out.println(list);

    }
}
