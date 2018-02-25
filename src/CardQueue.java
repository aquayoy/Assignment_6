
//Derive CardQueue from Queue
public class CardQueue extends Queue{

	// methods that let you add actual Cards onto each of the Queue.

	
	 public static final Card QUEUE_EMPTY = new Card();

	   public void addCard(Card card)
	   {
	      // don't allow pushing of Float.MIN_VALUE 
	      if (card == null)
	         return;    // could throw an exception when we learn how
	      // create a new FloatNode
	      CardNode ca = new CardNode(card);
	   
	      // push the StackNode onto the stack (base class call)
	      super.add(ca);
	   }

	   public Card removeCard() throws QueueEmptyException
	   {
	      // pop a node
	      CardNode ca = (CardNode)remove();
	      if (ca == null)
	    	  throw new QueueEmptyException();
	         //return QUEUE_EMPTY;
	      else
	         return ca.getData();
	    }
	
	
	
	
}
