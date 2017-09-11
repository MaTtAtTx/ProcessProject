package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;

public class SampleController
{
	
	public SampleController()
	{
		
	}

	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle();
		
		
		System.out.println("This is a smaple project to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
	
		testScanner();
	}
	

	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object.
		firstScanner = new Scanner(System.in); //Instanciates a Scanner Object. (for keyboard input)
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine(); //Stores the answer typed in the scanner (everything)
		System.out.println("Oh, you like to eat " + answer); //Displays the user likes to eat "answer"
	}
}
