import javax.swing.*;
import java.awt.*;
public class gridlyt extends JFrame{
    gridlyt(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setPreferredSize(new Dimension(700,700));
        this.setSize(new Dimension(700,700));
        this.setLayout(new GridLayout(3,3,10,10));

        // adding buttons
        this.add(new Button("1"));
        this.add(new Button("2"));
        this.add(new Button("3"));
        this.add(new Button("4"));
        this.add(new Button("5"));
        this.add(new Button("6"));
        this.add(new Button("7"));
        this.add(new Button("8"));
        this.add(new Button("9"));
        //last thing to add
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new gridlyt();
    }
}
