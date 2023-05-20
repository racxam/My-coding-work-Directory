import java.util.*;

public class qof2darr {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the rows");
        r = o.nextInt();
        System.out.println("Enter the coloumn");
        c = o.nextInt();
        System.out.println();
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("enter the element at index " + i + j);
                arr[i][j] = o.nextInt();

            }
        }
        //to print
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //to search
        System.out.println("Enter the element you wants to search in the matrix");
        int g= o.nextInt();
        int ca=4;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==g){
                    System.out.println("We found that the element "+g+" is in index no "+i+j+" ");
                    ca=0;
                    break;
                }

            }
            if(ca==0){
                break;
            }
            
            
        }
        
        if(ca==4){
                
            System.out.println("Number is not there\n");

            
        }




//end of program
    }
}
