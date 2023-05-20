import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class second extends JFrame {
    second(){
        JLabel label= new JLabel("Hey do you know how to code!!");
        ImageIcon icon= new ImageIcon("/Users/sumitkumar/Documents/Java swing/sexy.png");
        // label.setText("hi i'am sumit"); // this is depricated way to add label name
        label.setIcon(icon);
        Border bor= BorderFactory.createLineBorder(Color.green,5);


        label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xffa0ff));
        // label.setFont(new Font("Times new Roman"));
        
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setIconTextGap(50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(bor);
        label.setVerticalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,250,250); //1 
    
        


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(500,500);//3
        this.setResizable(true);
        this.setVisible(true);
        // this.setLayout(null);//2
        this.add(label);// 
        this.pack();// we have to use it at last onlly than only it works otherwise it will not work


    }
    public static void main(String[] args) {
        new second();
        
    }
}
