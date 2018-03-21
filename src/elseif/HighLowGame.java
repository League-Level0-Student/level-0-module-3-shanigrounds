//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(50);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int p = 0; p < 10; p++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess =JOptionPane.showInputDialog("Guess a number between 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int x = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (x ==50) {
				// 6. Win 
				JOptionPane.showMessageDialog(null, "You win!");
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			if(x==50) {
			System.exit(0);
			}
			// 7. if the guess is high
			if (x >50) {
					// 8. Tell them it's too high
			JOptionPane.showMessageDialog(null, "Too high!");
			}
			// 9. if the guess is low
			if (x<50) {

			
				// 10. Tell them it's too low
JOptionPane.showMessageDialog(null, "Too low!");
			}
		}
		// 13. Tell them they lose
JOptionPane.showMessageDialog(null,"You lose!");
		
	

}
}

