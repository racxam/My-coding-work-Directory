
import java.util.*;

public class Rockpapersessior {
    public static void main(String[] args) {
        //this game is computer vs me;
        Scanner o= new Scanner(System.in);
        System.out.println("0 for Rock");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissor");
        int inpM=o.nextInt();
        Random r=  new Random();
        int inpC= r.nextInt(3);
        if(inpM==inpC){
            System.out.println("Draw");
        }
        else{
            if(inpM==0&& inpC==1){
                System.out.println("Computer won!");
            }
            else if(inpM==0 && inpC==2){
                System.out.println("I won");
            }
            else if(inpM==1&& inpC==0){
                System.out.println("I won");
            }
            else if(inpM==1 && inpC==2){
                System.out.println("Computer won!");
            }
            else if(inpM==2&& inpC==0){
                System.out.println("I won!");
            }
            else if(inpM==2 && inpC==1){
                System.out.println("Computer won");
            }


         }

    }
}
