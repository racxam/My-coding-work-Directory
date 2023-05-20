import java.util.*;

public class stck {
    public static void main(String[] args) {
        Stack<String> fruit= new Stack<>();
        fruit.push("Kela");
        fruit.push("aam");
        fruit.push("narangi");
        fruit.push("angoor");

        for (String ele : fruit) {
            System.out.println(ele);
        }
        System.out.println("Stack is: "+fruit);
        System.out.println("Peek element in the fruit Stack is: "+fruit.peek());
        System.out.println(fruit.pop()+" is pooped now");
        
        System.out.println("Now stack is: "+fruit);

    }
}
