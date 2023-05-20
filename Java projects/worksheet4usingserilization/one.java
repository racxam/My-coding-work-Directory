package gta;
import java.io.*;
import java.util.*;
public class one implements java.io.Serializable {
        private static final long serialVersionUID=-4135805832153740627L;
        String name;
        String id;
        String dob;
        String salary;
        String jdate;
     public void getData(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Employee name");
        this.name=sc.nextLine();
        
        System.out.println("Enter the Employee id");
        this.id=sc.nextLine();
        
        System.out.println("Enter the Employee date of birth");
        this.dob=sc.nextLine();
        
        System.out.println("Enter the Employee salary");
        this.salary=sc.nextLine();
        
        System.out.println("Enter the Employee joinig date");
        this.jdate=sc.nextLine();
        
    }
    public void StoreData(one on){
        try{

            FileOutputStream fos= new FileOutputStream("sumit.txt",true);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(on);
            oos.reset();
            oos.flush();
        }
        catch(Exception e){
            System.out.println(e);
        }

    
         

           

       
    }
    public void PrintData(one on){
        System.out.println("The Employee name: "+on.name+"\n");
        System.out.println("The Employee id: "+on.id+"\n");
        System.out.println("The Employee date of birth: "+on.dob+"\n");
        System.out.println("The Employee salary: "+on.salary+"\n");
        System.out.println("The Employee joinig date: "+on.jdate+"\n\n");
}
    public static void main(String[] args) {
       

        
    }
}
