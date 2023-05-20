import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lis {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        Iterator itr= l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Integer i : l1) {
            System.out.println(i);
        }
        System.out.println(l1);
    }
}
