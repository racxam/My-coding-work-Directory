

public class allIndices {
    public static int[] printAll(int arr[],int ind,int val,int fsf) {
        if(ind==arr.length){
            return new int[fsf];
        }
        if(arr[ind]==val){
            int x=ind;
           int[] iarr= printAll(arr, ind+1, val, fsf+1);
           iarr[fsf]=ind;
           return iarr;


        }
        else{
            int[] iarr=printAll(arr, ind+1, val, fsf);
            return iarr;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,6,9,8,3,2,3,6,4};
       int isarr[]= printAll(arr,0,3,0);
       for (int i = 0; i < isarr.length; i++) {
            System.out.println(isarr[i]);    
       }

    
    }
}
