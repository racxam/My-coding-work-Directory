import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        //code to create a new file
        File myFile= new File("sumit.txt");
        try{

            myFile.createNewFile();

        }catch(IOException e){
            System.out.println("Unable to creat this file");
            e.printStackTrace();
        }

        // code to write on a file  in java file handling
        try{
        FileWriter o= new FileWriter("sumit.txt");
        o.write("This is a nice file because of the name of the file is sumit.txt");
        o.close();
    }
        catch(IOException e){
            e.printStackTrace();
        }

    // reading a file
    File o= new File("this.txt");
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

    // // to delete a file
    // File yeah= new File("this.txt");
    // if(yeah.delete()){
    //     System.out.println(yeah.getName()+" is successfully deleted!!");
    // }
    // else{
    //     System.out.println("I think some error occured while deleting the file");
    // }
    }

}