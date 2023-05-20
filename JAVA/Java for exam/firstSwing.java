import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener {
private static final Color Color = null;
JLabel l;
JButton b;
int count=0;
MyFrame(){
    super("Super Swing tutorial");
    l= new JLabel("Clicked "+count+" times");
    b= new JButton("Hard babay");

    setLayout(new FlowLayout());
    add(l);
    add(b);
    b.addActionListener(this);
    getRootPane().setDefaultButton(b);
    l.setToolTipText("Fucker Madarchod");

}
@Override
public void actionPerformed(ActionEvent e) {
    count++;
    l.setText(count+" Times you fucked me daddy!!");
    l.setBackground(Color);

    
}
}
public class firstSwing {
    public static void main(String[] args) {
        MyFrame app= new MyFrame();
        app.setSize(500,500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
}
