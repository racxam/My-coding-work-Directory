import java.awt.*;

import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Label l;
    TextField tf;
    Button b;

    MyFrame(){
        super("They sexy app");
        l= new Label("Click on me!!");
        tf= new TextField(30);
        b= new Button("Press me Hard!");
        
       add(l);
       add(tf);
       add(b);

        
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);

    }



}
public class counter {
    public static void main(String[] args) {
        MyFrame app= new MyFrame();

        
    }
}
