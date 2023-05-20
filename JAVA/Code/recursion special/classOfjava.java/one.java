import java.util.*;
public class one {
    public static class Student{
        String name;
        int marks;
        float per;
        Student(String name){
            this.name=name;
        }
        public void set(int mark,float per){
            System.out.println(name+" Your marks are "+mark);
            System.out.println(name+" Your persentage is "+per+"%");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner o=new Scanner(System.in);
        String name=o.nextLine();
        Student s=new Student(name);
        System.out.println("Enter your marks");
        int marks=o.nextInt();
        System.out.println("Enter your persentage");
        float per= o.nextFloat();
        s.set(marks, per);

        
    }
}
