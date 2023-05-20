
import java.util.ArrayList;

public class getmazEwithjump {  
    public static ArrayList<String> getmaze(int sr,int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> yes=new ArrayList<>();
            yes.add(" ");
            return yes;
        }
        ArrayList<String> paths=new ArrayList<>();
        //horizontal moves

        for (int ms = 1; ms <=dc-sc; ms++) {
            ArrayList<String> hpaths=getmaze(sr, sc+ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h"+ms+hpath);
            }
            
        }
        //verticle moves
        for (int ms = 1; ms <=dr-sr; ms++) {
            ArrayList<String> vpaths=getmaze(sr+ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v"+ms+vpath);
            }
            
        }
        //diagonal
        for (int ms = 1; ms <=dc-sc && ms<=dr-sr; ms++) {
            ArrayList<String> dpaths=getmaze(sr+ms, sc+ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d"+ms+dpath);
            }
            
        }
        return paths;


    }
    public static void main(String[] args) {
        
        
       ArrayList<String> str=  getmaze(1,1,3,3);
       System.out.println(str);
    }
}
