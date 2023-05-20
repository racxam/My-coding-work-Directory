import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class dragndrp extends JFrame{
        DragPanel dp= new DragPanel();
       dragndrp (){

        //frame
        this.setTitle("Drag and drop ka khel khel re!!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(dp);
        this.setSize(500,600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
       }
  
    public static void main(String[] args) {
        new dragndrp();
        
    }

}
