package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String response = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(response.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Good. You and I will rule the world.");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
	JOptionPane.showMessageDialog(null, "...");
	JOptionPane.showMessageDialog(null, "Very well.");
	JOptionPane.showMessageDialog(null, "I wish you good luck");
	JOptionPane.showMessageDialog(null, "");
	JOptionPane.showMessageDialog(null, "In washing dishes.");
}
	}
}
