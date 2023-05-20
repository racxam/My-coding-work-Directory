import java.util.HashSet;
public class UniqueSubsequences {
    public static void uniqueSS(String str, int i, String newStr, HashSet<String> set) {
        if(i==str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
                
            }
        }
        char cc= str.charAt(i);
        //to add
        uniqueSS(str, i+1, newStr+cc, set);
        
        // not to add
        uniqueSS(str, i+1, newStr, set);

    }
    public static void main(String[] args) {
        // print all the unique subsequences of a string in java recursion
        String str="aaa";
        HashSet<String> set= new HashSet<>();
        uniqueSS(str,0,"",set);
        
    }
}
