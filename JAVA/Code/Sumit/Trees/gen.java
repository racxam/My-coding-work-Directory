import java.util.Collection;
// In java generics we have Java Generics classes and Java Generic functions


class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;
    public MyGeneric(int val , T1 t1 , T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
        
    }
    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val= val;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT1(T1 t1){
        this.t1= t1;
    }
    public T2 getT2(T2 t2){
        return t2;
    }
    public void setT2(T2 t2){
        this.t2= t2;
    }


}

public class gen {
    static <T> void fun(T ele){
    System.out.println("The element is ::: "+ele.getClass().getName()+" = "+ele);
    }

    public static void main(String[] args) {
        MyGeneric<String,Integer> g1= new MyGeneric(12, "Hello", 34);
        String str= g1.getT1();
        System.out.println(str);

        fun(12);
        fun("Chaman Chumtia");

    }
}
