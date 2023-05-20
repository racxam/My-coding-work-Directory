import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Jtextfld extends JFrame implements ActionListener  {
    JTextField tf;
    JButton btn;
    Jtextfld(){
        
        JTextField tf= new JTextField();
        tf.setPreferredSize(new Dimension(250,40));
        tf.setCaretColor(Color.GREEN);// blinking line color
        tf.setText("Mein hoon don");
        tf.setEditable(false);
        
        JButton btn= new JButton("Click me");
        btn.setPreferredSize(new Dimension(100,70));
        btn.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(tf);
        this.add(btn);
        this.pack();
        this.setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            String msg= tf.getText(); 
            JOptionPane.showMessageDialog(null, msg);

        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public static void main(String[] args) {
        
    }

}
