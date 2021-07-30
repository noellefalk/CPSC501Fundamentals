/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 4 */

public class Card { 
	private int value;
		
	public Card(int value) {
		this.value = value;
	}
	
	public String getFaceValue() {
		String actualFaceValue;
		
		int faceValue = value / 4;
		
		switch (faceValue) {
		case 0:
			actualFaceValue = "Ace";
			break;
		case 1:
			actualFaceValue = "King";
			break;
		case 11:
			actualFaceValue = "Jack";
			break;
		case 12:
			actualFaceValue = "Queen";
			break;
		default:
			actualFaceValue = Integer.toString(faceValue);
			break;
		}
		return actualFaceValue;
	}
		
	public String getSuit() { 
		String actualSuit= "";
		
		int suit = value % 4;
		
		switch (suit) {
		case 0:
			actualSuit = "Diamonds";
			break;
		case 1:
			actualSuit = "Hearts";
			break;
		case 2:
			actualSuit = "Spades";
			break;
		case 3:
			actualSuit = "Clubs";
			break;
		}	
		return actualSuit;
	}
	
	public String toString() {
		return getFaceValue() + " of " + getSuit();
	}
}