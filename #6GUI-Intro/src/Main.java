import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		

		String name = JOptionPane.showInputDialog("What is your name? ");
		//JOptionPane.showMessageDialog(null, "Your name is " + name);
			
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
		//JOptionPane.showMessageDialog(null,"Your age is " + age);
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("What is your weight?"));
		//JOptionPane.showMessageDialog(null, "Your weight is " + weight + "lbs");
		
		
		JOptionPane.showMessageDialog(null, "Your name is " + name+ "\nYour age is " + age + "\nYour weight is " + weight + "lbs" );
		
		
				

	}

}





/* 

Further Notes:

To use GUI, need to import javax.swing.JOptionPane;

JOptionPane.showInputDialog(" ") > use this to enter the dialogue to user 

JOptionPane.showMessageDialog(null, " "); > use this to show the message back

Integer.parseInt > use this to convert int String to Int


String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		


*/