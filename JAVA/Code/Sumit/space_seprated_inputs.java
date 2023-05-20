// A program to creat the spcae seperated inputs
import java.util.Scanner;
public class space_seprated_inputs {
    public static void main(String[] args) {
        int a,b;
        Scanner o= new Scanner(System.in);
        String str=new String();
        str= o.nextLine();
        String sa[]=str.split(" ");
        for (String h : sa) {
            System.out.println(h);
        }


    }
}
