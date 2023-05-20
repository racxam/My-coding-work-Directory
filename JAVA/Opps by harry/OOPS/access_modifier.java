class C1{
    public int x=5;
    protected int y=45;
    int z=3;
    private int a=78;
    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }



}
class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a);
    }
}
public class access_modifier {
    public static void main(String[] args) {
        // C1 c1= new C1();
        // c1.meth1();// using in same class
        // //using in same package
        // System.out.println(c1.x);
        // System.out.println(c1.y);
        // System.out.println(c1.z);
        // System.out.println(c1.a);// this private won't run in same package

        C2 c2= new C2();
        c2.meth1();
        System.out.println();
        System.out.println();
        c2.meth2();

        
    }
}
