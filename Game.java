
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card cardOne = new Card();
		cardOne.suit = "Hearts";
		dealer.convertToValue(cardOne);

	}

	// hand.sort();

	static void testFunctionality() {
	}
}
