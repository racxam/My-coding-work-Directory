public class a {
    // static int[]perm= new int[];

    public static void main(String[] args) {
        int nums[]={1,2,3};
        int count =1;
       
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
           for (int j = 0; j < newArr.length; j++) {
                 System.out.print(newArr[j]+" ");
           }
           System.out.println();
            
        }


    }
}
