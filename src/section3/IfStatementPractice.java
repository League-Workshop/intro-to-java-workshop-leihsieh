package section3;

import javax.swing.JOptionPane;

public class IfStatementPractice {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How was your day?");
		
		if( input.equalsIgnoreCase("Good") ) {
			System.out.println("Awesome, keep having a good day");
		}
		else if( input.equals("Bad") ) {
			System.out.println("Cheer up");
		}
		else {
			System.out.println("Hopefully tomorrow is better");
		}
		
	}
}
