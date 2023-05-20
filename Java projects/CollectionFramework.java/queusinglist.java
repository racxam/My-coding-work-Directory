import java.util.*;

public class queusinglist {
    public static void main(String[] args) {
        List<Integer> l= new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        
        l.remove(3);
        System.out.println(l);
        System.out.println(l.size());

    }
}
