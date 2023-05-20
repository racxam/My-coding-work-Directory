import java.util.*;;

class Lib{
    int count=0;
    String []Books= new String[10];
    public void avlBooks() {
        for (int i =0 ; i < count; i++) {
            System.out.println(Books[i]);
        }

    }
    public void insertBooks(String B) {

            
            Books[count]=B;
            count++;
            }

     public void delete(String bn) {
        for (int i = 0; i < count; i++) {
            if(Books[i]==bn){
                for (int j = i; j <= count-1; j++) {
                    Books[j]=Books[j+1];
                }
            }
        }
     }
            
        

}
public class Libraray {
   public static void main(String[] args) {
    Lib o= new Lib();
    o.insertBooks("Sui");
    o.insertBooks("mui");
    o.insertBooks("Slui");
    o.insertBooks("RAm chandri");
    o.avlBooks();
    o.delete("Sui");
    System.out.println();
    System.out.println();
    o.avlBooks();
   } 
}
