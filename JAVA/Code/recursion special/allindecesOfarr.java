public class allindecesOfarr {
    static int i=0;

    public static int[] printAll(int arr[],int ind,int val,int fsf) {
        if(ind==arr.length)
        {
            return new int[fsf];
        }
        if(arr[ind]==val){
            int[] iarr=printAll(arr, ind+1, val, fsf+1);
            iarr[fsf]=ind;
            return iarr;

        }
        else{
            int [] iarr=printAll(arr, ind+1, val, fsf);
            return iarr;
        }
        


    }
    public static void main(String[] args) {
        // print all occurences in an array
        int arr[]={2,3,6,9,8,3,2,3,6,4};
       
        int sarr[]=printAll(arr, 0,3,0);
        for (int is : sarr) {
            System.out.println(is);
        }
        

    }
}
