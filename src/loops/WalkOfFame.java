
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		int starSize = 100;
		rob.setSpeed(100);
		rob.penDown();
		rob.setRandomPenColor();
		rob.setPenWidth(5);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.

		for (int J = 0; J < 100; J++) {

			for (int i = 0; i < 5; i++) {

				 
				rob.move(starSize);
				rob.turn(144);
			
			}
			rob.setX(150+J*100);
		}
		

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
