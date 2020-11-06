package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice ();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}
	void skill1 () {
		String dimes = JOptionPane.showInputDialog(null,"How many dimes do you have?");
		int cents = Integer.parseInt(dimes)*10;
		JOptionPane.showMessageDialog(null, "You have " + cents + " cents.");
		String height = JOptionPane.showInputDialog(null, "How tall are you in inches?");
		int tall = Integer.parseInt(height);
		if (tall < 36) {
			JOptionPane.showMessageDialog(null, "You need to eat your Wheaties.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good job you have been eating your Wheaties.");
		}
	}
	void skill2 () {
		for (int a = 1; a <= 30; a++) {
			if (a % 3 ==0) {
				System.out.println(a);
			}
		}
	}
	void skill3 () {
		Random ran = new Random ();
		int rando = 0;
		rando = ran.nextInt (20);
		int rando2 = 0;
		rando2 = ran.nextInt (10);
		System.out.println(rando);
		System.out.println(rando2);
		JOptionPane.showMessageDialog(null, "The difference between the two random numbers is " + (rando - rando2));
	}
	void skill4 () {
		String city = JOptionPane.showInputDialog (null, "What city do you live in?");
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You need to move to San Diego.");
		}
		String car = JOptionPane.showInputDialog(null, "How many cars does your family have?");
		int carInt = Integer.parseInt(car);
		if (carInt == 0) {
			JOptionPane.showMessageDialog (null, "You must use public transportation.");
		}
		else if (carInt == 1) {
			JOptionPane.showMessageDialog(null, "You must have the Lykan HyperSport.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You have " + (carInt*4) + " wheels.");
		}
		}
	void skill5 () {
		String school = JOptionPane.showInputDialog(null, "What school do you go to?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school.");
	}
}
