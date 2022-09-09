package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        boolean success = false;


        while (success == false) {
            int guessesRemaining = 5;
            int randomNumber = random.nextInt(100) + 1;
            int guessNumber = 0;

            while (true) {


                System.out.println("Guess a number between 1 and 100");
            
                guessNumber = scan.nextInt();

                if (guessNumber <= 0 || guessNumber > 100) {

                    System.out.println("Invalid input please enter a number between 1 and 100");

                } else if (guessNumber == randomNumber) {
                    System.out.println("YOU GOT IT ! the number was " + randomNumber);
                    success = true;
                    break;

                } else if (guessesRemaining == 1) {
                    System.out.println("Sorry you lost!");
                    success = true;
                    break;

                } else if (guessNumber < randomNumber) {
                    guessesRemaining--;

                    System.out.println("Sorry your guess was to low please try again");
                    System.out.println("You have " + guessesRemaining + " guesses remaining !");

                } else if (guessNumber > randomNumber) {
                    guessesRemaining--;

                    System.out.println("Sorry your guess was to high please try again");
                    System.out.println("You have " + guessesRemaining + " guesses remaining !");
                }

            }


        }
    }
}