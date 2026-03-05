package timepass;
import javax.swing.JOptionPane;
public class gui_Interface {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "! Welcome to the GUI Interface.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
    }
}
