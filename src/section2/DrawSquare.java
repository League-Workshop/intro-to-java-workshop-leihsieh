package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	 Robot jarvis= new Robot();
	 jarvis.penDown();
	 jarvis.setSpeed(5);
	 jarvis.moveTo(500,500);
	 jarvis.move(200);
	 jarvis.turn(90);
	 jarvis.move(200);
	 jarvis.turn(90);
	 jarvis.move(200);
	 jarvis.turn(90);
	 jarvis.move(200);
}
}
