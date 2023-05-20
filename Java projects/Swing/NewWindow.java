import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    NewWindow(){


        JFrame f=new JFrame();

        JLabel l= new JLabel("Hello");
        l.setBounds(0,0,100,150);
        l.setFont(new Font("Times New Roman",Font.PLAIN,40));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.add(l);
        f.setSize(700,800);
    }
    public static void main(String[] args) {
        
    }
}
