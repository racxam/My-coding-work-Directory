//USE OF SUPER KEYWORD
//It is used to call the overload constructor of BAse class 
// Super keyword will be used inside derived class
class Base{
    int x;
    public void getX(int x) {
        this.x=x;
    }
    public int setX() {
        return x;
    }
    Base(){
        System.out.println("I am Base constructor");
    }
    Base(int a){
        System.out.println("I am overloaded base construcotr with value "+a);
    }
}
 
class Derived extends Base{
  Derived(){
    super(5);
    System.out.println("I am Derived constructor");
  }
}
public class Construcators_in_inheritance {
 public static void main(String[] args) {
    // Base b= new Base();
    Derived d= new Derived();
 }   
}
