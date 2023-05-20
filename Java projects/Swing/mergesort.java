

public class mergesort {
    public static void merge(int arr[],int l, int mid,int h){
        System.out.println("i m merge");
        int i=l,j=mid+1,k=l;
        int tarr[]=new int[h+1];
        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                tarr[k++]=arr[i++];
            }
            else{
                tarr[k++]=arr[j++];
            }

        }
        while(i<=mid){
            tarr[k++]=arr[i++];
        }
        while(j<=h){
            tarr[k++]=arr[j++];

        }
        for (int n=l; n <=h; n++) {
            arr[n]=tarr[n];
        }
     }
    public static void Msort(int arr[],int l,int h){
        System.out.println("i m mergesort");
       if(l<h){

           int mid=l+(h-l)/2;
           Msort(arr,l,mid);
           Msort(arr,mid+1,h);
           merge(arr,l,mid,h);
        }


    }
    public static void main(String[] args) {
        System.out.println("This is Merge Sort Algorithm");
        int arr[]={9,3,7,5,6,4,8,2};
        Msort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
