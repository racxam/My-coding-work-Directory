import java.util.*;
import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Pbar extends JFrame implements ActionListener{
    JProgressBar jbar;
    Pbar(){
        //Progess bar
        jbar= new JProgressBar();

       
        jbar.setBounds(0,50,500,1000);
        jbar.setStringPainted(true);
        fill();
        //frame

        this.setName("Sumit ka progress baar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        // this.setPreferredSize(new Dimension(1000,1000));
        this.add(jbar);
        this.pack();

        this.setVisible(true);

    }
    public void fill(){
        int i=0;
        while(i<=1000000000){
            jbar.setValue(i);

            Timer t = new Timer();
            



            i++;
        }
        jbar.setString("Passed");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   
}
