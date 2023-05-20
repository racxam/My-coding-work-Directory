import java.util.*;
public class StackusingCollectionFramework {
    public static void pushbtm(int data,Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp=s.pop();
        pushbtm(data,s);
        s.push(temp);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushbtm(top,s);

    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4); 
        //push at the bottom of the stack

        // pushbtm(5,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            System.out.println(s.pop());

        }

    }
}
