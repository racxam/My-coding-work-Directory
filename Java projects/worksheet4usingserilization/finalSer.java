package gta;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import gta.one;

import java.io.*;

//Experiment 4: Create a menu-based Java application with the following options:
// 1. Add an Employee
// 2. Display All
// 3. Exit
// If option 1 is selected, the application should gather details of the employee
//  like employee name, employee id, designation, and salary and store it in a file.
// If option 2 is selected, the application should display all the employee details.
// If option 3 is selected the application should exit.

public class finalSer
{
    public static void addDetails() {
        System.out.println("How many persons you wants to add: ");
        Scanner yell= new Scanner(System.in);
		int n=yell.nextInt();
		one obj[]=new one[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Adding Details!, "+i+"th time:----->");
			obj[i]= new one();
			obj[i].getData();
			obj[i].StoreData(obj[i]);
		}
		for (int i = 0; i < n; i++) {
			
			
			System.out.println("Showing Details!");
			two t1= new two();
			t1.deinput(obj[i]);
		}
    }
    
	public static void main(String[] args) {
        do{
		System.out.println("======Employee Management System=======");
		System.out.println("Choose any of the option");
		System.out.println("1. Add Details");
		System.out.println("2. Show Details");
		System.out.println("3.Exit");
		Scanner ol=new Scanner(System.in);
        int opt=ol.nextInt();
		switch(opt){
		    case 1:
		        addDetails();
		        break;
				case 2:
		        System.out.println("Showing Details!");
		        two t1= new two();
                // t1.deinput();
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