import java.util.*;

public class reverseString {
    public static void rStr(String str,int i) {
        System.out.print(str.charAt(i));
        i--;
        if(i>=0){
            rStr(str, i);
        }
        else{
            return;
        }

    }
public static void OccFinder(String str,char ele,int i,int j) {
    
   if(str.charAt(i)==ele){
    
    if(str.charAt(j)==ele){
        System.out.println("The first index of "+ele+" is "+i);
        System.out.println("The Last index of "+ele+" is "+j);
        return;
    }
    else{
        j--;
        OccFinder(str, ele, i, j);
    }



   }
   else{
    i++;
    OccFinder(str, ele, i,j);
   }



}
public static int seeArray(int arr[],int i) {
    if(i==arr.length-1){
        return 1;
    }
    if(arr[i]>arr[i+1]){
        return 0;
        
        
        
        
    }  
    else{
        return seeArray(arr, i+1);
    }
    
    
}

//to move all x's
static int count=0;
static String newstr="";
public static void moveStr(String str, int i) {

    if(str.charAt(i)=='x'){
        count++;

    }
    else{
        newstr=newstr+str.charAt(i);
    }
    if(i<str.length()-1){

        moveStr(str, i+1);
    }
    
    
    
}
    public static void main(String[] args) {
        Scanner o= new Scanner(System.in);
        // System.out.println("Enter anything");

        // String str= o.nextLine();
        //Rerversing string with iteration
        // for (int i = str.length()-1; i >=0; i--) {
            //     System.out.print(str.charAt(i));
            // }
            
            //Rerversing string with Recursion
            // rStr(str,str.length()-1);
        //NExt QUe
        //Find the first and last occurence of a word in string
        // String str="abbcdedfjdkfafes";
        // System.out.println("Enter the element");
        // char ele= o.next().charAt(0);
        // //Usign recursion
        // OccFinder(str,ele,0,str.length()-1);

        //Nexest question 
        // To check if array is strictly increasing or not
        // int arr[]={1,2,3,4,8,12};
        // int c=seeArray(arr,0);
        // if(c==1){
        //     System.out.println("This array is sorted");
        // }
        // else{
        //     System.out.println("This array is not sorted");
        // }

        //Next 
        // Move all the strings to the end of the string
        // String str="axbcxxd";
        // System.out.println("Old string is "+str);
        // moveStr(str,0);
        // for (int i = 1; i <=count; i++) {
        //     newstr=newstr+'x';
        // }

        // System.out.println("The new string is "+newstr);
        

        
    }
}
