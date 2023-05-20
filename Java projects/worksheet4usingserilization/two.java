package gta;
import java.io.*;
import java.util.*;
public class two{

    public void deinput(one on){

        try{
    
            FileInputStream fin=new FileInputStream("sumit.txt");
            ObjectInputStream ois= new ObjectInputStream(fin);
            one e1=(one)ois.readObject();
            e1.PrintData(on);
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
        
            
        }
}
