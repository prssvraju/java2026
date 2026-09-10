import javax.swing.JOptionPane;

public class Sample {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Enter your name:");

		if (name != null && !name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
		}
        else
        {
            JOptionPane.showMessageDialog(null, "Not entered");
        }
	}
}
