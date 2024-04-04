package com.technohacks.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame implements Game{
	    private int numberToGuess;
	    private int numberOfAttempts;
	    
	    public NumberGuessingGame() {
	        Random random = new Random();
	        this.numberToGuess = random.nextInt(100) + 1;
	        this.numberOfAttempts = 0;
	    }
	    
	    @Override
	    public void play() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

	        int guess;
	        do {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfAttempts++;
	            
	            if (guess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            }
	        } while (guess != numberToGuess);
	        
	        System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + numberOfAttempts + " attempts.");
	        
	        scanner.close();
	    }
}
