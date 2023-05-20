import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    int count=0;
    Label l,l1;
    Button b;
    public MyFrame(){
        super("Fuck me n times");
        l= new Label("    "+count);
        b= new Button("Fuck me more");
        b.addActionListener(this);
        l1= new Label("Daalo ander Naa!!");
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(l1);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(" "+count);
        l1.setText("Ahh You fucked me "+count+ " Times");
        if(count==10){
            l1.setText("Now Stop Please");
            b.removeActionListener(this);
            b.setSize(50, 10);
            b.setLabel("Now the hole is closed");
        }

        
    }
}
public class WorkingApp {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(1600,1080);
        f.setVisible(true);
    }
}
