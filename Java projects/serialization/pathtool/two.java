package pack;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
// import pathtool.one;

public class two implements java.io.Serializable {
        public static void main(String[] args) {
        try{

            FileInputStream fin=new FileInputStream("river.txt");
            ObjectInputStream fis=new ObjectInputStream(fin);
            one e1=(one)fis.readObject();
            System.out.println(e1.name+"\t"+e1.uid+"\t"+e1.salary);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
