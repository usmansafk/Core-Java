import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
			
		String name = " ";
		
		while(name.isBlank()) {
			//System.out.println("Enter your name: ");
			name = JOptionPane.showInputDialog("Enter your name");
			//name = scanner.nextLine();
		}
		
		
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
	}

}



/* 

Further Notes:

-while loop = executes a block of code as long as the condition remains true

-isBlank() whilst this is blank....(for example: keep asking user for their name.)



-do loop is the same, except the condition is written after the brackets
difference being, it will always execute the block of code at least once
*/

