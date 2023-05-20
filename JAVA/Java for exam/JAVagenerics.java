public class JAVagenerics{

    public static void main(String[] args) {
        Object obj= new String("Fuck you");
        // String str= obj;// not allowed
        String mtr= (String)obj;
        System.out.println(mtr);
        
    }
}