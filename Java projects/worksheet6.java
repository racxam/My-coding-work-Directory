import java.util.*;

// Write a Program to perform the basic operations 
// like insert, delete, display, and search in the list. 
// List contains String object items where these operations are to be performed.

//List is used for ordered collection 
//Like we use Linkedhashset for ordered set
// and treeSet for sorting
// it is having index based things to insert display etc
// we can store null values in the list

//

public class worksheet6 {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();
        list1.add("I");
        list1.add("Don't");
        list1.add("want");
        list1.add("to");
        list1.add("be");
        list1.add("a");
        list1.add("Sapiophile");
        list1.add("Again");


        //Displaying content using iterator
        Iterator<String> itr= list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        try{

            list1.remove("Again");
        }
        catch(Exception e){
            System.out.println("The Item is not present in the list");
        }

        //Displaying again after removing the thing
        System.out.println("\nThe list1 is now :");
        System.out.println(list1);

        //searching in the arraylist
        System.out.println("Searching operation");
        System.out.println("Enter the string you want to search for the string: ");

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        // usign get funciton in arraylist
        try{
            int index=list1.indexOf(str);
            System.out.println("Index of "+str+" is: "+index);
        }
        catch(Exception e){
            System.out.println("This item is not present here");
        }
        
        System.out.print("\nThe value at index 3 is: ");
        System.out.println(list1.get(3));


        if(list1.contains("Sapiophile")){
            System.out.println("yes it contain's Sapiophile term");
        }
        else{
            System.out.println("It doesn't contaion Sapiophile term");
        }



        
    }
}
