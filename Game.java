
/*LEVEL 1: sort hand by suits and value.
-> printed what we got
-> sorting
-> print what we have after sorting

make sure you have a ranking of the suits:
 
 Clubs 4 x 13 + value
 Diamonds 3 x 13 + the value
 Spades 2 x 13 + the value
 Hearts 1 x 13 + value

every card has a unique value, 

int convertToValue(card){}
	sorting method which gets as an argument “my hand”

using for and while loop, boolean notSorted = true when we begin, 
		first statement is imidiatlly false
			than compare the current card with the next card
			when the current card is smaller than the next one, flip it around.

			when you flip it around, 
				the notSorted will be true again, 
					and your for/while loop starts again.

for loop is for running over all the cards
	while loop is for checking if a/all card have been swapped.

*/

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card cardOne = new Card();
		cardOne.suit = "Diamonds";
		dealer.convertToValue(cardOne);

	}

	// hand.sort();

	static void testFunctionality() {
	}
}

class Card {
	String suit;
	int value;

	void printCard() {
		String[] valueStrings = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		System.out.println("Card: " + suit + " " + valueStrings[value]);
	}
}

class Dealer {
	String[] suits = { "Clubs", "Diamonds", "Spades", "Hearts" };
	int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

	private int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(52);
		return generatedNumber;

	}

	int convertToValue(Card cardIn) {
		// commit code that made sense
		// get suit, multiply suit + get value

		/*
		 * Clubs 4 x 13 + value Diamonds 3 x 13 + the value Spades 2 x 13 + the value
		 * Hearts 1 x 13 + value
		 */
		int suitFactor = 4;

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
};