
public class Player {
	// fields
	private String playerName;
	Card[] myHand = new Card[5]; // 5 is a placeholder size. this might change in the future.

	// Getters and setters.
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	// methods
	Card[] sortHand(Card[] myHandIn) {
		this.myHand = myHandIn;

		for (Card c : myHandIn) {
			boolean notSorted = true;
			while (notSorted) {

				// first statement is immediately false(?)
				/*
				 * toDo: compare current card with next card if currentCard < nextCard: flip
				 * when flipped: notSorted = true for/while should now start again
				 * 
				 */
			}

		}

		return myHandIn;
	}
}
