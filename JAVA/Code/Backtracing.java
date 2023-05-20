import javax.print.DocFlavor.STRING;

public class Backtracing {
    public static void printPerm(String str, String perm) {
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
           char cc=str.charAt(i);

           String newStr=str.substring(0, i)+str.substring(i+1);
           printPerm(newStr, perm+cc); 



            
        }
    }

    public static void main(String[] args) {
        String str="ABC";
        printPerm(str,"");

    }
}
