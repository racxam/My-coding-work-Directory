class Base{
    int a,b,c;
    Base(int c){
        this.c=c;
    }
    Base(Base ref){
        this.c= ref.c;
    }

    public void setVal(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
        System.out.println("C is "+ c);
    }

}
public class CopyConstructor {
    public static void main(String[] args) {
        Base b1=new Base(3);
        b1.setVal(1, 2);
        Base b2= new Base(b1);
        b2.setVal(-3, 0);

        
    }
}
