
public class FloatEqu {

	public static void main(String[] args) {
		final double TOLERANCE = 0.000001;
		
		double a = (1.0 / 10) * (1.0 / 10);
		double b = (1.0 / 100);
		
		/* this if statement will result in not equal since the binary digits of the float 
		point must match exactly to be equal */
		if (a == b) {  
			System.out.println("The values are equal.");
		} else {
			System.out.println("The values are not equal.");
		}
		
		if (Math.abs(a - b) < TOLERANCE) {
			System.out.println("The values are essentially equal.");
		}
	}
}
