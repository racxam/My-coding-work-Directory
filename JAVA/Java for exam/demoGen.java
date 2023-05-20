public class demoGen<T>{

    T data[]=(T[]) new Object(3);



    public static void main(String[] args) {
        demoGen<String> dg =new demoGen<String>();
        dg.data[0]="hi";
        dg.data[0]="bi";
        dg.data[0]="li";
        

    }
}
