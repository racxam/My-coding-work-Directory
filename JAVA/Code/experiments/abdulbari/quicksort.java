 public class quicksort {
        public static int[] Qsort(int arr[],int l, int h) {
        int pivot=arr[l];
        int i=l,j=h;
        while(i<j){

        
        do {
            i++;

        } while (arr[i]<=pivot);
        do {
            j--;

        } while (arr[j]>pivot);
        if(i<j){
            swap(arr[i],arr[j]);

        }
        }
        swap(arr[pivot],arr[j]);
        return j;
        }
        public static void main(String[] args) {
            int arr[] = { 8, 57, 7, 34, 26};
            int brr[] = Qsort(arr,0,4);
            for (int i = 0; i < brr.length; i++) {
                System.out.print(brr[i]+" ");
            }
        }
    }
    

