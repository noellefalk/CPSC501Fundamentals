/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 3 */

public class Box {
	public int size = 0;
	
	public void printBox() {
		for(int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
