package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String dislike = JOptionPane.showInputDialog("Whomst do you have a burning hatred for in this world?");
// 2. Change the next line so that the pop-up will tell them they 
//have a crush on that person
		JOptionPane.showMessageDialog(null, "You will inevitably grow a deep, emotional bond with " + dislike);
		// 3. Ask the user for the name of their best friend
		String bestie = JOptionPane.showInputDialog("What is the name of that which you call 'best friend'?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, bestie + " is ok.");
	} 
}



