import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class colorchoosr extends JFrame implements ActionListener{
       
       JButton btn;
       JLabel l;
  
       colorchoosr(){
        btn= new JButton("Pick a Color");
        btn.addActionListener(this);
        l= new JLabel();
        l.setBackground(Color.white);
        l.setOpaque(true);
        l.setText("This is some text Lorem Epsum");
        l.setFont(new Font("MV Boli",Font.BOLD,60));


        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,500));
        this.add(l);
        this.add(btn);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
       }


    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource()==btn){
            JColorChooser cc=new JColorChooser();
            Color c= JColorChooser.showDialog(null, "Roll the color", Color.BLACK);
            l.setForeground(c);
        }

    }
  
    public static void main(String[] args) {
        new colorchoosr();
    }

}
