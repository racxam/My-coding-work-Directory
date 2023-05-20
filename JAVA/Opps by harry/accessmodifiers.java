class Clyinder{
    private double r;
    private double h;
    private double pi=3.14;
    public void setH(double h) {
       this.h=h;
        
    }
    public void setR(double r) {
       this.r=r;

    }
    public double getH() {
        return h;
    }
    public double getR() {
        return r;
    }
    public void surfArea() {
        System.out.println("The Surface area of the clyinder is: "+(2*pi*r*r+ 2*pi*r*h));
    }

}
public class accessmodifiers {
    public static void main(String[] args) {
        Clyinder c= new Clyinder();
        c.setH(1);
        c.setR(1);
        double hi=c.getH();
        double rad=c.getR();
        System.out.println(hi);
        System.out.println(rad);
        c.surfArea();
         
    }
}
