public class LastOCc {
    public static int lastO(int arr[], int ind, int val) {
        int sol=-1;
        if(ind<=-1){
            return -1;
        }
        if(arr[ind]==val){
            return ind;
        }
        else{
           sol= lastO(arr, ind-1,val);

        }
        return sol;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,9,8,3,2,3,6,4};
        int sol=lastO(arr,9,6);
        if(sol==-1){
            System.out.println("No element");
        }
        else{
            System.out.println(sol);
        }
    }
}
