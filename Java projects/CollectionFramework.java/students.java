import java.util.Objects;

public class students {
    String name;
    int roll_no;
    

    public students(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }


    @Override
    public String toString() {

        return "Student name is : "+name+'\t'+"rollno is: "+roll_no+"\n";
    }


    @Override
    public int hashCode () {
        return Objects.hash(roll_no);}


        @Override
        public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        students s = (students) o;
        return roll_no == s.roll_no;}


    

    

}
