import java.util.Random;

public class Dealer {
	String[] suits = { "Clubs", "Diamonds", "Spades", "Hearts" };
	int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

	private int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(52);
		return generatedNumber;

	}

	int convertToValue(Card cardIn) {

		int suitFactor = 1;

		switch (cardIn.suit) {
		case "Hearts":
			suitFactor = 1;
			System.out.println("Hearts have been chosen");
			break;
		case "Spades":
			suitFactor = 2;
			System.out.println("Spades have been chosen");
			break;
		case "Diamonds":
			suitFactor = 3;
			System.out.println("Diamonds have been chosen");
			break;
		case "Clubs":
			suitFactor = 4;
			System.out.println("Clubs have been chosen");
			break;

		}
		int cardValue = suitFactor * 13 + cardIn.value;
		System.out.println(cardValue);

		return cardValue;

	}

	private Card getCardFromNumber(int deckNumber) {
		Card card = new Card();
		card.value = deckNumber % 13;
		card.suit = suits[deckNumber / 13];
		return card;
	}

	Card getCard() {
		return getCardFromNumber(generateRandomNumber());
	}
}