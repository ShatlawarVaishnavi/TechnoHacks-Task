package com.technohacks.game2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame implements Game {
    private final Random random;
    private final Scanner scanner;

    public RockPaperScissorsGame() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Move getUserMove() {
        System.out.println("Enter your move (ROCK, PAPER, SCISSORS): ");
        String userInput = scanner.nextLine().toUpperCase();
        return Move.valueOf(userInput);
    }

    @Override
    public Move getComputerMove() {
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber];
    }

    @Override
    public void determineWinner(Move computerMove, Move userMove) {
        if (computerMove == userMove) {
            System.out.println("It's a tie!");
        } else if ((userMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                   (userMove == Move.PAPER && computerMove == Move.ROCK) ||
                   (userMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            System.out.println("You win! Computer chose " + computerMove);
        } else {
            System.out.println("Computer wins! Computer chose " + computerMove);
        }
    }

    @Override
    public void playGame() {
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            Move computerMove = getComputerMove();
            Move userMove = getUserMove();

            System.out.println("Computer chose: " + computerMove);
            determineWinner(computerMove, userMove);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
    
}
