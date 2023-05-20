
import java.util.*;
import java.math.BigDecimal;

class Rectangle {
    Double width;
    Double length;
    Double area;
    String color;
    Scanner o = new Scanner(System.in);

     void set_length() {
        System.out.println("Enter the length of the rectangle");
        this.length = o.nextDouble();

    }

     void set_width() {
        System.out.println("Enter the width of the rectangle");
        this.width = o.nextDouble();

    }

     void set_color() {

        System.out.println("Enter the color of the rectangle");
        Scanner one=new Scanner(System.in);
        this.color = one.nextLine();


    }

    String get_color() {
        return this.color;

    }

     void find_area() {
       this.area = this.length * this.width;
        System.out.println("The area of the rectangle is " + this.area);

    }

    Double get_area() {
        return this.area;
    }
    
}
    public class experiment4 {
    

    public static void main(String[] args) {
        // o.close();
        Rectangle r1 = new Rectangle();
        r1.set_length();
        r1.set_width();
        r1.find_area();
        r1.set_color();
        Double r1area = r1.get_area();
        String r1col = r1.get_color();

        Rectangle r2 = new Rectangle();
        r2.set_length();
        r2.set_width();
        r2.find_area();
        r2.set_color();
        Double r2area = r2.get_area();
        String r2col = r2.get_color();


       r1.printji();
       System.out.println();
       System.out.println();
       r2.printji();
       
      
       BigDecimal a = new BigDecimal(r1area);
       BigDecimal b = new BigDecimal(r2area);


 

        if ((r1col.equals(r2col)) && (a.equals(b))) {
            System.out.println("Same Rectangle");
        } else {
            System.out.println("Different Rectangle");
        }

    }
}
