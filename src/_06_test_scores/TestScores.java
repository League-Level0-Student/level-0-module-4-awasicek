/**
 * @fileoverview Goal: Tell the user their grade!
 */
package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		// Write code to ask the user for their test score. 
		// Your program MUST allow the user to enter a test score that has a decimal, e.g. 75.5
		// Give them a different message according to their score. 
		// Example: "Wow! You must have studied really hard for that test!" 

		// HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double.
		String userScore = JOptionPane.showInputDialog("What is your test score (e.g., 90.5)?");
		double numScore = Double.parseDouble(userScore);
		if(numScore >= 90) {
			JOptionPane.showMessageDialog(null, "Wow, good job!");
		} else {
			JOptionPane.showMessageDialog(null, "Study harder!");
		}
	}
}
