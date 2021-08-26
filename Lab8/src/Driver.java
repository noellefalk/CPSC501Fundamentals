/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 8 */

public class Driver {

	public static void main(String[] args) {
		ArrayQ arrayQ = new ArrayQ(); 
		LinkedQueue linkedQueue = new LinkedQueue();
		
		// Exercise 1
		for (int value: new int[] {1, 7, 3, 4, 9, 2}) {
			arrayQ.enqueue(value);
			linkedQueue.enqueue(value); 
		}
		System.out.print("The elements from the ArrayQ: ");
		while (!arrayQ.isEmpty()) {
			System.out.print(arrayQ.dequeue() + " ");
		}
		
		System.out.println();
		System.out.print("The elements from the LinkedQueue: ");
		while (!linkedQueue.isEmpty()) {
			System.out.print(linkedQueue.dequeue() + " ");
		}
		
//		// Exercise 2
		// Even Case
		for (int value: new int[] {1, 7, 3, 4, 9, 2}) {
			linkedQueue.enqueue(value);  
		}
		linkedQueue.removeMiddle();
		System.out.println();
		System.out.println("The elements with the middle element removed from the LinkedQueue (even case): " + linkedQueue);
		
		// Odd Case
		linkedQueue.removeMiddle();
		System.out.print("The elements with the middle element removed from the LinkedQueue (odd case): " + linkedQueue);
	}
}