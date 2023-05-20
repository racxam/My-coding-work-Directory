import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class Jslider extends JFrame implements ChangeListener{
    JPanel jp;
    JLabel jl;
    JSlider js;
     Jslider(){
        //panel
        jp=new JPanel();
        js=new JSlider(0,100,20);
        js.setPreferredSize(new Dimension(500,100));
        jl=new JLabel();
        js.addChangeListener(this);

        js.setPaintTicks(true);// gole se tick aa jati
        js.setMinorTickSpacing(10);// will give 9 tick which will eventually break the line in 10 parts

        js.setPaintTrack(true);
        js.setMajorTickSpacing(25);// after 25 small units there will be a lager tick,, means 3 major ticks
        
        js.setPaintLabels(true);
        js.setFont(new Font("MV Boli",Font.PLAIN,20));
        js.setOrientation(SwingConstants.VERTICAL);
        jp.add(js);



        //frame
        this.setName("Sumit's slider");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(jl);
        this.add(jp);

        this.pack();
        this.setVisible(true);
     }   
      public static void main(String[] args) {
        new Jslider();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        jl.setText("Your age is "+js.getValue());
    }
}
