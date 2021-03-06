
//Deriving from Node
public class CardNode2 extends Node {

	private Card data;

	// constructor
	public CardNode2(Card card) {
		super(); // constructor call to base class
		data = card;
	}

	// accessor
	public Card getData() {
		return data;
	}

	/*
	 * Override the toString() method of the generic Node class to return the
	 * specific type of data
	 */
	public String toString() {

		// let Card class stringize itself through its already defined toString() method
		return data.toString();
	}
}
