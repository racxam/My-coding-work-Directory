@SuppressWarnings("unchecked")
class demo<T>
{
T genArr[]=(T[]) new Object[4];
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
public class gen4 {
    public static void main(String[] args) {
        // demo<Integer> d= new demo<Integer>();
        // d.append(1);
        // d.append(11);
        // d.append(111);
        // d.append(1111);
        // d.display();
        
        
        demo d= new demo();// Here we can use any object
        d.append(1);
        d.append("hi");
        d.append("bye");
        d.append(11.11);
        d.display();
    }
}
