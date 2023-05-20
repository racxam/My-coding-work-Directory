import java.util.ArrayList;

public class two {
    public static void main(String[] args) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(res.isEmpty()){
            res.add(-1);
        }
        System.out.println(res.getClass().getSimpleName());
        System.out.println(res);
    }
}
