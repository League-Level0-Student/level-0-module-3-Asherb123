//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob=new Robot();
		
		for (int i = 0; i < 1000; i++) {
			
		
		//1. Create a new Robot
		
		rob.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
		rob.setPenWidth(100);
		//5. Use an if/else statement to set the pen color that the user requested
		rob.penDown();
        //6. If the user doesn’t enter anything, choose a random color
		rob.setRandomPenColor();
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		rob.sparkle();
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i1 = 0; i1 < 4; i1++) {
			
		
		rob.move(100);
		rob.turn(-33);
		rob.turn(-80);
		}	
	}
	
	
	
	
	
	}	
}
