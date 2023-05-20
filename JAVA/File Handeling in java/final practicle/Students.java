import java.util.Scanner;

public class Students {
    String name;
    int roll;

    Students(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public static void inputStudents(Students[] s) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= s.length; i++) {
            System.out.println("Enter name of student " + (i + 1));
            String name = sc.nextLine();
            System.out.println("Enter roll_no of the  student " + (i + 1));
            int roll = sc.nextInt();
            s[i] = new Students(name, roll);
            sc.nextLine();
        }
        sc.close();

        public static void outputStudents(Students [ ] s)
{
try {
System.out.print]n("----- Roll
• Name
for (int i = 0; i ‹ s.length; i++)
{
System.out.printIn("It" + s[i].roll + "It\t" + s[i].name);
System.out.println(
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.printin(e);
}
catch (Exception e) {
System.out.printin(e);
public static void main(String[] args)
{
Students [] s = new Students [3];
inputStudents (s); outputStudents (s);

    }
}