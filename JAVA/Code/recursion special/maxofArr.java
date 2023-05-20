public class maxofArr {
    public static int max(int arr[],int ind) {
        int prev=0;

        if(ind>5){
            return prev;
        }
        prev=max(arr,ind+1);
        if(prev<arr[ind]){
            prev=arr[ind];
        }
       return prev;
        
    }
    public static void main(String[] args) {
        int arr[]={10,30,459,3,22,56};
        int sol=max(arr,0);
        System.out.println(sol);
    }
}
