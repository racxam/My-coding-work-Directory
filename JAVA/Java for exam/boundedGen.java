import java.io.*;
import java.lang.*;

@SuppressWarnings("unchecked")
class demo<T extends Number>// we will use extends for both classses and Interfaces
{
T genArr[]=(T[])new Object[4];
int length=0;
public void append(T val){
genArr[length++]=val;


}

public void display() {
    for (T x : genArr) {
        System.out.println(x);
    }
}
}
public class boundedGen{
    public static void main(String[] args){
        demo<Integer> d= new demo<Integer>();//Will work only for Numbers 's Objct 
        d.append(1);
        d.append(11);
        d.append(111);
        d.append(1111);
        
        d.display();
        
        
        // demo d= new demo();//ERRROR
        // d.append(1);
        // d.append("hi");
        // d.append("bye");
        // d.append(11.11);
        // d.display();
    }
}
