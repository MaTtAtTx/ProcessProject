package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohHexagon;

public class SampleController
{

	// This is what the default constructor looks like (same name as the class)
	public SampleController()
	{

	}

	public void start()
	{
		// Both first and second circle are ways you can initialize objects
		PlayDohCircle firstCircle = new PlayDohCircle();

		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();

		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(2345);

		PlayDohHexagon firstHexagon = new PlayDohHexagon();

		PlayDohHexagon secondHexagon = new PlayDohHexagon(500);

		System.out.print("Here is my first circle: ");
		System.out.println(firstCircle);

		System.out.println("Here is my third circle: " + thirdCircle);

		System.out.println("Here is my first hexagon: " + firstHexagon);

		System.out.println("Here is my second hexagon: " + secondHexagon);

		System.out.print("This is a sample project to show the github and ");
		System.out.println("eclipse process so I develop muscle memory :D");

		testScanner();
	}

	private void testScanner()
	{
		Scanner firstScanner; // Declares a Scanner object.
		firstScanner = new Scanner(System.in); // Instanciates a Scanner Object. (for keyboard input)
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine(); // Stores the answer typed in the scanner (everything)
		System.out.println("Oh, you like to eat " + answer); // Displays the user likes to eat "answer"
		System.out.println("How old are you??");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old");
	}

}
