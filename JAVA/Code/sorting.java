public class sorting {
    public static void main(String[] args) {
        //bubble sort 
        // in bubble sort we push the heaviest element in the last
        // time complexity= O(n^2)
        int arr[]={7,8,3,1,2};
    //    for (int i = 0; i < arr.length-1; i++) {
    //         for (int j = 0; j <(arr.length-1)-i; j++) {
    //            if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //            } 
    //         }
    //    }

    
    //Selection sort technique
    // for (int i = 0; i < arr.length-1; i++) {
    //     int small=i;

        
    //     for (int j = i+1; j < arr.length; j++) {
    //         if(arr[small]>arr[j]){
    //             small=j;
                

    //         }
    //     }
    //     int temp=arr[small];
    //     arr[small]=arr[i];
    //     arr[i]=temp;

    // }
    

    //Insertion Sort
    for (int i = 1; i < arr.length; i++) {
        int current= arr[i];
        int j=i-1;
        while (j>=0 && current<arr[j]) {
           arr[j+1]=arr[j];
           j--; 
        }
        arr[j+1]=current;
        
        
    }
    for (int is : arr) {
        System.out.println(is);
    }

       
    }
}
