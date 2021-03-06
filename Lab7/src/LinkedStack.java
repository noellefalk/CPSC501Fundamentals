// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}
	
	// Removes half of the elements from the list and removes them from the bottom half
	
	void removeBottomHalf() {				// The time complexity of the method is O(N). 
		LinkedNode current = front; 		// O(1)
		int half = count / 2; 				// O(1)
		int i = 1; 							// O(1)
		if (current != null) {				// O(1)
			while (i < half) {				// O(N)
				 current = current.next; 	// O(1)
				 i++;						// O(1)
			}
			current.next = null;			// O(1)
			count = half;					// O(1)
		}
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
}
