package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int randomNumber = random.nextInt(100) + 1;
		int guessesRemaining = 5;

		while (true) {
			System.out.println("Guess a number between 1 and 100: ");

			int guessNumber = scan.nextInt();

			if (guessesRemaining <= 1) {
				System.out.println("Sorry You Lost the number was " + randomNumber);

				break;
			} else if (guessNumber > randomNumber) {
				System.out.println("The Number you have entered is too high please try again");
				guessesRemaining--;
				System.out.println("You have " + guessesRemaining + " remaining.");

			} else if (guessNumber < randomNumber) {
				System.out.println("The Number you have entered is too low please try again");
				guessesRemaining--;
				System.out.println("You have " + guessesRemaining + " remaining.");

			} else if (guessNumber == randomNumber) {
				System.out.println("Congrats the number was " + randomNumber);
				break;
			}

		}

		scan.close();
	}
}
