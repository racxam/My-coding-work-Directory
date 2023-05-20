import java.awt.Color;
import javax.swing.*;

import javax.swing.JFrame;
public class first {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Vender program");
        ImageIcon icon= new ImageIcon("sexy.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// it will exit on click on close button
        // frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage()); 
        // frame.getContentPane().setBackground(Color.green);
        // frame.getContentPane().setBackground(new Color(0, 0, 0));
        // frame.getContentPane().setBackground(new Color(0xffffff));//white
        frame.getContentPane().setBackground(new Color(0x000000));//black


    }
}