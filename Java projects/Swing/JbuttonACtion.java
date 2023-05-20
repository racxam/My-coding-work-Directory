
import java.awt.event.ActionListener;
import java.awt.event.*;  
import javax.swing.*;


public class JbuttonACtion extends JFrame {
    JFrame j;
    JbuttonACtion(){
        final JTextField tf= new JTextField();
        tf.setBounds(50,50,120,50);
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  

        
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                tf.setText("Welcome to Javatpoint.");  
            }  
        }); 
        
        add(b);
        add(tf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        

    }


    public static void main(String[] args) {
        new JbuttonACtion();
    }
}
