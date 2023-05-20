
import java.util.ArrayList;

public class onee {
    static int li=-1,ri=-1;
    static public ArrayList<Integer> subArraySum(int arr[], int n, int s) {
        int done=0;
        int temp=0;
        for (int i = 0; i<n; i++) {

            if(done==-1){
                break;
            }
            
            int sum=0;
            temp=sum;
            
            
            for (int j = i; j < n; j++) {

                sum+=arr[j];

                // System.out.println(sum);
                if(sum==s){

                    li=i+1;
                    ri=j+1;
                    done=-1;
                    break;
                }

                
            }
        }
        ArrayList<Integer> jagriti=new ArrayList<Integer>();
        jagriti.add(li);
        jagriti.add(ri);
        jagriti.is


        return jagriti;
    }
    public static void main(String[] args) {
        ArrayList<Integer> samir=new ArrayList<Integer>();

      int arr[]={135,101,170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93,183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        // int arr[]={1,2,3,7,5};
      samir= subArraySum(arr,42,468);  
      System.out.println(samir);

    }
}
