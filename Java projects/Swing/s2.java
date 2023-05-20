package Swing;
import javax.swing.*;
public class s2 extends JFrame{
    JFrame f;
    s2(){
        JButton b= new JButton("click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new s2();
    }
}
