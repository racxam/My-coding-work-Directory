import java.util.ArrayList;

public class substrings {
        public static ArrayList<String> sub(String str) {
            if(str.length()==0){
                ArrayList<String> bres=new ArrayList<>();
                bres.add(" ");
                return bres;
            }
            char f=str.charAt(0);//a
            String c= str.substring(1);//bc
            ArrayList<String> rres=sub(c);

            ArrayList<String> nayi=new ArrayList<>();
            for (String gp : rres) {
                nayi.add(gp);
                
            }
            for (String gp : rres) {
                nayi.add(f+gp);
                
            }


            return nayi;
        }
        public static void main(String[] args) {
        String str="abc";
       ArrayList<String> bc= sub(str);
       System.out.println(bc);
    }
}
