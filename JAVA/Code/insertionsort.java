public class insertionsort {
    public static void main(String[] args) {
        //insertion sort
        int []arr={8,7,3,2,1};
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0&& key<arr[j]) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=key;
        }

        for (int is : arr) {
            System.out.print(is+" ");
        }
    }
    
}