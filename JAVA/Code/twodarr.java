import java.util.*;
public class twodarr {
    public static void main(String[] args) {
      Scanner o= new Scanner(System.in);
      System.out.println("Enter the rows");
      int r=o.nextInt();
      System.out.println("Enter the column");
      int c=o.nextInt();
    
      int [][]numbers=new int[r][c];
    //   int numbers[][]=new int[r][c];
    // input into the array
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.println("Enter the element for index"+i+","+j);
            numbers[i][j]=o.nextInt();
        }
    }
    System.out.println("The 2D array is following");
    for (int i = 0; i < r; i++) {

        for (int j = 0; j < c; j++) {
           System.out.print("|"+numbers[i][j]+" ");
        }
        System.out.print("|"+"\n");
    }

    }
    
    }
    

