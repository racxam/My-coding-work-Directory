import java.util.*;
public class basicc {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(list+" "+list.size());
        for (int i: list) {
            System.out.println(i);
        }
    }
}
