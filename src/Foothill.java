
/** CS1B_Assignment_6;option A 
 * Creeger, Adam/ Kishore, Nand/ Lo, YaFan
 */

import java.lang.Exception;

/*show a run that displays some (generic node)s.  
 * Test the Queue's toString() method 
 * and also build a simple loop in your main() to remove and display nodes as they are removed.*/
public class Foothill {

	public static void main(String[] args) throws QueueEmptyException {
		// show a run that displays some (generic node)s
		Node node1 = new Node(), node2 = new Node();

		// one way to use Stack Nodes
		node1.next = node2;

		// a more common way to use StackNodes
		node2.next = new Node();

		String strQueue = "";
		String strCurrent = "";
		for (Node p = node1; p != null; p = p.next) {

			strCurrent = p.toString();
			strQueue = strQueue + strCurrent;
		}
		System.out.println(strQueue);

		System.out.println("-------------main test-------------");

		// add() a bunch of cards, toString() the queue to the screen to see that this
		// is working
		CardQueue cardQueue = new CardQueue();

		CardNode2 cardNode1 = new CardNode2(new Card('3', Card.Suit.clubs));
		CardNode2 cardNode2 = new CardNode2(new Card('7', Card.Suit.diamonds));
		CardNode2 cardNode3 = new CardNode2(new Card('T', Card.Suit.hearts));
		CardNode2 cardNode4 = new CardNode2(new Card('Q', Card.Suit.spades));
		CardNode2 cardNode5 = new CardNode2(new Card('A', Card.Suit.hearts));
		// build the Queue
		cardQueue.addCard(cardNode1.getData());
		cardQueue.addCard(cardNode2.getData());
		cardQueue.addCard(cardNode3.getData());
		cardQueue.addCard(cardNode4.getData());
		cardQueue.addCard(cardNode5.getData());

		System.out.println(cardQueue.toString());

		// then in a loop, remove() items displaying them
		// Go "too far" so that you attempt to remove() from an empty queue and see that
		// you are catching the exception
		Card p;
		System.out.print("remove() items: \n");
		// for (int k = 0; k < 7; k++) {
		//
		// p = cardQueue.removeCard();
		// if (p != null)
		// System.out.print(p.toString() + " ");
		//
		// }
		//
		while ((p = cardQueue.removeCard()) != null) {

			System.out.print(p.toString() + " ");
		}

	}
}
