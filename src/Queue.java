
public class Queue {

	 // pointer to first node in stack
	   private Node head, tail;
	   
	   // constructor
	   public Queue()
	   {
	      head = null;
	      tail = null;
	   }
//	   top ¡÷ sn4  ¡÷  sn3 ¡÷  sn2  ¡÷ sn1 ¡÷ null	   
//	   public void push(Node newNode)
//	   {   
//	      if (newNode == null) 
//	         return;   // emergency return
//	      newNode.next = top;
//	      top = newNode;
//	   }  
	   /*head ¡÷ N1 ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡÷ null
	    *head ¡÷ N1 ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡ö tail
	    *remove an item from queue: first-in, first-out
	    *head ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡÷ null
	    *head ¡÷ N2 ¡÷ N3 ¡÷ N4 ¡÷ N5 ¡ö tail
	    * **head ¡÷ N2 <- N3 <- N4 <- N5 ¡ö tail*/
	   
	   public void add(Node newNode)
	   {   
	      if (newNode == null) 
	         return;   // emergency return
	     //newNode.next = tail ;
	     // tail = newNode;
	      //newNode.next = top ;
	      //top = newNode;
	      
	      if (head == null) {
	    	 head = newNode;
	    	 tail = newNode;
	      }
	      else {
	    	  //Node temp = tail;
	    	  tail.next = newNode;
	    	  tail = newNode;
	    	  tail.next = null;
	    	  //tail.next =temp;
	    	  //newNode.next =temp;
	    	  //System.out.println ("tail= "+tail.toString()+" head= "+head.toString()+"newNode.next= "+newNode.next.toString());
	      }
	   }  
	   
	   // removes and returns the oldest item in the Queue
	   public Node remove() throws QueueEmptyException
	   {
	      Node temp;
	     
	      temp = head;
	      if (head == null)
	      {
	    	  throw new QueueEmptyException();
	      }
	      else {  
	    	  
	    	 head = head.next; 
	         temp.next = null; // don't give client access to stack!
	      }
	      
	      //System.out.println ("tail= "+tail.toString()+" head= "+head.toString());  
	      return temp;      
	   }
	   
	   // toString() method produces a String of all the items in the Queue from oldest to youngest

	   public String toString() {
		   String retStr = "";

	        Node current = head;
	        while(current != null){
	            retStr = retStr + current.toString() +"  ";
	            current =current.next;
	        }
	        return "a String of all the items in the Queue from oldest to youngest:\n" + retStr;
	   }
	   
	   
//	   public String toString() {
//		   String retStr = "";
//
//	        Node current = tail;
//	        while(current != head){
//	            retStr = current.toString() +"  "+ retStr;
//	            current =current.next;
//	        }
//	        retStr = current.toString() +"  "+ retStr;
//	        return "a String of all the items in the Queue from oldest to youngest:\n" + retStr;
//	   }
	   
	  
	   // console display
//	   public void showStack()
//	   {
//	      StackNode p;
//	      
//	      // Display all the nodes in the stack
//	      for( p = top; p != null; p = p.next )
//	         p.show();
//	   }
	   
	   
	   /* throw our own home-made QueueEmptyException in our remove() method. 
	    * The client will catch it.*/
	   
	   
	   
}
class QueueEmptyException extends Exception
{
	public QueueEmptyException() {
	
		super("the queue is empty");
	}
}

