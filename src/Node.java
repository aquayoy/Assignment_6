
public class Node {

	// data (protected allows only certain other classes to access "next" directly)
	   protected Node next;
	    
	   // constructor
	   public Node()
	   {
	      next = null;
	   }
	   
	   // console display
	   public String toString()
	   {
	      return  "(generic node) ";
	   }
	   
	   public Node getNext()
	    {
	        return next;
	    }
	   
}
