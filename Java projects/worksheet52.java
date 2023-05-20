import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.*;

public class worksheet52 {
    public static void main(String[] args) {
        // Simple unordered HashSet
        Set<String> ns= new HashSet<>();
        ns.add("Sumit");
        ns.add("is ");
        ns.add("a");
        ns.add("Sapiophile");
        
        // Specific ordered LinkedHashset
        Set<String> nsspe= new LinkedHashSet<>();
        nsspe.add("Sumit");
        nsspe.add("is ");
        nsspe.add("a");
        nsspe.add("Sapiophile");

        
        //using for each to print the set

        System.out.println("\n----->Printing the ordered Hashset");
        for(String ins:nsspe){
            System.out.println(ins);
        }
        
        // iterator use kia
        System.out.println("-------->Printing the Unordered Hashset\n");
    
         Iterator itr= ns.iterator();
        //loops use
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //direct printing of hashset
        System.out.println("------->Printing using the direct print stataement\n");
        System.out.println(ns);

        //1.contains 
        System.out.println("\nDoes this Set contains 'Sapiophile' term: "+ns.contains("Sapiophile"));
        System.out.println("Does this Set Contains 'AlterEgo' term: "+ns.contains("AlterEgo"));
        System.out.println();

        // 2.Removing values from set
        System.out.println("Set before updation: "+ns);
        ns.remove("Sapiophile");
        System.out.println("Set after updation: "+ns);

        // Different operations on hash set
        //1.Union
        int list1[]={11,22,45,56,77,33};
        int list2[]={13,22,45,54,77,35};
        Set<Integer> set1= new HashSet<>();
        for (int i = 0; i < 6; i++) {
            set1.add(list1[i]);
        }
        
        Set<Integer> set2= new HashSet<>();
        for (int i = 0; i < 6; i++) {
            set2.add(list2[i]);
        }
        
        
        Set<Integer> s1Us2= new HashSet<>(set1);
        s1Us2.addAll(set2);
        System.out.println("\nUnion of set1 and set2 is :");
        System.out.println(s1Us2);
        
        //2 Intersection
        Set<Integer> s1Is2= new HashSet<>(set1);
        s1Is2.retainAll(set2);
        System.out.println("\nIntersection of set1 and set2 is :");
        System.out.println(s1Is2);

        // Symmetric difference
        Set<Integer> s1ss2=new HashSet<>(set1);
        s1ss2.removeAll(set2);
        System.out.println("\nDifference of two set's is: ");
        System.out.println(s1ss2);


        // sorting the two sets usign the TreeSEt
        try{

        
        TreeSet sortedset1= new TreeSet<Integer>(set1);
        System.out.println("\nThe sorted Set1 is: "+sortedset1);
        System.out.println("First element of sorted set1 is: "+sortedset1.first());
        System.out.println("last element of sorted set1 is: "+sortedset1.last());
        
        TreeSet sortedset2= new TreeSet<Integer>(set2);
        System.out.println("\nThe sorted Set2 is: "+sortedset2);
        System.out.println("First element of sorted set2 is: "+sortedset2.first());
        System.out.println("last element of sorted set2 is: "+sortedset2.last());
        }
        catch(Exception e){
            System.out.println(e);
        }






        


    }
}
