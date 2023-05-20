import java.nio.file.Path;
import java.util.ArrayList;

public class getmazE {  
    public static ArrayList<String> getmaze(int sr,int sc, int dr, int dc) {
        if(sc==dc&& sr==dr){
            ArrayList<String> yes= new ArrayList<>();
            yes.add(" ");
            return yes;
        }
        ArrayList<String> one =new ArrayList<>();
        ArrayList<String> two =new ArrayList<>();
        if(sc<dc){
        
            two= getmaze(sr, sc+1, dr, dc);
        }
        if(sr<dr){

            one= getmaze(sr+1, sc, dr, dc);
        }
       ArrayList<String> sol=new ArrayList<>();
       for (String addv : one) {
          sol.add("v"+addv);
       }
       for (String addh : two) {
          sol.add("h"+addh);
       }

       return sol;



    }
    public static void main(String[] args) {
        
        
       ArrayList<String> str=  getmaze(1,1,3,3);
       System.out.println(str);
    }
}
