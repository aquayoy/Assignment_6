
//Derive CardQueue from Queue
public class CardQueue extends Queue {

	public static final Card QUEUE_EMPTY = new Card();

	// methods that let you add actual Cards onto each of the Queue:
	public void addCard(Card card) {
		// don't allow adding of QUEUE_EMPTY
		if (card == null)
			return; // could throw an exception when we learn how
		// create a new CardNode
		CardNode ca = new CardNode(card);

		// add the CardNode onto the queue (base class call)
		super.add(ca);
	}

	public Card removeCard() throws QueueEmptyException {
		// remove a node
		CardNode ca = (CardNode) remove();
		if (ca == null)
			throw new QueueEmptyException();
		// return QUEUE_EMPTY;
		else
			return ca.getData();
	}

}
