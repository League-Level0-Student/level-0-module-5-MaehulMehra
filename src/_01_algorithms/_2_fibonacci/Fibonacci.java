package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int variable1 = 0;
		int variable2 = 1;
		int sum;
		System.out.println(variable1);
		System.out.println(variable2);
		for (int i = 0; i<10; i++) {
			sum = variable1 + variable2;
			System.out.println(sum);
			variable1 = variable2;
			variable2 = sum;
			}
	} 
}
