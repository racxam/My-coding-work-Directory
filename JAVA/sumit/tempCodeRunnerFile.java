import java.util.*;

public class anuj {
    public static int getSalary(String arr[][], int i) {
        int DA=0;
        if(arr[i][3]=="e"){
            DA+=20000;
        }
        else if(arr[i][3]=="c"){
            DA+=32000;
        }
        else if(arr[i][3]=="k"){
            DA+=12000;
        }
        else if(arr[i][3]=="r"){
            DA+=15000;
        }
        else if(arr[i][3]=="m"){
            DA+=40000;
        }
        
        return DA;
        
    }
    public static void printji(int empId, String arr[][]) {
        int i=0;
        int basic= Integer.parseInt(arr[i][5]);
        int HRA=Integer.parseInt(arr[i][6]);
        int IT=Integer.parseInt(arr[i][7]);
        if (empId == 1001) {
            i = 0;
        } else if (empId == 1002) {
            i = 1;
        } else if (empId == 1003) {
            i = 2;
        } else if (empId == 1004) {
            i = 3;
        } else if (empId == 1005) {
            i = 4;
        } else if (empId == 1006) {
            i = 5;
        } else if (empId == 1007) {
            i = 6;
        } else {
            System.out.println("employee id is wrong");
            return;
        }
        String Designation = printDesg(arr, i);
        int DA= getSalary(arr,i);
        int salary= basic+HRA+DA-IT;

        System.out.println("Emp id   Emp name   Deparment     Designation    Salary");
        System.out.println(empId +"      "+ arr[i][1] +"     "+ arr[i][4] +"          "+ Designation + "         "+salary);

    }

    public static String printDesg(String arr[][],int i) {
        StringBuilder Stdesg= new StringBuilder();
        Stdesg.append(arr[i][3]);
        String desg=Stdesg.toString();
        String send="none";


        switch (desg) {
            case "e":
                send="engineer";

            case "c":
                send="Consultant";


            case "k":
                send= "Clerk";


            case "r":
                send="Receptionist";


            case "m":
                send="Mangaer";



            default:
            
                break;
        }
        return send;
    }

    public static void main(String[] args) {
        Scanner o= new Scanner(System.in);
        int empId;
        String arr[][]={
           { "1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
           { "1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
           {"1003","Rahul","12/11/2008", "k","Acct","10000","8000","1000"},
           { "1004","Chahat","29/01/2013","r","Front","Desk","12000","6000","2000"},
           {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
           {"1006","Suman","1/1/2000","e","Manu" ,"factur","ing","23000","9000","4400" },
           {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}

        };

     
        
       empId=o.nextInt();
        printji(empId,arr);
    }
}
