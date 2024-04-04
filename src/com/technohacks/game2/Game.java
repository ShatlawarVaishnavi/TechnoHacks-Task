package com.technohacks.game2;

public interface Game {

	Move getUserMove();

	Move getComputerMove();

	void determineWinner(Move computerMove, Move userMove);
	
	void playGame();
}
