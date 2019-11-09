/**
 * @fileoverview Goal: Tell the user a story, but give them options so they can decide the path of the plot.
 */
package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		// Use JOptionPanes, if statements, and your imagination to make an interesting story.
		final String PROGRAM_TITLE = "Choose Your Own Adventure v1.0";
		int doorChoice;
		int dialogChoice;
		
		doorChoice = JOptionPane.showOptionDialog(null, 
				"You see two doors in front of you.\nThe left door is run down -- the paint is chipping and the knob is rusty.\nThe right door looks pristine and inviting.\nWhich door do you want to open?", 
				PROGRAM_TITLE, 
				0, 
				JOptionPane.INFORMATION_MESSAGE, 
				null,
				new String[] { "Right Door", "Left Door" }, 
				null);
		
		if(doorChoice == 0) { // right door
			JOptionPane.showMessageDialog(null, "The door opens and you see a grue. Why was this terrible monster behind such a nice looking door?\nThe grue eats you. YOU HAVE DIED.");
		} else { // left door
			dialogChoice = JOptionPane.showOptionDialog(null, 
					"Behind the dilapidated door is a robot with a strange mechanical grin.\n\"Didn't you want to see the grue?\" asks the robot rhetorically.\n\"Did you bring me my oil?\" the robot inquires.", 
					PROGRAM_TITLE, 
					0, 
					JOptionPane.INFORMATION_MESSAGE, 
					null,
					new String[] { "*Punch the robot*", "<Lie> Yes, I brought your oil.", "No, I didn't know I was supposed to bring oil." }, 
					null);
			if(dialogChoice == 0) { // punch
				JOptionPane.showMessageDialog(null, "The robot recoils from the force of your blow and sparks leap from his circuits.\nThe robot collapses onto the floor and you see the treasure you always dreamed of behind his metal frame.\nYou grab it, run away, and live happily ever after.\nYOU WIN!");
			} else if (dialogChoice == 1) { // yes
				JOptionPane.showMessageDialog(null, "The robot extends his hand and waits for you to give him the oil.\nAfter a moment, the robot realizes you don't have any oil.\n\"Don't tease me! Go back and get some!\"");
			} else { // no
				JOptionPane.showMessageDialog(null, "The robot shakes his head in disappointment.\"Why did you come then?! Go back and get some!\"");
			}
		}
	}
}
