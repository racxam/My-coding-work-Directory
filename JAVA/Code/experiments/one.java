import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the quadratic equation in form of ax^2 +bx +c");
        System.out.println("Enter a");
        Double a = o.nextDouble();
        System.out.println("Enter b");
        Double b = o.nextDouble();
        System.out.println("Enter c");
        Double c = o.nextDouble();
        Double d = (b * b) - (4 * a * c);
        Double r1, r2;
        if (d > 0) {

            r1 = -b + Math.pow(d, 0.5) / 2 * a;
            r2 = -b - Math.pow(d, 0.5) / 2 * a;
            System.out.println("Roots are " + r1 + " and " + r2);
        } 
        else if (d == 0) {
            Double r = -b / 2 * a;
            System.out.println("There will be only one real root i.e " + r);
        }
        else{
            System.out.println("No real root for this Quadratic equation");
        }

    }

}
