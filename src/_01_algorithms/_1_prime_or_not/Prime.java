package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "Type any number.");
		int numberInt = Integer.parseInt(number);
		for (int i = 2; i <= numberInt/2; i++) {
			if (numberInt % i == 0) {
				JOptionPane.showMessageDialog(null, "This is not a prime number.");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "This is a prime number.");
			}
		}
	}
}
