
import java.util.Random;

/*
 * next on the list: get a sorting method which gets and argument of "my Hand"
 * 
 * my thinking: if sortHand is going to sort a hand, it should have an card[] as a field
 * 
 * functional goal: create a place to hald the players cards
 * 
 *  technical strategy: create a card[] field in player class
 * 
 * 
 */

public class Game {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card card = new Card();

		Player player = new Player();
		player.sortHand();

		card.suit = "Hearts";
		card.value = 2;
		card.printCard();

		dealer.convertToValue(card);
	}

	static void testFunctionality() {
	}
}
