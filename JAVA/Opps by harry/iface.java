

//in abstract class is 0-100% abstract but a interface is 100% abstract
// it simply means that a abstract class may contain abstract + concrete methods
// interface will have only abstract methods
//interface is a group of related methods with empty body
// when we are using interface in other classes than we have to use the implementes keyword to use inheritance
// all the methods of the interfaces have to be pubilc in the implemented clases , where we are writing there bodies
// you can create propertise in the interfaces
// you can't modify that property as they are final
// all the propertise in the interfaces are final
// we can implement more than one classes
// java don't allow multiple inheritance so we use interfaces to force java to allow multiple inheritance
// propertise need not to be always overwrite but we can override the propertise of the interfaces
// we can not creat the objects of the interfaces but we can create the references of the interfaces
// a class can't extends an interface but only can implement
// a interface can extends an interface  but can't implements another interface

interface shape{
    int x=45;
    void setLen();
    void setHei();


}
interface circleShape extends shape{
    
}
class circle implements circleShape{
    public void setLen() {
       System.out.println("I am length"); 
    }
    public void setHei() {
       System.out.println("I am height"); 
    }

}


public class iface {
    public static void main(String[] args) {
        circle c= new circle();
        c.setLen();
        c.setHei();
    }
}
