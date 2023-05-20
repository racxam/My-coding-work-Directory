import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mlist extends JFrame implements MouseListener{
      JLabel l;
  
       mlist(){
        // label
        l= new JLabel();
        l.setBounds(300,0,300,100);
        l.setBackground(Color.red);
        l.setOpaque(true);
        l.addMouseListener(this);

        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,500));
        this.setLayout(null);
        this.add(l);
        this.setVisible(true);
       }
    

    
  
  
    public static void main(String[] args) {
        new mlist();
    }





    @Override
    public void mouseClicked(MouseEvent e) {
      // invoked when a moused is clicked (pressed and realeased)
      System.out.println("You clicked");
      l.setText("Fucked me!");
    }
    
    
    
    
    
    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when a mouse has been pressed on a component
        System.out.println("You pressed the moused button");
        l.setText("Pressed me!");
    }





    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when a mouse button is realeased on a component
        System.out.println("you realsed the mouse button");
        l.setText("Your realeased my...😎😎");
        
    }
    
    
    
    
    
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the moused in the label");
        // invoked when a mouse click enter a component
        l.setBackground(Color.GREEN);
        
    }
    
    
    
    
    
    @Override
    public void mouseExited(MouseEvent e) {
        // when a mouse clicks exits a component 
        System.out.println("You exited the label");
        l.setBackground(Color.RED);
    }

}
