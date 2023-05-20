public class wrappercalss {
    public static void main(String[] args) {
        int i=34;
        Integer io=new Integer(12);//boxing
        Integer co= Integer.valueOf(i);
        Integer j=i;//autoboxing;
        System.out.println(io);
        System.out.println(j);
        System.out.println(i);
        System.out.println(co);
        System.out.println();

        int k=j;
        int l= j.intValue();
        System.out.println(k);
        System.out.println(l);


    }
}
