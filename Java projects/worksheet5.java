// hash table in java implements hashtable, which maps keys to value which inherits dictionary class and 
//implements the map interface 
// hashtable is an array of list
//each list  in known as bucket
//postion of bucket is called using hashcode
//hashtable contains values based on key
//java hashtable contains unique elements
//java hashtable doestn't allow null key or value
//this is synchronised
//initial capacity of the hastable is 11 and load factor is 7.5
import java.util.*;
public class worksheet5 
    
{
  public static void main(String[] args) {

  Hashtable<Integer,String> hm= new Hashtable<Integer,String>();
    hm.put(100,"Sumit");
    hm.put(102,"shiva");
    hm.put(103,"ravi");
    hm.put(103, "Ensaan");
    hm.put(104,"aman");
    System.out.println(hm);
    hm.remove(100);
    System.out.println(hm);
// for get or default values
    System.out.println(hm.getOrDefault(105,"Not found"));
    System.out.println(hm.getOrDefault(102,"Not found"));

    for(Map.Entry m: hm.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
    System.out.println("\nsets");

    Set h=hm.keySet();   
    Iterator itr=h.iterator();

    
     while (itr.hasNext()){

       System.out.println(itr.next());
     }
     System.out.println(hm.get(103));// using get method
     System.out.println("Keys are: "+ hm.keys() );
     System.out.println("Keys are: "+ hm.keySet());
     System.out.println("Values are: "+ hm.values() );

     System.out.println("using enumrations");

     Enumeration e = hm.elements();// values
     while (e.hasMoreElements()) {
       System.out.println(e.nextElement());
     }
     System.out.println("\n");
     Enumeration e1 = hm.keys();// keys`
     while (e1.hasMoreElements()) {
       System.out.println(e1.nextElement());
     }
  }
}