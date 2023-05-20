

import java.util.ArrayList;

public class stackusingLL {
    public static class Stack{
       static ArrayList<Integer> list =new ArrayList<Integer>();
        public static boolean isEmpty() {
            return list.size()==0; }
            //push
        public static void push(int data) {



                list.add(data);

        }
        //pop
        public static int pop() {
            int temp= list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
        //peek
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            System.out.println(s.pop());
        }

    }
}
