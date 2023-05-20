import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class launchpage implements ActionListener{
    JFrame frame =new JFrame();
    JButton b= new JButton("New window");


    launchpage(){
        b.setBounds(100,160,200,60);
        b.setFocusable(false);
        b.addActionListener(this);
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(b);
        frame.setVisible(true);
    }

  
         
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource()==b){
            frame.dispose();// it will destroy all the parent windows
            NewWindow nw= new NewWindow();

        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   
}
    

