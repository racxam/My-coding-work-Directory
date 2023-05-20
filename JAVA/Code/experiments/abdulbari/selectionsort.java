
    public class selectionsort {
        public static int[] Ssort(int arr[]) {
    
            for (int i = 0; i < arr.length-1; i++) {
                int small=i;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]<arr[small]){
                        small=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[small];
                arr[small]=temp;
            }
            return arr;
        }
    
        public static void main(String[] args) {
            int arr[] = { 8, 57, 7, 34, 26};
            int brr[] = Ssort(arr);
            for (int i = 0; i < brr.length; i++) {
                System.out.print(brr[i]+" ");
            }
        }
    }
    

