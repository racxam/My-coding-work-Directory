import java.util.*;
public class keypadcomb {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
    "yz"
   }; 
   public static ArrayList<String> printComb(String code[],String str) {
    if(str.length()==0){
        ArrayList<String> st= new ArrayList<>();
        st.add("");
        return st;
    }
    char ch=str.charAt(0);//6
    String ros=str.substring(1);//78
    ArrayList<String> rres=printComb(code, ros);// comb of 7-8
    ArrayList<String> mres=new ArrayList<>();//new list
    // int no=Integer.valueOf(ch);
    String codesforch= code[ch-'0'];

    for (int i = 0; i < codesforch.length(); i++) {
        char chcode= code[ch-'0'].charAt(i);
        for(String rstr:rres){
             mres.add(chcode+rstr);
        }
    }
    

    return mres;
   } 
  
    public static void main(String[] args) {
       ArrayList<String> list= printComb(codes,"678");
       System.out.println(list);
    }
}
