/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5 EXERCISE 3*/

public class DivisorCalc {

	public static int gcd(int num1, int num2) {
		if (num2 <= num1 && num1 % num2 == 0) {
			return num2;
		} else if (num1 <num2) {
			return gcd(num2, num1);
		} else {
			return gcd(num2, num1 % num2);  
		}				
	}
}
