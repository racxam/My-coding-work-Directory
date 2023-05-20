import java.io.*;
class student implements Serializable{
    private int roll_no;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    public student(){

    }
    public student(int rn,String name, float avg, String dept){
        roll_no=rn;
        name=this.name;
        dept=this.dept;
        avg= this.avg;
        Data=500;
        t=34;


    }
    public String toString(){
        return "InStudent Details\n"+
        "\nnRoll "+roll_no+
        "\nName"+name+
        "\nAverage"+avg+
        "\nDept"+dept+
        "\nData "+Data+
        "\nTransient "+t+"\n";
    }

}
public class searlizn {
    public static void main(String[] args) throws Exception{
        // FileOutputStream fos= new FileOutputStream("RAM.txt");
        // ObjectOutputStream oos= new ObjectOutputStream(fos);

        // student lo = new student(12,"shamsara",234.56f, "Cu" );
        // oos.writeObject(lo);
        // fos.close();
        // oos.close();
        
        FileInputStream fos= new FileInputStream("RAM.txt");
        ObjectInputStream oos= new ObjectInputStream(fos);

        student s;
        s= (student)oos.readObject();
        System.out.println(s);
        fos.close();
        oos.close();


    }
}
