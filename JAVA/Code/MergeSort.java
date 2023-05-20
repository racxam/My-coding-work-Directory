public class MergeSort { 
    public static void conquer(int arr[], int s,int mid, int e) {
        int merged[]=new int[e-s+1];
        int ind1=s;
        int ind2=mid+1;
        int x=0;

        while (ind1<=mid && ind2<=e) {
            if(arr[ind1]<=arr[ind2]){
                merged[x++]=arr[ind1++];

            }else{
                merged[x++]=arr[ind2++];
            }
        }
        while (ind1<=mid) {
            merged[x++]=arr[ind1++];
            
        }
        while (ind2<=e) {
            merged[x++]=arr[ind2++];
            
        }
        //copy
        for (int i = 0,j=s; i < merged.length; i++,j++) {
             arr[j]=merged[i];
        }


    }
    public static void sort(int arr[], int s, int e) {
        if(s>=e){
            return;
        }
        // int mid= (s+e)/2;//s +ei;
        int mid= s+(e-s)/2;// better way
        System.out.print(s+"!");
        System.out.print(mid+"!");
        System.out.println();
        sort(arr,s,mid);
        System.out.print(mid+1+"@");
        System.out.print(e+"@");
        System.out.println();
        sort(arr,mid+1, e);
        System.out.println();
        System.out.print(s+"#");
        System.out.print(mid+"#");
        System.out.print(e+"#");
        System.out.println();


        conquer(arr,s,mid,e);

         
          

    }
    public static void main(String[] args) {
        int []arr={6,3,9,5,8,7};
        int n =arr.length;
        sort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    
    }
}
