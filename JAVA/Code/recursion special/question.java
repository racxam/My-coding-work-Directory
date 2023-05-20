import java.util.*;
import java.lang.Math;
public class question {
    public static double root(double disr) {
    double sol= Math.sqrt(disr);
    return sol;
        
    }
    public static void main(String[] args) {
        // ax^2 +Bx+c
        Scanner o=new Scanner(System.in);
        System.out.println("Enter a");
        double a=o.nextDouble();
        System.out.println("Enter b");
        double b=o.nextDouble();
        System.out.println("Enter c");
        double c=o.nextDouble();
        double disr= b*b-4*a*c;
        if(disr<0){
            System.out.println("there are no solution!");
        }
        else if(disr==0){

            double sol= -b+(root(disr))/2*a;
            System.out.println("Root actually one real roots");
            System.out.println(sol);
        }
        else if(disr>0){
            double sol= -b+(root(disr))/2*a;
            System.out.println("There are two distinct real roots");
            System.out.println(sol+"and"+-sol);

        }

        o.close(); 
    }
}
