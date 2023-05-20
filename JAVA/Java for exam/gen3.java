class DGen<T>{
    private T obj;
    public void setData(T obj){
        this.obj=obj;
    }
    public T getData(T obj){
        return this.obj;
    }
}
public class gen3 {
    public static void main(String[] args) {
        DGen<Integer> gd=new DGen<>();
        gd.setData(12);
        Integer sd=gd.getData(12);
        System.out.println(sd);

    }
}
