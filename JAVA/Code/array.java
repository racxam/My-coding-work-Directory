// arrays
// syntax
// type []arrayName= new type[size];---possiblity no 1
// type arrayName[]= new type[size];---possiblity no 2
public class array {
    public static void main(String[] args) {
    //   int[] marks= new int[3];
    //   marks[0]=23; //phy 
    //   marks[1]=89; //chem 
    //   marks[2]=56; //english 
    int marks[]={23,89,56};
    //   System.out.println(marks[0]);
    //   System.out.println(marks[1]);
    //   System.out.println(marks[2]);
    for (int i = 0; i < 3; i++) {
        System.out.println("Marks of subject no "+(i+1)+" is: "+marks[i]);
    }
    }
}
