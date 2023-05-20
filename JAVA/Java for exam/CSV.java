//comma seperated values form java

public class CSV {
    public static void main(String[] args) {
        String str= "Hello , i , am , sumit ";
        String names[]= str.split(",");
        for (String lov : names) {
            System.out.println(lov);
        }
    }
}
