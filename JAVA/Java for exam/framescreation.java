import java.io.*;
import java.nio.BufferOverflowException;

import javax.swing.border.Border;

import java.awt.*;

class Myframe extends Frame{
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    public Myframe(){
        super("Flow Layout");
        b1= new Button("One");
        b2= new Button("Two");
        b3= new Button("Three");
        b4= new Button("Four");
        b5= new Button("Five");
        b6= new Button("Six");
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.CENTER);
        add(b4,BorderLayout.EAST);
        add(b5,BorderLayout.WEST);
        // add(b6);
        // FlowLayout fl= new FlowLayout();
        // fl.setAlignment(FlowLayout.CENTER);
        // setLayout(fl);

    }
}
public class framescreation {

    public static void main(String[] args) {
        Myframe app = new Myframe();
        app.setVisible(true);
        app.setSize(500,500);
        
        
    }
}
