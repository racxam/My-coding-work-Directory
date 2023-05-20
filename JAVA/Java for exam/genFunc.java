public class genFunc {
    // static <E> void show(E[]  list){
    static <E> void show(E... list){
        for (E x : list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        // show(new Integer[]{1,2,3,4,5,6});
        show(1,2,3,4,5,6);
    }
}
