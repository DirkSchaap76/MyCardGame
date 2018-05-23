
import java.util.Random;

/*
 * next on the list: get a sorting method which gets and argument of "my Hand"
 * 
 * my thinking: who gets a hand? who does the sorting?
 * a player gets a hand and does the sorting
 * 
 * functional goal: create a player 
 * 
 *  technical strategy: create a new player in the main method of the game class
 * 
 * 
 */

public class Game {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card card = new Card();

		Player player = new Player();

		card.suit = "Hearts";
		card.value = 2;
		card.printCard();

		dealer.convertToValue(card);
	}

	static void testFunctionality() {
	}
}
