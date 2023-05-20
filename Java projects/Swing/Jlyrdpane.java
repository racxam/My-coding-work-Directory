import javax.swing.*;



import java.awt.*;
//Jlayered pane is a swing component that allows user to add death or a new z dimension
public class Jlyrdpane extends JFrame{
    Jlyrdpane(){
        JLabel l1=new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        l1.setBounds(50,50,200,200);

        JLabel l2=new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.green);
        l2.setBounds(100,100,200,200 );

        JLabel l3=new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.yellow);
        l3.setBounds(150,150,200,200);


        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,500,500);
        lp.setBackground(Color.black);

        lp.add(l1,Integer.valueOf(0));
        lp.add(l2,Integer.valueOf(2));
        lp.add(l3,Integer.valueOf(1 ));


        this.setSize(new Dimension(1200,800));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(lp);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Jlyrdpane();
    }
}
