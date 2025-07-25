package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

String birthday = JOptionPane.showInputDialog("When is your birthday (mm/dd)?");
	if (birthday.equals("07/24")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	} else {
		JOptionPane.showMessageDialog(null, "I wish you a very merry UNbirthday.");
	}
		
	}
}

