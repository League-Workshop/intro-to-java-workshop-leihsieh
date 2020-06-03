package section4;

import java.util.Random;

public class RandomPractice {
	public static void main(String[] args) {
		Random randy = new Random();
		
		int randomNum = randy.nextInt(11); //number between 0-10
		System.out.println(randomNum);
		
		int random2 = randy.nextInt(35); //number between 0-34
		System.out.println(random2);
		
		int random3 = randy.nextInt(11)+10; //number between 10-20
		System.out.println(random3);
		
		int random4 = randy.nextInt(26)+25;
		System.out.println(random4);
		
		int random5 = randy.nextInt(21)-10;
		System.out.println(random5);
	}
}
