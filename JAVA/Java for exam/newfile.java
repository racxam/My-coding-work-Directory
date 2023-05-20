import java.io.*;
public class newfile {
    public static void main(String[] args) {
        try{

            File fos= new File("sumit.txt");
            // String str= "hello madardfdfdchoda";
            // byte [] b=str.getBytes();
            FileWriter fw= new FileWriter("sumit.txt");
            fw.write("Randi sali bhanki lori");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
