import java.security.Principal;
import java.util.*;
public class Heshset {
    public static void main(String[] args) {
        // Set<Integer> s=new HashSet<Integer>();// this is unordered
        Set<Integer> s=new LinkedHashSet<Integer>(); // this is used for odered hashset
        // Set<Integer> s= new TreeSet<>(); // sort in accending order
        s.add(1111);
        s.add(200);
        s.add(33);
        s.add(88);
        s.add(49);
        s.remove(88);
        System.out.println("Elements in the set named s is : "+s);
        System.out.println("It is printing random elements and unique elements");
        System.out.println(s.contains(49));
        System.out.println(s.contains(000 ));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
            
        
    }
}
