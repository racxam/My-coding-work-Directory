import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Jcmbo extends JFrame implements ActionListener{
        JComboBox cb;
        //frame
        Jcmbo(){
            //combo box 
            String animals[]={"dog","cat","monkey"};// String ,Interger should all be wrapper classes
            cb= new JComboBox(animals);// eske ander string array store hota hai
            cb.addItem("Cow");
            cb.insertItemAt("pig",1);
            cb.setSelectedIndex(3);// sets the selectex index
            // cb.removeItem("cat");
            cb.removeItemAt(0);
            cb.removeAllItems();
            cb.addActionListener(this);


            // cb.setEditable(true);




            //frame

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            this.add(cb);
            this.pack();
            this.setVisible(true);
        }


    
    
    public static void main(String[] args) {
        new Jcmbo();
        
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource()==cb){
                System.out.println(cb.getSelectedItem());
            }

    }

}
