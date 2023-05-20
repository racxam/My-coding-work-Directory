import javax.swing.*;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class bdrlyt extends JFrame {
    bdrlyt(){
        
        JPanel p1= new JPanel();
        JPanel p2= new JPanel();
        JPanel p3= new JPanel();
        JPanel p4= new JPanel();
        JPanel p5= new JPanel();
        
        JPanel p6= new JPanel();
        JPanel p7= new JPanel();
        JPanel p8= new JPanel();
        JPanel p9= new JPanel();
        JPanel p10= new JPanel();

        p1.setBackground(Color.black);
        p2.setBackground(Color.red);
        p3.setBackground(Color.green);
        p4.setBackground(Color.gray);
        p5.setBackground(Color.pink);
        
        p6.setBackground(Color.yellow);
        p7.setBackground(Color.cyan);
        p8.setBackground(Color.magenta);
        p9.setBackground(Color.white);
        p10.setBackground(Color.lightGray);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        p5.setLayout(new BorderLayout());
        
        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));
        p10.setPreferredSize(new Dimension(50,50));

        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.WEST);
        p5.add(p8,BorderLayout.SOUTH);
        p5.add(p9,BorderLayout.EAST);
        p5.add(p10,BorderLayout.CENTER);
        
        //framed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.setSize(500,500);
        this.setVisible(true);

        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.WEST);
        this.add(p3,BorderLayout.SOUTH);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.CENTER);
        

    }
    public static void main(String[] args) {
        new bdrlyt();
    }
}
