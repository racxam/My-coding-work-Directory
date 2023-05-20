// write a java program to display name and rool 
// no of the students also handle array index out of bound exception
import java.util.*;
public class CU{
    String name;
    int roll_no;
    CU(String n, int r){
        this.name=n;
        this.roll_no=r;

    }

    public static void inputStudents(CU[] s){
        Scanner sc= new Scanner(System.in);
        for ( int i = 0; i < s.length; i++) {
            System.out.println("Enter name of the student "+(i+1));
            String name=sc.nextLine();
            System.out.println("Enter roll no of the student "+(i+1));
            int roll= sc.nextInt();
            s[i]=new CU(name, roll);
            sc.nextLine();

        }
             sc.close();
    }

    public static void outputStudents(CU[] s) {
        try {
            System.out.println();
            System.out.println();
            System.out.println();

            for (int i = 0; i < s.length; i++) {
                System.out.println("Roll no = "+s[i].roll_no + "\n Name = "+ s[i].name);
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            
            }
            catch(Exception e ){
                System.out.println(e);
            }
        }
        
    


  public static void main(String[] args) {
    System.out.println("THE PROGRAM IS FOR DISAPLAYING STUDENT'S INFORMATION");
    System.out.println("WE CAN ONLY DISPLAY DETAILS OF AT MAX 4 STUDENTS");
    System.out.println("Enter the no of Student's !");
    Scanner obj= new Scanner(System.in);
    int n=obj.nextInt();

    CU[] s= new CU[n];
    inputStudents(s);
    outputStudents(s);


  }

    

    
  }  
