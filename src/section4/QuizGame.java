package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String question1 = JOptionPane.showInputDialog("What is Leighton's birthday?");
		// 3. Use an if statement to check if their answer is correct
		if (question1.equals("March 16 2005")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		else if (question1.equals("3/16/05")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Your score is " + score);
		}

		
		// 4. if the user's answer is correct
		

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		
		String question2 = JOptionPane.showInputDialog("What is Leighton's favorite pasttime?");
		if (question2.equalsIgnoreCase("procrastinating")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		if (question2.equalsIgnoreCase("procrastination")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Your score is " + score);
		}
		
		String question3 = JOptionPane.showInputDialog("What is Leighton's favorite subject in school?");
		if (question3.equalsIgnoreCase("math")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Correct! Your final score is " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Your final score is " + score);
		}

		// 6. After all the questions have been asked, print the user's score

	}
}

