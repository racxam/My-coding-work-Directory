import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Keylis extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon icon;

  
       Keylis(){
        icon =new ImageIcon("/Users/sumitkumar/Documents/Coding/Java projects/rockey.png");
         
        
        //label
        label= new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        // label.setBackground(Color.RED);
        // label.setOpaque(true);

        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,500));
        this.setLayout(null);
        this.add(label);
        this.addKeyListener(this );
        this.getContentPane().setBackground(Color.black);// for setting background color
        this.setVisible(true);
       }
       
  
    public static void main(String[] args) {
        new Keylis();
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-3,label.getY());
                       break;

            case 'w': label.setLocation(label.getX(),label.getY()-1);
                       break;
        
        }

    }


    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37:label.setLocation(label.getX()-10,label.getY());
            break;

            case 38 : label.setLocation(label.getX(),label.getY()-10);
            break;

            case 39:label.setLocation(label.getX()+10,label.getY());
            break;

            case 40 : label.setLocation(label.getX(),label.getY()+10);
            break;

        }
        


    }


    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You realsed the key: "+e.getKeyChar());
        System.out.println("You realsed the key: "+e.getKeyCode());

    }

}

    

