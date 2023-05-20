import java.util.*;

interface DemoAno{
        void meth1();
        void meth2();
}
@FunctionalInterface
interface lambInterface{
    void fun1();
}
// class AnonyDemo implements DemoAno{
//     @Override
//     public void meth1(){
//         System.out.println("Meth 1");
//     }
//     @Override
//     public void meth2(){
//         System.out.println("Meth 2");

//     }
//     public void display(){
//         System.out.println("Helllo");
//     }
// }
public class four_anonymus {
    public static void main(String[] args) {
        // DemoAno obj= new AnonyDemo();
        // // obj.display();
        // obj.meth1();
        // obj.meth2();
        // DemoAno obj= new DemoAno() {
        //     @Override
        //     public void meth1(){
        // System.out.println("Meth 1");
        // }
        // @Override
        //     public void meth2(){
        // System.out.println("Meth 2");}



        // };
        // obj.meth1();
        // obj.meth2();

        //Lambda experession
        lambInterface o=()->{
            System.out.println("I m calling fun()1");
        };
        o.fun1();

        
}}
