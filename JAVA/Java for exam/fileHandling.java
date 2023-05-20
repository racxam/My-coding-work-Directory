import java.io.*;
public class fileHandling {
    public static void main(String[] args) {
        try{

            FileOutputStream fout= new FileOutputStream("susu.txt");
            String str= "Hello i am sumit";
            byte words[]=str.getBytes();
            fout.write(words);
            fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        try {
            FileInputStream fin= new FileInputStream("susu.txt");
            int i=0;
            while ((i=fin.read())!=-1) {
                
                System.out.print((char)i);
            }

        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }

    }
}
