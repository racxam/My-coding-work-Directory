class Pen{
    String color;
    String type;// ballpen or gel pen

    public void write() {
        System.out.println("Write Something"+" with "+color+" pen "+"of "+type);
    }
    public void TC() {
     System.out.println(this.color);
     System.out.println(this.type);


    }

}
public class OOPS {
    public static void main(String[] args) {
        Pen pen1= new Pen();
        pen1.color="Black";
        pen1.type="Gel";
        pen1.write();
        pen1.TC();

        Pen pen2= new Pen();
        pen2.color="Blue";
        pen2.type="ballpoint";
        pen2.write();
        pen2.TC();

    }
}
