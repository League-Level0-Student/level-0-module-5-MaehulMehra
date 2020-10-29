package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog(null, "What pet do you want most, dog, cat, or hamster?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give Water", "Play With", "Clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void giveWater () {
		if (pet.equalsIgnoreCase ("dog")) {
			JOptionPane.showMessageDialog(null, "bark bark");
			happinessLevel += 5;
		}
		else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "purr purr");
			happinessLevel += 5;
		}
		else {
			JOptionPane.showMessageDialog (null, "squeak squeak");
			happinessLevel +=5;
		}
	}
	static void playWith () {
		if (pet.equalsIgnoreCase ("dog")) {
			JOptionPane.showMessageDialog(null, "they play fetch with you");
			happinessLevel += 7;
		}
		else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "they chase a laser");
			happinessLevel += 7;
		}
		else {
			JOptionPane.showMessageDialog (null, "they start running on their wheel");
			happinessLevel +=7;
		}
	}
		
}