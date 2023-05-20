//If there is only one method in class is absctract which don't have implementation , will make the whole class abstract
// abstract class class_name
// if someone is extending the abstract class then it means that you have to override the abstracat methods or make the new class as abstract class
// abstract class can't have an object
// concrete classes are those class which are extending the abstract classes and are not abstract

abstract class Base2{
    public Base2(){
        System.out.println("mein base2 ka constructor");
    }
    public void sayHello() {
            System.out.println("Hello!!");
    }
    abstract public void greet();
}
class Child2 extends Base2{
@Override
public void greet() {
    System.out.println("Good Night");
}
}
public class Abs {
    public static void main(String[] args) {
        
    }
}
