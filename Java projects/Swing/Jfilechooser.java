import java.awt.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.ActiveEvent;


public class Jfilechooser extends JFrame implements ActionListener{
    JButton btn;
    Jfilechooser(){
        btn=new JButton("Fuck me Daddy");
        btn.addActionListener(this);


        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(btn);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(1000,500));
        this.setVisible(true);

    }
   
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("Hello");
            JFileChooser fc= new JFileChooser();
            // fc.setCurrentDirectory(new File("/Users/sumitkumar/Desktop"));
            fc.setCurrentDirectory(new File("."));// project folder
            
            int response=fc.showOpenDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File newfile=new File(fc.getSelectedFile().getAbsolutePath());
                System.out.println(newfile);
            }
    
        }
    }
    public static void main(String[] sumit) {
       new Jfilechooser();
    }
 
}
