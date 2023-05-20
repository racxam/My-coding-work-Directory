// Design and impliement a simple invntry control for a small video rental store 

import java.util.*;


public class videoinventory {
    
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    // These functions are for Admin
    public static void showList(ArrayList<String> list,ArrayList<String> rentlist) {
        if(list.size()==0){
            wait(1000);
            System.out.println("\nyour list is empty\n");
            adminChoice(list, rentlist);
        }
        else{

        
        System.out.println("\nListed Videos are following:");

        wait(2000);
        if(list.size()==0){
            System.out.println("The list is Empty");
        }
        else{

        
        for (String video : list) {
            System.out.println(video);
        }
        adminChoice(list,rentlist);}
    }
    }
    public static void AddVideo(ArrayList<String> list, ArrayList<String> rentlist) {
        do{
            
            System.out.println("Enter The name of the video You wanna add");
            Scanner ne= new Scanner(System.in);
            String inp= ne.nextLine();
            inp=inp.toLowerCase();
            
            list.add(inp);
            System.out.println(" To do it again press 1 and To exit this press 0");
            Scanner cen =new Scanner(System.in);
            int c=cen.nextInt();
            if(c==0){
                adminChoice(list,rentlist);
            }
            else{
                System.out.println("Repeat!!");
            }


        }while(true);
        
    }
    public static void listRentedVideo(ArrayList<String> list,ArrayList<String> rentlist) {
        if(rentlist.size()==0){
            System.out.println("\nNo movie is rented yet now!!");
            adminChoice(list,rentlist);
        }
        else{

            System.out.println("\n\t------The list of rented videos are:-----------");
            for (String ren : rentlist) {
                System.out.println(ren);
                adminChoice(list, rentlist);
            }
        }
        
    }
    // These functions are for User
    public static void RentVideo(ArrayList<String> list,ArrayList<String> rentlist) {
        wait(1000);
        System.out.println("\n--------Available movies for Rent--------");
        for(String li:list){
            System.out.println(li);
        }
        System.out.println("\n\tEnter the name of movie you wants to rent");
        Scanner mo= new Scanner(System.in);
        String rentMovie=mo.nextLine();
        rentMovie=rentMovie.toLowerCase();
        
        if(list.contains(rentMovie)){
            list.remove(String.valueOf(rentMovie));
            rentlist.add(rentMovie);
            System.out.println(rentMovie+" is now added sucessfully to your cart\n\t Thank you");
            userChoice(list, rentlist);

        }
        else{
            System.out.println("This is not listed here at all");
            System.out.println("To rent it again press 88 otherwise press anything to go to user mode");
            int c=mo.nextInt();
            if(c==88){
                RentVideo(list,rentlist);
            }
            else{
                userChoice(list,rentlist);
            }
        }

        mo.close();
        userChoice(list, rentlist);

    }
    public static void ReturnVideo(ArrayList<String> list,ArrayList<String> renList) {
        System.out.println("\n\t-----RETURN THE RENTED VIDEO-----");
        System.out.println("Enter the name of the movie you want to return\n");
        Scanner rev= new Scanner(System.in);
        String rmov= rev.nextLine();
        if(renList.contains(rmov)){
            System.out.println("Your movie "+rmov+" is now return \t Thanks");
            list.add(rmov);
            renList.remove(rmov);

            userChoice(list,renList);
        }
        else{
            System.out.println("This movie can't be returned as it was not purchased form here");
            userChoice(list,renList);
        }
        
    }
    
    public static void adminChoice(ArrayList<String> list,ArrayList<String> rentList) {
        System.out.println("\n\t--------WELCOME TO ADMIN MODE--------");
        wait(1000);
        Scanner sca= new Scanner(System.in);
        System.out.println("1.  Show List");
        wait(1000);
        System.out.println("2.  Add video");
        wait(1000);
        System.out.println("3.  Rented video List");
        wait(1000);
        System.out.println("4.  exit List");
        wait(1000);
        System.out.println("5.To switch to user mode ");
        sca.reset();
        int adminChoices=sca.nextInt();
        switch (adminChoices) {
            case 1:
            showList(list,rentList);
            break;
            case 2:
            AddVideo(list,rentList);
            break;
            case 3:
            listRentedVideo(list,rentList);
            
            break;
            case 4:
            System.out.println("\n\t=========Racxam's Video Rental Store is Exited Successfully=======");
            System.exit(0);
            break;
            
            case 5:
            userChoice(list,rentList);
            
            default:
            System.out.println("Enter the right choices");
            break;
        }
        // sca.close();
        
    }
    
    public static void userChoice(ArrayList<String> list, ArrayList<String> rentlist) {
        System.out.println("-------WELCOME TO USER MODE------");
        wait(1000);
        System.out.println("1. To Show list");
        wait(1000);
        System.out.println("2. To Rent a video");
        wait(1000);
        System.out.println("3. To Return the video");
        wait(1000);
        System.out.println("4. Exit");
        wait(1000);
        System.out.println("5. To switch to admin mode");
        
        Scanner sc= new Scanner(System.in);
        sc.reset();
        
        int userChoices=sc.nextInt();
        System.out.println(userChoices);
        switch (userChoices) {
            case 1:
            showList(list,rentlist);
            break;

            case 2:
            RentVideo(list,rentlist);
            break;

            case 3:
            ReturnVideo(list,rentlist);
            break;

            case 4:
            System.out.println("\n\t=========Racxam's Video Rental Store is Exited Successfully=======");
            System.exit(0);
            break;

            case 5:
            adminChoice(list,rentlist);
            
            default:
            System.out.println("Enter the right choices");
            break;
        }

       
        
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println("===========WELCOME TO raCXAM'S video rental Store================");

        wait(2000);
        System.out.println("Starting the store.............");
        wait(3000);
        
        //code
        do{
            
            ArrayList<String> list = new ArrayList<String>(); 
            ArrayList<String> rentlist = new ArrayList<String>(); 
        
            System.out.println(" a.) Login As Administrator press a");
            wait(1000);
            System.out.println(" b.) login as Externl user press b");
            wait(1000);
            System.out.println(" c).  For exit press 0");
            wait(1000);
            System.out.println("\n--------->Enter Your Choice as 'a', 'b', '0' ");
            Scanner o= new Scanner(System.in);
            String log_choice=o.next();


            if(log_choice.equals("0")){
                System.out.println("Your program is successfully teminated");
                System.out.println("Your reponse is :"+log_choice);
                System.exit(0);
                
            }
            else if(log_choice.equals("a")){
                System.out.println("Your reponse is :"+log_choice);
                System.out.println("Admin logged in sucessfully");
                adminChoice(list,rentlist);
                
            }
            else if(log_choice.equals("b")){
                System.out.println("Your reponse is :"+log_choice);
                userChoice(list,rentlist);
                
            }
            else{
                System.out.println("Your reponse is :"+log_choice);
                System.out.println("Your response is not recognised !\n Please try again later");
            }
            o.close();

            //code
        }while(true);
       
      

    }
    
}