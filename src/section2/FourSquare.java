package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	// 1. Call the drawSquare() method
	
	// 2. Create a new Robot

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	Robot jarvis= new Robot();
	jarvis.penDown();
	jarvis.sparkle();
	jarvis.setPenWidth(5);
	jarvis.setSpeed(100);
	jarvis.moveTo(300, 300);
	for (int i = 0; i < 4; i++) {
	jarvis.setRandomPenColor();
	jarvis.move(200);
	jarvis.turn(90);
	jarvis.setRandomPenColor();
	jarvis.move(200);
	jarvis.turn(90);
	jarvis.setRandomPenColor();
	jarvis.move(200);
	jarvis.turn(90);
	jarvis.setRandomPenColor();
	jarvis.move(200);
	}
	
	}
	
	
	}





