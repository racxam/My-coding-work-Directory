public class insertionsort {
    public static int[] isort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            int comp = i + 1;
            int cval=arr[comp];
            for (int j = comp-1; j >= 0; j--) {

                if (arr[j] > cval) {
                    int temp=arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j]=temp;

                } 

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 57, 7, 34, 26};
        int brr[] = isort(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
