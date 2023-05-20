package pack;
import java.io.*;

public class one implements Serializable{
    String name,uid;
    int salary;

    public static void main(String[] args) throws Exception{
        one o= new one();
        o.name="sumit";
        o.uid="20bcg1115";
        o.salary=454545;
        try{

            FileOutputStream fos=new FileOutputStream("river.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.flush();
            oos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
