import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

//Experiment 4: Create a menu-based Java application with the following options:
// 1. Add an Employee
// 2. Display All
// 3. Exit
// If option 1 is selected, the application should gather details of the employee
//  like employee name, employee id, designation, and salary and store it in a file.
// If option 2 is selected, the application should display all the employee details.
// If option 3 is selected the application should exit.
class Employee{
    String name,id,dob,salary,jdate;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Employee name");
        name=sc.nextLine();
        
        System.out.println("Enter the Employee id");
        id=sc.nextLine();
        
        System.out.println("Enter the Employee date of birth");
        dob=sc.nextLine();
        
        System.out.println("Enter the Employee salary");
        salary=sc.nextLine();
        
        System.out.println("Enter the Employee joinig date");
        jdate=sc.nextLine();
        
    }
    public void StoreData(){
        try {  
                       // Creating an object of a file  
                       File f0 = new File("EmpDetails.txt");   
                       if (f0.createNewFile()) {  
                                  System.out.println("File " + f0.getName() + " is created successfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       }  
                     }
                     catch (IOException exception) {  
                              System.out.println("An unexpected error is occurred.");  
                              exception.printStackTrace();  
                  } 
         try {
            FileWriter f1 = new FileWriter("EmpDetails.txt",true);
            System.out.println("I am fetching-------");


            f1.write("The Employee name: "+name+"\n");
            f1.write("The Employee id: "+id+"\n");
            f1.write("The Employee date of birth: "+dob+"\n");
            f1.write("The Employee salary: "+salary+"\n");
            f1.write("The Employee joinig date: "+jdate+"\n");

            f1.write("\n");
            System.out.println("File has been written into."+"\n");
            f1.close();

        } catch (IOException e) {
            System.out.println("Error......");
            e.printStackTrace();
        }
        
    }
    public void printData(){
        try {
            System.out.println("printing Data.....");
            File f2 = new File("EmpDetails.txt");
            Scanner my = new Scanner(f2);
            
            while (my.hasNextLine()) {
                String data = my.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error.....");
            e.printStackTrace();
        }
        
        
    }
    
}
public class worksheet4
{
    
	public static void main(String[] args) {
        do{
		System.out.println("======Employee Management System=======");
		System.out.println("Choose any of the option");
		System.out.println("1. Add Details");
		System.out.println("2. Show Details");
		System.out.println("3.Exit");
		Scanner o=new Scanner(System.in);
		Employee e= new Employee();
		int opt=o.nextInt();
		switch(opt){
		    case 1:
		        System.out.println("Adding Details!");
		        e.getData();
                e.StoreData();
		        break;
		    case 2:
		        System.out.println("Showing Details!");
		        e.printData();
		        break;
		    case 3:
		        System.out.println("Exiting the System");
		        System.exit(0);
		        break;
		        
		    default:
		          System.out.println("Choose the correct option!!");
		          break;
		    
		}
    }while(true);
	}
} 