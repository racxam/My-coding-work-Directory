import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class menubar extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu mf;
    JMenu me;
    JMenu mh;

    JMenuItem il;
    JMenuItem is;
    JMenuItem ie;

    menubar(){

        //menu bar
        mb= new JMenuBar();
        mf= new JMenu("file");
        mf.addActionListener(this);
        me= new JMenu("edit");
        mh= new JMenu("help");


        //menu items
        il= new JMenuItem("Load");
        is= new JMenuItem("save");
        ie= new JMenuItem("exit");
        il.addActionListener(this);
        is.addActionListener(this);
        ie.addActionListener(this);

        il.setMnemonic(KeyEvent.VK_L);
        is.setMnemonic(KeyEvent.VK_S);// it will work with command S to save
        ie.setMnemonic(KeyEvent.VK_E);
        
        
        mf.add(il);
        mf.add(is);
        mf.add(ie);

                //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(1000,1000));
        mb.add(mf);//file menu
        mb.add(me);//edit menu
        mb.add(mh);// help menu
        this.setJMenuBar(mb);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource()==il){
            System.out.println("boobo boboo you loaded a file");
        }
        if(e.getSource()==is){
            System.out.println("boobo boboo you saved file");
        }
        if(e.getSource()==ie){
            System.out.println("boobo boboo you exited a file");
            System.exit(0);
        }
    }   
    public static void main(String[] args) {
       new menubar();
    }
}