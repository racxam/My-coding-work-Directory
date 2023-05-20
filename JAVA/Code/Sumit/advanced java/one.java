
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
public class one{
    public static void main(String[] args) {
        ArrayList<String> OwnerLists =new ArrayList<String>();
        OwnerLists.add("Rahul");
        OwnerLists.add("Pradeep");
        OwnerLists.add("Sumit");
        OwnerLists.add("Rohit");

        LinkedList<String> hey= new LinkedList<String>();
        hey.add("1");
        hey.add("2");
        hey.add("3");
        hey.add("4");
        hey.add("5");

        Iterator itr = OwnerLists.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());


        }

        Iterator itrl=hey.iterator();
        while(itrl.hasNext()){
            System.out.println(itrl.next());
        }

    }
}
