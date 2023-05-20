import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Jchkbox extends JFrame implements ActionListener{

    JCheckBox cb;
    JButton btn;
    ImageIcon c;
    ImageIcon uc;
    Jchkbox(){
        ImageIcon c= new ImageIcon("Swing/uncheck.png");

        ImageIcon uc= new ImageIcon("Swing/chk.png");
        


        //checkbox
        cb= new JCheckBox("Added!!");
        cb.setFont(new Font("Consolas",Font.PLAIN,35));
        cb.setBounds(100,0,100,100);
        cb.setFocusable(false);
        cb.setIcon(c);
        cb.setSelectedIcon(uc);

        //button
        btn=new JButton("fill now");
        btn.setPreferredSize(new Dimension(100,100));
        btn.addActionListener(this);

        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(cb);
        this.add(btn);

        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println((cb.isSelected()));
        }
        // throw new UnsupportedOperationException("Sumit mahan hai");
    }
    public static void main(String[] args) throws Exception{
        new Jchkbox();
        
    }
}