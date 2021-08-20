
public class Driver {

	public static void main(String[] args) {
		ArrayStack stack1 = new ArrayStack(); 
		LinkedStack stack2 = new LinkedStack();
		
		// Exercise 1
		for (int value: new int[] {1, 7, 3, 4, 9, 2}) {
			stack1.push(value);
			stack2.push(value); 
		}
		System.out.print("The elements from the ArrayStack: ");
		while (!stack1.isEmpty()) {
			System.out.print(stack1.pop() + " ");
		}
		
		System.out.println();
		System.out.print("The elements from the LinkedStack: ");
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop() + " ");
		}
		
		// Exercise 2
		for (int value: new int[] {1, 7, 3, 4, 9, 2}) {
			stack2.push(value); 
		}
		
		stack2.removeBottomHalf();
		System.out.println();
		System.out.print("The elements from the top half of the LinkedStack: ");
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop() + " ");
		}
	}
}
