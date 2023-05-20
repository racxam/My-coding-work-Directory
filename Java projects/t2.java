import java.io.File;
import java.io.FileWriter;


public class t2 {
    public static void main(String[] args) {
        try {
            File f=new File("wolla.txt");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileWriter o= new FileWriter("wolla.txt");
            o.write("Hello who t hell r you");
            o.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
