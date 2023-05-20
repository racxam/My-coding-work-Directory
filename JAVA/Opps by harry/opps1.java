class Employee{
    int salary;
    String name;
    public void setName(String name) {
        this.name=name;


    }
    public void getName() {
        System.out.println("The name of Employee is: "+this.name);
    }
    public void getsalary(int sal) {
        this.salary=sal;
        System.out.println("The salary of the employee "+this.name+" is "+sal);
    }
}
public class opps1 {
    public static void main(String[] args) {
      Employee one=new Employee();
     one.setName("Sumit");
     one.getName();
     one.getsalary(4400);
    }
}
