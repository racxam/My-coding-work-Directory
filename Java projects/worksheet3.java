import java.util.Scanner;

import java.lang.Math;

abstract class Account{

abstract public void calculateInterest();
}
class FD extends Account{
    Double Amount;
    Double InterestRate;
    int age;

    double t;
    int quat;
    Double MAmount;
    public void getFD(){
        System.out.println("Enter the prinicpal Amount: ");
        Scanner fds=new Scanner(System.in);
        Amount= fds.nextDouble();
        if(Amount<=500 ){

            System.out.println("Enter correct Amount , Amount shouldn't be less than 500");
            System.out.println("Your program exited sucessfully!");
            System.exit(0);
        }
    
        


            System.out.println("Enter Your age: ");
            age= fds.nextInt();
        
            if(age<=0 || age>150){

                System.out.println("Enter correct age");
                System.out.println("Your program exited sucessfully!");
                System.exit(0);
            }
        
        
        System.out.println("Enter maturity priod in days : ");
        t= fds.nextDouble();

        quat=(int)t/7;
        fds.close();


     }
     @Override
     public void calculateInterest(){

        System.out.println("This is calculated for the FD BANK ACCOUNT: --->\n\n");
        if(Amount>10000000){
            System.out.println("This is calculated for the amount that are greater than 1 crore: --->");
            if(age>60){// for seniors 
                
                InterestRate=(quat<=2 && quat>=1) ? 6.50 :((quat<=3 && quat>2) ? 6.75:((quat<=6 && quat>3)? 6.75 :((quat<=9 && quat >6)? 8.00:((quat<=21 && quat >6)?8.25 :((quat<=53 && quat>21)?10.00:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
            }
            else{// for juniors
                InterestRate=(quat<=2 && quat>=1 ) ? 6.00 :((quat<=3 && quat>2) ? 6.25:((quat<=6 && quat>3)? 6.50 :((quat<=9 && quat >6)? 7.00:((quat<=21 && quat >6)?7.50 :((quat<=53 && quat>21 )?8.25:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(Senior Citizen) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
                
            }
            
        }
        // amount less than 1 crore
        else{
            System.out.println("This is calculated for the amount that are lesser than 1 crore: --->\n\n");
            if(age>60){// for seniors 
                
                InterestRate=(quat<=2 && quat>=1) ? 5.50 :((quat<=3 && quat>2) ? 5.75:((quat<=6 && quat>3)? 6.00 :((quat<=9 && quat >6)? 6.25:((quat<=21 && quat >6)?6.50 :((quat<=53 && quat>21)?6.75:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
            }
            else{// for juniors
                InterestRate=(quat<=2) ? 6.00 :((quat<=3 && quat>2) ? 6.25:((quat<=6 && quat>3)? 6.50 :((quat<=9 && quat >6)? 7.75:((quat<=21 && quat >6)?6.00 :((quat<=53 && quat>21)?6.25:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }

            }

        }

        if(InterestRate!=-1){

            t=t/366;
            InterestRate=InterestRate/100;
            // now we'ill calculate the intersest
            MAmount=Amount*(Math.pow((1+(InterestRate/4)),((4*(t))))-1);
           
            
            System.out.println("Interest on the Above amount is: "+MAmount);
            System.out.println("Your total amount is: "+ (Amount+MAmount));
        }
        else{
            System.out.println("Can't calculate Interest Something went wrong!!");
        }
        
        
    }



}

//for RD
class RD extends Account{
    Double Amount;
    Double InterestRate;
    int age;

    int t;
    int quat;
    Double MAmount;
    public void getRD(){
        System.out.println("Enter the prinicpal Amount: ");
        Scanner fds=new Scanner(System.in);
        Amount= fds.nextDouble();
        if(Amount<=1000 ){

            System.out.println("Enter correct Amount , Amount shouldn't be less than 1000");
            System.out.println("Your program exited sucessfully!");
            System.exit(0);
        }
        


        System.out.println("Enter Your age: ");
        age= fds.nextInt();
        if(age<=0 || age>150){

            System.out.println("Enter correct age");
            System.out.println("Your program exited sucessfully!");
            System.exit(0);
        }

    
        
        
        System.out.println("Enter maturity priod in months : ");
        t= fds.nextInt();

        quat=t/4;
        fds.close();


     }

    @Override
    public void calculateInterest(){
        System.out.println("This is calculated for the RD BANK ACCOUNT: --->\n\n");
        if(Amount>10000000){
            System.out.println("This is calculated for the amount that are greater than 1 crore: --->\n\n");
            if(age>60){// for seniors 
                
                InterestRate=(quat<=2) ? 7.50 :((quat<=3 && quat>2) ? 7.75:((quat<=4 && quat>3)? 8.00 :((quat<=5 && quat >4)? 8.25:((quat<=6 && quat >5)?8.50 :((quat<=7 && quat>6)?8.75:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{1
                    System.out.println("Can't Calculate");
                }
            }
            else{// for juniors
                InterestRate=(quat<=2) ? 8.00 :((quat<=3 && quat>2) ? 8.25:((quat<=4 && quat>3)? 8.50 :((quat<=5 && quat >4)? 8.75:((quat<=6 && quat >5)?9.00 :((quat<=7 && quat>6)?9.25:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(Senior Citizen) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
                
            }
            
        }
        // amount greater than 1 crore
        else{
            System.out.println("This is calculated for the amount that are lesser than 1 crore: --->\n\n");
            if(age>60){// for seniors 
                
                InterestRate=(quat<=2) ? 5.50 :((quat<=3 && quat>2) ? 5.75:((quat<=4 && quat>3)? 6.00 :((quat<=5 && quat >4)? 6.25:((quat<=6 && quat >5)?6.50 :((quat<=7 && quat>6)?6.75:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
            }
            else{// for juniors
                InterestRate=(quat<=2) ? 7.00 :((quat<=3 && quat>2) ? 7.25:((quat<=4 && quat>3)? 7.50 :((quat<=5 && quat >4)? 7.75:((quat<=6 && quat >5)?8.00 :((quat<=7 && quat>6)?8.25:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }

            }

        }

        // now we'ill calculate the intersest
        if(InterestRate!=-1){

            t=t/12;
            InterestRate=InterestRate/100;
            // now we'ill calculate the intersest
            MAmount=Amount*(Math.pow((1+(InterestRate/4)),((double)(4*(t))))-1);
            System.out.println("Interest on the Above amount is: "+MAmount);
            System.out.println("Your total amount is: "+ (Amount+MAmount));
        }
        else{
            System.out.println("Can't calculate Interest Something went wrong!!");
        }
        
    }

}
class SB extends Account{
    Double Amount;
    Double InterestRate;
    int age;

    double t;
    int quat;
    Double MAmount;
    public void getSB(){
        System.out.println("Enter the prinicpal Amount: ");
        Scanner fds=new Scanner(System.in);
        Amount= fds.nextDouble();
        if(Amount<=100 ){

            System.out.println("Enter correct Amount , Amount shouldn't be less than 100");
            System.out.println("Your program exited sucessfully!");
            System.exit(0);
        }
        
        

        System.out.println("Enter Your age: ");
        age= fds.nextInt();
        if(age<=0 || age>150){

            System.out.println("Enter correct age");
            System.out.println("Your program exited sucessfully!");
            System.exit(0);
        }
        
        System.out.println("Enter maturity priod in days : ");
        t= fds.nextDouble();

        quat=(int)t/7;
        fds.close();


     }
    
    @Override
    public void calculateInterest(){
        

            System.out.println("This is calculated for the SAVING BANK ACCOUNT: --->\n\n");
            if(age>60){// for seniors 
                
                InterestRate=(quat<=2 && quat>=1) ? 4.50 :((quat<=3 && quat>2) ? 4.75:((quat<=6 && quat>3)? 5.00 :((quat<=9 && quat >6)? 5.25:((quat<=21 && quat >6)?5.50 :((quat<=53 && quat>21)?6.00:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(General) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
            }
            else{// for juniors
                InterestRate=(quat<=2 && quat>=1 ) ? 3.75 :((quat<=3 && quat>2) ? 4.25:((quat<=6 && quat>3)? 4.50 :((quat<=9 && quat >6)? 5.00:((quat<=21 && quat >6)?5.20 :((quat<=53 && quat>21 )?5.75:-1)) )));
                if(InterestRate!=-1){
                    System.out.println("The Interest Rate(Senior Citizen) for Amount "+Amount+" is :-> "+InterestRate);
                }
                else{
                    System.out.println("Can't Calculate");
                }
                
            }
            

        

        if(InterestRate!=-1){

            t=t/366.0;
            InterestRate=InterestRate/100;
            // now we'ill calculate the intersest
            MAmount=Amount*(Math.pow((1+(InterestRate/4)),((4*(t))))-1);           
            System.out.println("Interest on the Above amount is: "+MAmount);
            System.out.println("Your total amount is: "+(Amount+MAmount));
            
        }
        else{
            System.out.println("Can't calculate Interest Something went wrong!!");
        }
        
        
    }

    


}
public class worksheet3 {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("------------WELCOME TO SUMIT'S INTEREST CALCULATOR---------");
        wait(900);
        System.out.println("\t----->MAIN MENU<----------");
        wait(800);
        System.out.println("Choose Any one of the following");
        wait(800);
        System.out.println("1. CALCULATE FD INTEREST");
        wait(800);
        System.out.println("2. CALCULATE RD INTEREST");
        wait(800);
        System.out.println("3. CALCULATE SB INTEREST");
        wait(800);
        System.out.println("4. EXIT THE CALCULATOR\n\n");
        Scanner o= new Scanner(System.in);
        int i=o.nextInt();
        switch (i) {
            case 1:
                FD c1=new FD();
                c1.getFD();
                c1.calculateInterest();
                
                break;
                

            case 2:
                 RD c2= new RD();
                 c2.getRD();
                 c2.calculateInterest();
                
                break;

            case 3:
                 SB c3= new SB();
                 c3.getSB();
                 c3.calculateInterest();
                
                break;

            case 4:
                System.out.println("INTEREST CALCULATOR EXITED SUCESSFULLY----------->");
                System.exit(0);

                break;
                
            default:
                System.out.println("Enter the Right Choice");
                break;
        }
        o.close();
    }
}
