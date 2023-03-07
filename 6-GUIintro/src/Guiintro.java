import javax.swing.JOptionPane;
public class Guiintro {
    public static void main(String[] args) {
      String name=JOptionPane.showInputDialog("enter you name");
      JOptionPane.showMessageDialog(null,"hello "+name);
      int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
      JOptionPane.showMessageDialog(null,"your age is "+age+" years old");
    }
}