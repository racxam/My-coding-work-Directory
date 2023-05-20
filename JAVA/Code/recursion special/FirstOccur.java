public class FirstOccur {
    public static int FOcc(int arr[],int ind,int val) {
        int sol=-1;
       if(ind==arr.length){
        return -1;
       }
       if(arr[ind]==val){
        return ind;
       }
       else{
        sol=FOcc(arr,ind+1, val);
       }
       return sol;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,6,7,8};
        int sol=FOcc(arr,0,1);
        if(sol==-1){
            System.out.println("No element present");
        }
        else{
            System.out.println(sol);
        }
    }
}
