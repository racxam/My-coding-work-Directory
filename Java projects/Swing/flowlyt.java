import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;;

public class flowlyt extends JFrame {

    flowlyt(){
        //Jpanel
        JPanel p=new JPanel();
        p.setPreferredSize(new Dimension(300,500));
        p.setBackground(Color.blue);
        p.setLayout(new FlowLayout());

        //frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING,50,50));
        // //faster way to make the buttons
        // this.add(new Button("1"));
        // this.add(new Button("2"));
        // this.add(new Button("3"));
        // this.add(new Button("4"));
        // this.add(new Button("5"));
        // this.add(new Button("6"));

        // faster way to make the buttons in panel
        p.add(new Button("1"));
        p.add(new Button("2"));
        p.add(new Button("3"));
        p.add(new Button("4"));
        p.add(new Button("5"));
        p.add(new Button("6"));

        this.add(p);
        this.setVisible(true);// we must add this at the end always
    }
    public static void main(String[] args) {
        new flowlyt();
    }
}
