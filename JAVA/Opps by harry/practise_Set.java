//question 1 +2
// abstract class Pen{
//    abstract public void refill();
//    abstract public void write();
   
// }
// class FountainPen extends Pen{
//     @Override
//     public void refill(){
//         System.out.println("Refill is refilled");
//     }
//     @Override

//     public void write(){
//         System.out.println("I am writing ");
//     }
//     public void changeNib() {
//             System.out.println("Now nib is changed and new nib is enthroned");
//     }

// }

//question 3
// interface Basic_Animal{
//     abstract void sleep();
//     abstract void eat();
// }
// class Monkey{
//     public void jump() {
//         System.out.println("I can jump");
//     }
//     public void bite() {
//         System.out.println("I can bite");
//     }
// }
// class Human extends Monkey implements Basic_Animal {
// public void sleep() {
//     System.out.println("I am sleeping");
// }
// public void eat() {
//     System.out.println("I am eating");
// }
// }

//question 4 
// abstract class Telephone{
//     abstract void ring();
//     abstract void lift();
//     abstract void disconnect();


// }
// class SmartTelephone extends Telephone{
//     @Override
//     public void ring() {
//         System.out.println("I am ringing");
//     }
//     @Override
//     public void lift() {
//         System.out.println("I am lifting");
//     }
//     @Override
//     public void disconnect() {
//         System.out.println("I am disconnecting");
//     }
// }

//quetion 6
interface SmartTvRemote{

}
interface TvRemote extends SmartTvRemote{
void changeChannel();
void switchoff();
void switchon();
}
class Tv implements TvRemote{
    @Override
    public void changeChannel(){
        System.out.println("changning channel");
    }
    @Override
    public void switchoff(){
        System.out.println("switching off");
    }
    @Override
    public void switchon(){
        System.out.println("Switching on");
    }
}
public class practise_Set {
    public static void main(String[] args) {
        //question 1+2
        // FountainPen pen = new FountainPen();
        // pen.refill();
        // pen.write();
        // pen.changeNib();

        //question 3
        // Human sumit= new Human();
        // sumit.eat();
        // sumit.sleep();
        // sumit.bite();
        // sumit.jump();

        // question 5 is show ploymorphism in question 3
        // Monkey m1=new Human();//now we are giving human a reference of monkey and from now 
        //                       // onwards all the methods of monkey will work not of human
        
        // m1.bite();
        // m1.jump();

        // question 4
        // we have to show here polymorphism here
        // SmartTelephone st1= new SmartTelephone();
        // st1.disconnect();
        // st1.ring();
        // st1.lift();

        //all next questions

        Tv lg= new Tv();
        lg.switchoff();
        lg.switchon();
        lg.changeChannel();


    }
}
