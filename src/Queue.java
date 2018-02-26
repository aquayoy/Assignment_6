
public class Queue {

	// pointer to first node in queue
	private Node head, tail;

	// constructor
	public Queue() {
		head = null;
		tail = null;
	}

	/*
	 * head ¡÷ N1 ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡÷ null head ¡÷ N1 ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡ö tail
	 * remove an item from queue: first-in, first-out head ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡÷
	 * null head ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡ö tail **head ¡÷ N2 <- N3 <- N4 <- N5 ¡ö tail
	 */

	public void add(Node newNode) {
		if (newNode == null)
			return; // emergency return

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;
			tail.next = null;

		}
	}

	// removes and returns the oldest item in the Queue
	public Node remove() throws QueueEmptyException {
		Node temp;

		temp = head;
		if (head == null) {
			throw new QueueEmptyException();
		} else {

			head = head.next;
			temp.next = null; // don't give client access to queue
		}
		return temp;
	}

	// toString() method produces a String of all the items in the Queue from oldest
	// to youngest

	public String toString() {
		String retStr = "";

		Node current = head;
		while (current != null) {
			retStr = retStr + current.toString() + "  ";
			current = current.next;
		}
		return "a String of all the items in the Queue from oldest to youngest:\n" + retStr;
	}

}

/*
 * throw our own home-made QueueEmptyException in our remove() method. The
 * client will catch it.
 */
class QueueEmptyException extends Exception {
	public QueueEmptyException() {

		super("the queue is empty");
	}
}
