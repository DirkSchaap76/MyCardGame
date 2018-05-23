public class Card {
	String suit;
	int value;

	void printCard() {
		String[] valueStrings = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		System.out.println("Card: " + suit + " " + valueStrings[value]);
	}
}
