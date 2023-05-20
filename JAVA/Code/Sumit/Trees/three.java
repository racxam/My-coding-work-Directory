
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class three {
    public static void main(String[] args) {
        HashSet<String> list= new HashSet<String>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("it will store unique values");
        Iterator itr= list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

