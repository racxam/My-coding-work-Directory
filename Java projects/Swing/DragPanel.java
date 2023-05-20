import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
 ImageIcon ic= new ImageIcon("/Users/sumitkumar/Documents/Coding/Java projects/Swing/rockey.png");
  final int WIDTH= ic.getIconWidth();
  final int HEIGHT= ic.getIconHeight();
  Point imageCorner;
  Point Prev;

    DragPanel(){
        imageCorner= new Point(0,0);
        ClickListener cl=new ClickListener();
        DragListener dl = new DragListener();
        this.addMouseListener(cl);
        this.addMouseMotionListener(dl);



    }
    public void PaintComponent(Graphics g){
        super.paintComponent(g);
        ic.paintIcon(this, g, (int)imageCorner.getX(),(int) imageCorner.getY());

    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            Prev=e.getPoint();
        }

    } 
    private class DragListener extends  MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point cp=e.getPoint();
            imageCorner.translate((int)(cp.getX()-Prev.getX()),(int)(cp.getY()-Prev.getY()));
            Prev=cp;
            repaint();
        }
    }

}
