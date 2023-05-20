import java.util.*;
import java.util.Map.Entry;

import ad.iterator;


public class mapp {
    public static void main(String[] args) {
        Map<String,Integer> m= new HashMap<>(); // TreeMap will print the strings in the sorted orders acd to the dictionary
        m.put("one", 1);
        m.put("two", 2);
        m.put("theree", 3);
        m.put("fice", 5);
        // m.put("for", 4);
        if(!m.containsKey("for"))
        m.put("for", 44);

        m.putIfAbsent("two", 222);

        System.out.println(m);

      for (Map.Entry<String,Integer> e : m.entrySet()) {
        System.out.println(e);

        System.out.println(e.getKey());
        System.out.println(e.getValue());  }
        System.out.println("Bhjoooo");

        for(String str: m.keySet()){
            System.out.println(str);
        }

        for (Integer i : m.values()) {
            System.out.println(i);
        }



    }
}
