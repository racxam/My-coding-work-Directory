import javax.swing.*;
public class Joptnpan {

    public static void main(String[] args) {
        // joption pan is a prompt
        // JOptionPane.showMessageDialog(null,"oii ye ek bss prompt hai", "Lawde ka title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"oii ye ek bss prompt hai", "Lawde ka title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"oii ye ek bss prompt hai", "Lawde ka title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"oii ye ek bss prompt hai", "Lawde ka title", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null,"oii ye ek bss prompt hai?", "Lawde ka title", JOptionPane.QUESTION_MESSAGE);
        
        // int ans=JOptionPane.showConfirmDialog(null,"oii ye ek advance prompt hai?",  "badet ka title", JOptionPane.YES_NO_CANCEL_OPTION);
        //yes =0 and no =1 and cancel =2 and closing the prompt =-1
        // String name= JOptionPane.showInputDialog(null, "Hello input your email address");
        // System.out.println(name);
        String responses[]={"sumit","sonu","rashgulla"};

        ImageIcon icon = new ImageIcon("/Users/sumitkumar/Downloads/NicePng_bloody-handprint-png_273052.png");
        JOptionPane.showOptionDialog(null, "hell ka hell", "titile of hell", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

    }
}
