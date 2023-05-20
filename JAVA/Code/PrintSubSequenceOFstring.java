public class PrintSubSequenceOFstring {
    public static void PrintSubsequence(String str, int ind, String newStr) {
      if(ind==str.length()){
        System.out.println(newStr);
        return;
      }
      char currChar= str.charAt(ind);
      PrintSubsequence(str, ind+1, newStr+currChar);
      PrintSubsequence(str, ind+1, newStr);


    }
    public static void main(String[] args) {
        //Que is Print all the subsequence of the string using recursion

        String str="abc";
        PrintSubsequence(str,0,"");
    }
}
