package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer1 = JOptionPane.showInputDialog("What is the capital of Russia?");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equalsIgnoreCase("Moscow")) {
			JOptionPane.showMessageDialog(null, "Good job!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is Moscow.");
		}
		// 4. if the user's answer is correct
		if (answer1.equalsIgnoreCase("Moscow")) {
			score ++ ;
			JOptionPane.showMessageDialog(null, "Your score is " + score);}
		else {
			score -- ;
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer3 = JOptionPane.showInputDialog("What is the capital of Taiwan?");
		if (answer3.equalsIgnoreCase("Taipei")) {
			score ++ ;
			JOptionPane.showMessageDialog(null, "Good job!");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}else{
			score -- ;
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is Taipei.");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		String answer2 = JOptionPane.showInputDialog("What is the capital of Japan?");
		if (answer2.equalsIgnoreCase("Tokyo")) {
			score ++ ;
			JOptionPane.showMessageDialog(null, "Good job!");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}else{
			score -- ;
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is Tokyo");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		}
	
	
	}

		// 6. After all the questions have been asked, print the user's score

	

