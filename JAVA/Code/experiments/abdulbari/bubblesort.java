

public class bubblesort {
    public static int[] bs(int arr[],int n) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }

            }
        }
        return arr;
    }
    public static void printji(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,78,3,2};
       int brr[]= bs(arr,5);
       printji(brr);

    }
}
