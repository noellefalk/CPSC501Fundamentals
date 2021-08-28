/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * Program 4 - Set ADT */

public class Set {
	LinkedNode head;
	int count;
	
	public Set() {
		head = null;
		count = 0;
	}
	
	public void add(int x) {
		if (!exists(x)) {
			LinkedNode node = new LinkedNode(x);
			
			if (head == null) {
				head = node;
				count++;
			} else {
				node.next = head;
				head = node;
				count++;
			}
		}
	}

	public void delete(int x) {
		if (exists(x)) {
			if (head.x == x) {
				head = head.next;
				count--;
			} else {
				LinkedNode current = head;
				
				while (current.next != null) {
					if (current.next.x == x) {
						if (current.next.next == null) {
							current.next = null;
							count--;
						} else {
							current.next = current.next.next;
							count--;
						}
					} else {
						current = current.next;
					}
				}
			}
		}
	}
	
	public boolean exists(int x) {
		LinkedNode current = head;
		boolean doesExist = false;
		
		while (current != null) {
			if (current.x == x) {
				doesExist = true;
				break;
			} else { 
				current = current.next;
			}		
		}
		return doesExist;		
	}
	
	public String toString() {
		LinkedNode current = head; 
		String elements = "";
		while (current != null) {
			elements += current.x + " ";
			current = current.next;
		}
		return elements;
	}
}
