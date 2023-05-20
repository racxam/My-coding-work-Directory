import java.util.ArrayList;

public class SUBSET_recursion {
    public static void printSubset(ArrayList<Integer> subset)    {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer> subset) {
        if(n==0){
            printSubset(subset);
            return;
        }
        //add
        subset.add(n);
        findSubsets(n-1, subset);
        //not getting add
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        //print all the subset of a natural no n;

        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n, subset);

    }
}
