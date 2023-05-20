import java.util.*;
public class solution {
    public static List<Integer> add(int ci){
        List<Integer> sumi= new ArrayList<>();
        sumi.add(ci);
        return sumi;
    }

    // static List<List<Integer>> sumi= new ArrayList<List<Integer>>();
    // static String[] str= new String();
    public static void permute(int[] nums) {
        String newStr= new String();
        int count=1;
        if(nums.length==0){
        
         System.out.println(newStr);
        }
        for(int i=0;i<nums.length;i++)
        {
            int ci=nums[i];
            int newArr[]=new int[nums.length-(count)];
            int ind=0;
            //first
            for(int j=0;j<i;j++){
                newArr[ind]=nums[j];
                ind++;
            }
            //second
             for(int k=i+1;k<nums.length;k++){
                newArr[ind]=nums[k];
                ind++;
            }
            
            newStr= newStr+ci;
            count++;
            permute(newArr);
            
        } 
    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        permute(nums);
    }
}

