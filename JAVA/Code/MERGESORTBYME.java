
public class MERGESORTBYME {
    public static void conquer(int arr[],int s,int mid, int e) {
        int merge[]=new int[e-s+1];
        int ind1=s;
        int ind2=mid+1;
        int x=0;

        while (ind1<=mid && ind2<=e) {
            if(arr[ind1]<=arr[ind2]){
                merge[x++]=arr[ind1++];
                
                
            }
            else{
                merge[x++]=arr[ind2++];
               
            }
        }
        while(ind1<=mid){
            merge[x++]=arr[ind1++];
        }
        while(ind2<=e){
            merge[x++]=arr[ind2++];
        }
        
        for (int i = 0,j=s; i <merge.length; i++,j++) {
                arr[j]=merge[i];
        }
        
    }
    public static void divide(int arr[],int s,int e) {
        int mid= s+(e-s)/2;
        if(s>=e){
            return;

        }
            divide(arr, s, mid);
            divide(arr, mid+1, e);
            conquer(arr,s,mid,e);

        
    }
    public static void main(String args[]){
       int n=5;
       int arr[]= {5,3,2,7,4};

       System.out.println("YOUR OLD ARRAY IS:");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");

       }
       System.out.println();
       divide(arr,0,n-1);
       System.out.println();
       System.out.println();
       System.out.println("AFTER MERGE SORT YOUR NEW ARRAY IS:");

       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");

       }



    
       
        





    }//end of main
}//end of class