import java.util.HashSet;
import java.util.Set;

public class hsin {
    public static void main(String[] args) {
        Set<students> s=new HashSet<>();
        s.add(new students("anuj",1));
        s.add(new students("sumti",1));
        s.add(new students("amit",1));
        s.add(new students("ankit",1));

        // it is not voilating the propertiese of the set but it is try the hasing of objects irrespective 
        // of the name

        // to avoid this roll no ambiguity we'll generate hash code on basis of roll_n's

        System.out.println(s);

    }
}
