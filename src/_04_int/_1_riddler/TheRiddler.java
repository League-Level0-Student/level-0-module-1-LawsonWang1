package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String number = JOptionPane.showInputDialog("I am an odd number. Take away a letter and I become even. What number am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (number.equalsIgnoreCase("7")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect, the answer was 7");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		String city = JOptionPane.showInputDialog("What goes through cities and fields, but never moves?");
		if (city.equalsIgnoreCase("roads")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null,"incorrect, the answer was roads");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score was " + score);
	}
}

