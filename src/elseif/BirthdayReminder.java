
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 23th";
		String dadsBirthday = "May 5th";
		String myBirthday = "February 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
		String S=JOptionPane.showInputDialog("Who's Birthday are you looking for?");
		if (S.equals("Mom")) {
		JOptionPane.showMessageDialog(null, "Mom's B-Day is "+momsBirthday);
		}
		
		if (S.equals("Asher")) {
		JOptionPane.showMessageDialog(null, "Asher's B-Day is "+myBirthday);
		}
		if (S.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "Dad's B-Day is "+dadsBirthday);
			}
		
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

		}} 
