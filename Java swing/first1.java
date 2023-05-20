import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class first1 extends JFrame{
    first1(){

        this.setTitle("Vender program");
        // ImageIcon icon= new ImageIcon("sexy.png");
        ImageIcon icon = new ImageIcon("/Users/sumitkumar/Documents/Java swing/sexy.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// it will exit on click on close button
        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
        this.setIconImage(icon.getImage()); 
        this.getContentPane().setBackground(Color.black);
        // getContentPane().setBackground(new Color(0, 0, 0));
        // getContentPane().setBackground(new Color(0xffffff));//white
        // setBackground(new Color(0x000000));//black
    }
    public static void main(String[] args) {
        new first1();
        
    }
}
