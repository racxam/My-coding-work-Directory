import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.TextUI;

public class buttn extends JFrame implements ActionListener{
    //JButton is a button that performs an action when clicked on
    JButton btn;
    JLabel lbl;
    buttn(){
        
        //Icon 
        ImageIcon icon= new ImageIcon("/Users/sumitkumar/Documents/Java swing/2.png");
        ImageIcon icon1= new ImageIcon("/Users/sumitkumar/Documents/Java swing/alien.ico");

        //Label
        lbl= new JLabel();
        lbl.setIcon(icon1);
        lbl.setText("I am A really fucking man Don't ever dark to call me father!!!");
        lbl.setBounds(100,200,600,500);
        lbl.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        lbl.setVisible(false);
        lbl.setBackground(Color.gray);
        


        btn= new JButton();

        //JButton
        btn.setBounds(100,0,500,200);
        // btn.addActionListener(this);// boring one
        // btn.addActionListener(e->System.out.println("pooop herere")); //best method but using labda expression
        btn.addActionListener(this);

        btn.setText("login");
        btn.setFocusable(false);
        btn.setIcon(icon);
        btn.setFont(new Font("Comic sans",Font.BOLD,34));
        btn.setForeground(Color.GREEN);
        btn.setBackground(Color.BLACK);
        // btn.setBorder(BorderFactory.createDashedBorder(Color.MAGENTA));
        btn.setBorder(BorderFactory.createEtchedBorder());
        // btn.setEnabled(false);// it will disable the button






        //frame
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(btn);
        this.add(lbl); 
    }
    // @Override   // ---> boring 2
    public void actionPerformed(ActionEvent eg){
        if(eg.getSource()==btn){

            lbl.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new buttn();
    }

}