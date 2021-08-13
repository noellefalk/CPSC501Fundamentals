/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 6 */

public class ExerciseOne {

	public static void main(String[] args) {
		System.out.println(Counter(5));
	}
	
	public static int Counter(int N) {
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			count++;
			for (int j = 0; j < N; j++) {
				count++;
				for (int k = 0; k < N; k++) {
					count++;
				}
			}
		}
		return count;
	}
}
