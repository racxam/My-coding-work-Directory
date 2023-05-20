
//There's a huge difference between Double and double 
// small double is real primitive data type and the big one is false it is a Object
// == operator in primitive datatypes works fine but for objects it compares the refrence of the object not there value
// so we should use .equalto();

class Geo {
     double h,r,l,w;
     double pi=3.14;
    public void setH(double h) {
        this.h=h;
    }
    public void setR(double r) {
        this.r=r;
    }
    public void setL(double l) {
        this.l=l;
    }
    public void setW(double w) {
        this.w=w;
    }
}
class Circle extends Geo{
    public void cArea() {
         System.out.println("The area of the circle is "+pi*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Geo one= new Geo();
        // one.setR(2);
        Circle c=new Circle();
        c.setR(1);
        c.cArea();

        
        
    }
}
