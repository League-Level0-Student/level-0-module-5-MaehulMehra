package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog(null, "What is your name?");   //Jackie
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		System.out.println(name.toUpperCase ());								//JACKIE
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
		for (int i = 0; i < name.length (); i++) {
			char variable = name.charAt(i);
			if (i % 2 ==0) {
				variable = Character.toUpperCase(variable);
			}
			else {
				variable = Character.toLowerCase(variable);
			}
			// 4. Create a char variable to store the next character of the name
			//    using .charAt()
			goofyName += variable;
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			//  Use Character.toLowerCase(yourChar)
			
			// 6. ADD this char  to the goofyName String						//JaCkIe
		}
		
		// 7. Use pop-up to show user their Goofy name
			JOptionPane.showMessageDialog (null, goofyName);
	}
}

