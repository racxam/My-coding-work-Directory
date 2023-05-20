public class formeREcursion {
    public static void perm(String str, String permutn) {
        if(str.length()==0){
            System.out.println(permutn);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cc= str.charAt(i);
            String newStr= str.substring(0, i)+str.substring(i+1);
            perm(newStr, permutn+cc);
        }

    }
    public static void main(String[] args) {
        String str="abcd";
        perm(str,"");
    }
}
