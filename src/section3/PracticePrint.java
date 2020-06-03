package section3;

import javax.swing.JOptionPane;

public class PracticePrint {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Hello");
		String age = JOptionPane.showInputDialog("What is your age?");
		JOptionPane.showMessageDialog(null, "Your age is: " + age);

	}
}
