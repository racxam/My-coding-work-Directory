public class ADVANCED_recursion {
    public static void printPerm(String str, String permutation) {
        if(str.length()==0)
        {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cc= str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1); 
            printPerm(newStr, permutation+cc);
        }
    }
    public static void main(String[] args) {
        //QUestion is print all the permutaitons of a string
        //like abc- abc, acb, bca, bac, cab, cba, 3! will be no. of permutations
        String str="abc";
        printPerm(str, "");

    }
}
