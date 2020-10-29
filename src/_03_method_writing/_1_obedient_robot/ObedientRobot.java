package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(5);
		String shape = JOptionPane.showInputDialog(null, "Which shape do you want to see: sqaure, triangle, or circle");
		String color = JOptionPane.showInputDialog(null, "What color do you want, red, green, blue, or purple?");
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}
		else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}
		else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}
		else {
			rob.setPenColor(Color.magenta);
		}
		if (shape.equalsIgnoreCase("square")) {
			drawSquare ();
		}
		else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle ();
		}
		else if (shape.equalsIgnoreCase("circle")){
			drawCircle ();
		}
		else {
			JOptionPane.showMessageDialog(null, "You put the wrong shape.");
		}
		rob.hide();
	}
	static Robot rob = new Robot ();
	static void drawSquare () {
	for (int i = 0; i < 4; i ++) {
		rob.move (50);
		rob.turn(90);
	}
	}
	static void drawTriangle () {
		for (int a = 0; a < 3; a ++) {
			rob.move(50);
			rob.turn(120);
		}
	}
	static void drawCircle () {
		for (int b=0; b<360; b++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
