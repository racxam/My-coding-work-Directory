public class binarysearch {
    public static int search(int arr[],int l,int h,int f) {
        int index=-1;
        if(h>=l){

        
        int mid=(l+h)/2;
        if(arr[mid]==f){
            index=mid;
            return index;

        }
        else if(arr[mid]<f){
            index=search(arr, mid+1, h, f);
        }
        else{
            index=search(arr, l, mid-1, f);
        }
        
    }
        return index;
    }
        
       public static void main(String[] args) {
        int arr[]={2,3,4,7,8,9,11,22,33,55};
        int r=search(arr,0,((arr.length)-1),9);

        System.out.println(r);
    }
}
