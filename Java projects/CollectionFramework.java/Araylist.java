
import java.net.SocketTimeoutException;
import java.util.*;

import javax.print.event.PrintEvent;

public class Araylist {
    public static void main(String[] args) {
        // ArrayList<Integer> list=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        //Internal working of the arraylist
        //Size n=10
        // then when 10 are filled then size= n+n/2+1 will the size

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0,0);
        // list.add("5");
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        List<Integer> newlist=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(70);
        //This function can add another list into previous list
        list.addAll(newlist);
        System.out.println(list);

        //How to get the elements at particular index 
        System.out.println("The element at index 7 is:  "+list.get(7));

        //removing elements by index
        // list.remove(7);
        //removing elements by value
        list.remove(Integer.valueOf(70));

        list.add(7);
        System.out.println(list);
        //// This is used to clear the list
        // list.clear();

        // 4th index pr 300 dalo
        list.add(4,300);
        //but i also wants to remove the 4 which was at 4th space before
        System.out.println(list);
        list.remove(5);
        System.out.println(list);

        // to do that directly
        //we'll use the set function

        // now i want 500 at 4th index
        list.set(4,  500);
        System.out.println(list);
        System.out.println(list.contains(500));


    }
}
