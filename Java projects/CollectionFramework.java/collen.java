import java.util.*;
public class collen {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int y= Arrays.binarySearch(arr, 4);
        if(y>0){
            System.out.println("The key is present at: "+y);
        }
        else{
            System.out.println("this key is not present here");
        }


    }
}
