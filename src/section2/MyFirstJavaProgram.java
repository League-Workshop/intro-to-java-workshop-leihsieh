package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
		Robot bob = new Robot("batman");
		bob.setPenColor(Color.black);
		bob.penDown();
		bob.setSpeed(15);
		bob.move(100);
		bob.turn(90);
		bob.setPenColor(Color.CYAN);
		bob.move(100);
		bob.hide();
		bob.turn(90);
		bob.penUp();
		bob.move(200);
		bob.turn(180);
		bob.show();
		bob.sparkle();
		bob.hide();
		bob.turn(270);
		
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		
		for(int i = 0; i < 4; i++ ) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
}
