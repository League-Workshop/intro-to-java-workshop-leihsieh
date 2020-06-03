package section3;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Goodbye");
	
		JOptionPane.showMessageDialog(null, "helloworld");
		JOptionPane.showMessageDialog(null, "bye");
		
		String input = JOptionPane.showInputDialog("How are you?");
		JOptionPane.showMessageDialog(null, input);
		
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!");
}

}
