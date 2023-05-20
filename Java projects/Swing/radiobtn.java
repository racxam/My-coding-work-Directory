
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class radiobtn extends JFrame implements ActionListener{
    JRadioButton pizzab;
    JRadioButton humburgerb;
    JRadioButton hotdogb;
    radiobtn(){
         pizzab= new JRadioButton("Pizza");
        humburgerb= new JRadioButton("Hamburger");
        hotdogb= new JRadioButton("Hotdog");
        
        ButtonGroup bg= new ButtonGroup();// after putting them into a button group 
        // we can select only one at a time , that fulfils the purpose the motive of being a radio button
        
        bg.add(pizzab);
        bg.add(humburgerb);
        bg.add(hotdogb);

        pizzab.addActionListener(this);
        humburgerb.addActionListener(this);
        hotdogb.addActionListener(this);
        
        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(pizzab);
        this.add(humburgerb);
        this.add(hotdogb);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new radiobtn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==pizzab){
            System.out.println("You ordered Pizza");
        }
        else if(e.getSource()==humburgerb){
            System.out.println("You ordered Humberger");
        }
        
        else if(e.getSource()==hotdogb){
            System.out.println("You ordered Humberger");
        }
        else{
            System.out.println("Select one of pizze, humburger or hotdog");
        }
        
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
