package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String userPet;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		userPet = JOptionPane.showInputDialog("What kind of pet do you want to buy?").toLowerCase();

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinessLevel < 20) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, 
					"What do you want to do to make your " + userPet + " happy?", 
					"Happy Pet v1.0", 
					0, 
					JOptionPane.INFORMATION_MESSAGE, 
					null,
					new String[] { "Give Food", "Groom", "Walk", "Cuddle" }, 
					null);

			// 5. Use user input to call the appropriate method created in step 4.
			switch(task) {
				case 0:
					feedPet();
					break;
				case 1: 
					groomPet();
					break;
				case 2:
					walkPet();
					break;
				case 3:
					cuddlePet();
					break;
				default:
					System.err.println("Oops! Didn't account for one of the options.");
					break;
			}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
		
		JOptionPane.showMessageDialog(null, "You love your " + userPet + " and are a great owner.");

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feedPet() {
		happinessLevel += 2;
		JOptionPane.showMessageDialog(null, "Your " + userPet + " gobbles up the food!");
	}
	
	static void groomPet() {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "Your " + userPet + " is so happy to be clean!");
	}
	
	static void walkPet() {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "Your " + userPet + " loves the exercise!");
	}
	
	static void cuddlePet() {
		happinessLevel += 3;
		JOptionPane.showMessageDialog(null, "Your " + userPet + " loves being with you!");
	}
}