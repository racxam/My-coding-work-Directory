import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class check {
    public static void main(String[] args) {
        File myFile= new File("Yes.txt");
        try{

            myFile.createNewFile();

        }catch(IOException e){
            System.out.println("Unable to creat this file");
            e.printStackTrace();
        }

        // code to write on a file  in java file handling
        try{
        FileWriter o= new FileWriter("yes.txt",true);
        o.write("This is a nice file because of the name of the file is sumit.txt");
        o.close();
    }
        catch(IOException e){
            e.printStackTrace();
        }

    // reading a file
    File o= new File("yes.txt");
    try{
        Scanner sc= new Scanner(o);
        while(sc.hasNextLine()){
            String line= sc.nextLine();
            System.out.println(line);
        }
        sc.close();

    }catch(IOException e){
        e.printStackTrace();
    }

    }
}
