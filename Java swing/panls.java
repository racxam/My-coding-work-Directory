import java.awt.Color;

import javax.swing.*;
import java.awt.*;
public class panls extends JFrame {
    panls(){
        //image icons 
        ImageIcon img1= new ImageIcon("/Users/sumitkumar/Documents/Java swing/1.jpg");
        ImageIcon img2= new ImageIcon("/Users/sumitkumar/Documents/Java swing/2.png");
        ImageIcon img3= new ImageIcon("/Users/sumitkumar/Documents/Java swing/3.jpeg");


        //labels
        JLabel l1= new JLabel();
        l1.setText("");
        l1.setIcon(img1);
        
        JLabel l2= new JLabel();
        l2.setText("");
        l2.setIcon(img2);
        // l2.setVerticalAlignment(JLabel.TOP);
        l2.setVerticalAlignment(JLabel.BOTTOM);
        l2.setHorizontalAlignment(JLabel.CENTER);

        JLabel l3= new JLabel();
        l3.setText("");
        l3.setIcon(img3);

        //jpanel 
        JPanel redpanel= new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,1600,100);

        JPanel bluepanel= new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0,250,1600,100);
        bluepanel.setLayout(new BorderLayout());

        JPanel greenPanel= new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,500,1600,100);


        // all about Jframe
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(redpanel);
        this.add(bluepanel);
        this.add(greenPanel);


        //panel wala aaddiiton
        redpanel.add(l1);
        bluepanel.add(l2);
        greenPanel.add(l3);
    }
    public static void main(String[] args) {

        new panls();
    }
}
