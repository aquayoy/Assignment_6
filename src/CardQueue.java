
//Derive CardQueue from Queue
public class CardQueue extends Queue {

	public static final Card QUEUE_EMPTY = null;

	// methods that let you add actual Cards onto each of the Queue:
	public void addCard(Card card) {
		// don't allow adding of QUEUE_EMPTY
		if (card == null)
			return; // could throw an exception when we learn how
		// create a new CardNode
		CardNode2 ca = new CardNode2(card);

		// add the CardNode onto the queue (base class call)
		super.add(ca);
	}

	public Card removeCard() throws QueueEmptyException {
		// remove a node
		CardNode2 ca = null;

		try {
			ca = (CardNode2) remove();

		} catch (QueueEmptyException ex) {

			ex.printStackTrace();

			throw ex;
		}

		if (ca == null) {

			//System.out.println("No more items in the queue.");
			return QUEUE_EMPTY;
		}

		else {
			return ca.getData();
		}
	}
}
