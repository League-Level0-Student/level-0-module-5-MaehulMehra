package _02_nested_loops._3_for_loop_gauntlet;

public class Gauntlet {
	public static void main(String[] args) {
		for (int part1 = 0; part1 <= 100; part1++) {
			System.out.println(part1);
		}
		for (int part2 =100; part2 >= 0; part2--) {
			System.out.println(part2);
		}
		for (int part3 = 2; part3 <= 100; part3 ++) {
			if (part3 % 2 ==0) {
				System.out.println(part3);
			}
		}
		for (int part4 = 1; part4 <= 99; part4 ++) {
			if (part4 % 2 == 1) {
				System.out.println(part4);
			}
		}
		for (int part5 = 1; part5 <= 500; part5 ++) {
			if (part5 % 2 == 0) {
				System.out.println(" " + part5 + "is even");
			}
			else {
				System.out.println(" " + part5 + "is odd");
			}
		}
		for (int part6 = 0; part6 <= 777; part6 ++) {
			if (part6 % 7 ==0) {
				System.out.println(part6);
			}
		}
		for (int part7 = 2008; part7 <= 2020; part7 ++) {
			System.out.println("In " + part7 + ", I was " + (part7 - 2008) + " years old.");
		}
		for (int i =0; i < 3; i++) {	
		for (int part8 = 0; part8 < 3; part8++) {
			System.out.println(i + " " + part8);
		}
		}
		for (int a = 1;a < 9; a +=3) {
		for (int part9 = a; part9 <= a + 2; part9++) {
			System.out.print(part9 + " ");
		}
		System.out.println();
		}
		for (int b = 1; b < 100; b += 10) {
		for (int part10 = b; part10 <= b + 9; part10 ++) {
			System.out.print (part10 + " ");
		}
		System.out.println();
		}
		for (int row = 0; row < 6; row ++) {
			for (int column = 0; column < row +1; column ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
