
import java.util.*;
public class piyush {
    public static int leap(int y) {

        int yearji=y;

        while(yearji%4!=0){
            yearji=yearji-1;}
        return yearji;
        
    }
    public static String calDay(int date, int month,int year) {
        String WeekDay="none";
        ArrayList<Integer> list=new ArrayList<>();
        if(month>12||month<=0){
            return "Invalid month";
        }
        if(date<=0|| date>=31){
            return "Invalid date";
        }
        if(year<=0){
            return "Invalid year";
        }
        list.add(0);//1
        list.add(3);//2
        list.add(3);//3
        list.add(6);//4
        list.add(1);//5
        list.add(4);//6
        list.add(6);//7
        list.add(2);//8
        list.add(5);//9
        list.add(0);//10
        list.add(3);//11
        list.add(5);///12
        
        int l=year-leap(year);//2002-2000=2



        int sec=(leap(year)-1900)/2;//2000-1900=50

     
        int know=-1;

        if(sec%7==0){//
            know=0;

        }
        else{

            
            int r=sec+1;//51
            int j=1;//

            while (r%7!=0) {
                r++;//52,53,54,55,56
                j++;//2,3,4,5,6
            }
            know=j;//6

        }


        int first=date+list.get(month-1)+l+know;//10+6+2+6=24


        int rem=first%7;//3


        if(rem==0){
            WeekDay="Sunday";
        }
        else if(rem==1){
            WeekDay="Monday";
        }
        else if(rem==2){
            WeekDay="Tuesday";
        }
        else if(rem==3){
            WeekDay="Wedesday";
        }
        else if(rem==4){
            WeekDay="Thrusday";
        }
        else if(rem==5){
            WeekDay="Friday";
        }
        else if(rem==6){
            WeekDay="Saturday";
        }

        return WeekDay;}
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
    // System.out.println(leap(2022));




    }
}
