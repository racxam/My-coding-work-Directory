class Student{
    String name;
    int age;
    
    public void printInfo(String name) {
        System.out.println(this.name);

         
    }
    public void printInfo(int age) {

        System.out.println(this.age);
         
    }
    public void printInfo(String name,int age) {

        System.out.println(this.name+ " and "+this.age);
         
    }
    

}
public class anotherexampleofOOPS {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="sumit";
        s1.age=21;

        s1.printInfo("sumit");
        s1.printInfo(21);
        s1.printInfo("sumit",21);
    }
}
