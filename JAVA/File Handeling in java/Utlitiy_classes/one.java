import java.lang.reflect.Array;
import java.util.*;;
public class one{
    public static void main(String[] args) {
        int arr[]={1,22,23,4,3,3,43,53,545,655,6,43,3,3,4469,9,5};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}
