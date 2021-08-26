// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	// Method to remove the middle element in the queue
	void removeMiddle() {
		LinkedNode current = front;
		if (count == 1) { 
			front = null;
			count--;
		} else if (count % 2 == 1) {
			for (int i = 1; i < count / 2; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			count--;
		} else if (count > 0) {
			for (int i = 1; i < (count / 2) - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			count--;
		}
	}
	
	// Added method to print elements of the queue without dequeue required
	public String toString() {
		LinkedNode current = front; 
		String elements = String.valueOf(current.x);
		for (int i = 1; i < count; i++) {
			current = current.next;
			elements += " " + current.x;
		}
		return elements;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
}
