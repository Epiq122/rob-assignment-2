package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
	
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a Number between 1 and 100");
		int guessNumber = scan.nextInt();
		
		
		int guesses = 5;
		int max = 100;
		int min = 1;
		int showRandom = min + random.nextInt(max);
		System.out.println(showRandom);
		
		
		
		if(guessNumber  == showRandom) {
			System.out.println("Good Guess!");
		}else {
			System.out.println("Try Again");
			guesses-= 1;
			System.out.println(guesses);
		}
	

}
}

