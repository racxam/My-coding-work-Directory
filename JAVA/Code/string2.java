

public class string2 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");



        for (int i = 0; i < sb.length()/2; i++) {
            int front= i;
            int back= sb.length()-1-i;

            char FC= sb.charAt(front);
            char BC= sb.charAt(back);
            sb.setCharAt(front, BC);
            sb.setCharAt(back,FC);
            
        }

       System.out.println(sb);

        
    }
}

