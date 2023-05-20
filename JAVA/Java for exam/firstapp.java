import java.io.*;
import java.util.concurrent.Flow;
import java.awt.*;
public class firstapp {
    public static void main(String[] args) {
        Frame f =new Frame("My sexiest App");
        f.setLayout(new FlowLayout());
        Button b= new Button("69 Dude");
        f.add(b);
        Label l= new Label("Name");
        f.add(l);
        TextField tf= new TextField(20);
        f.add(tf);


        f.setSize(300,300);
        f.setVisible(true);
        
    }
}
