import java.awt.*;
class Myframe extends Frame{
Label l;
TextField tf;
Button b;

public Myframe()
{
    super("My app");
    setLayout(new FlowLayout());
    l= new Label("I am label");
    tf= new TextField(20);
    b= new Button("Fuck me hard");
    add(l);
    add(tf);
    add(b);
}
}

public class secondMthdforGUI  {
    public static void main(String[] args) {
        Myframe app= new Myframe();
        app.setSize(300,300);
        app.setVisible(true);
    }
}
