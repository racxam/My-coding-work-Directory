import java.util.*;

public class tagdadayofweek {
    public static int leap(int y) {
    
        int yearji=y;
    
        while(yearji%4!=0){
            yearji=yearji-1;}
        return yearji;
        
    }
    public static int OddYear(int year) {
        int odd=0;
        int recYear=(year/100)*100;
        int diff=year-recYear;
        int i=1;
        
        while (see>400) {
            int see=recYear-(400*i);
            i++;
        }
        if(see==100){
            odd=odd+5;
        }
        else if(odd==200){
            odd=odd+1;
        }
        else if(odd==300){
            odd=odd+1;
        }
        


    }
    public static String calDay(int date,int month,int year) {
        int newYear=year-1;
        int Ony=OddYear(year);
    }
    public static void main(String[] args) {
        Scanner o1= new Scanner(System.in);
        Scanner o2= new Scanner(System.in);
        Scanner o3= new Scanner(System.in);
        System.out.println("Enter the date");
        int date=o1.nextInt();//date
        System.out.println("Enter the Month");
        int month=o2.nextInt();// month
   
        System.out.println("Enter the Year");
        int year= o3.nextInt();//yea
 
        String WeekDay=calDay(date,month,year);
        System.out.println(WeekDay);

    }
}
