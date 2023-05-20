import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;
public class arrList {
    public static void main(String[] args) {
        
        
        // Interger| Float |Boolean | String  all are classes
        ArrayList<Integer> list= new ArrayList<>();
        // ArrayList<String> list1= new ArrayList<>();
        // ArrayList<Float> list2= new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int a=list.get(1);
        int b= list.get(3);
        System.out.println(a);
        System.out.println(b);
        
        // add element in between
        list.add(1,44);
        System.out.println(list);

        // set element mein kisi index pr rakha element upddate karna hai
        list.set(1,22);
        System.out.println(list);
        //delete elemnet
        list.remove(1);
        System.out.println(list);

        //size of array list
        // System.out.println(list.size());
        //iteration
        System.out.println();
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println();
        System.out.println();
        for (int i : list) {
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
        
    }

