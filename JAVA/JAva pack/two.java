package deux;
import un;
class check2 extends check{
public void meth1() {
    System.out.println(x);//public
    System.out.println(y);//pro
    System.out.println(a);//default
    // System.out.println(p);//private
}
}
public class two {
    public static void main(String[] args) {
        check2 one = new check2();
        one.meth1();
        
    }
}
