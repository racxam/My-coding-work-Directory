
class Square{
    int length;
    Square(int length){
        this.length=length;
    }
    public void area() {
        System.out.println("The Area is: "+length*length);
    }
    public void perimeter() {
        System.out.println("The perimeter is: "+4*length);
    }

}
public class opps2 {
    public static void main(String[] args) {
        Square s=new Square(2);
        s.area();
        s.perimeter();
    }
}
