public class recursion2 {
    public static boolean []map= new boolean[26];

    public static void removeDuplicates (String str, int ind, String newStr) {
        char curr=str.charAt(ind);
        if(ind==str.length()-1){
            System.out.println(newStr);
            return;
        }
       if(map[curr-'a']) {
        removeDuplicates(str, ind+1, newStr);
       }
       else{
        map[curr-'a']=true;
        newStr+=curr;
        removeDuplicates(str, ind+1, newStr);
       }
    }
    public static void main(String[] args) {
        //Next que
        // remove the duplicates in the string and from the last
        
        String str= "abbccda";
        removeDuplicates(str,0," ");
        
      

    }
}
