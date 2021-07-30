/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 4 */

import java.util.ArrayList;
import java.util.Collections;

public class DealCards {
	final static int MAX_HAND = 5;
	final static int DECK_SIZE = 52;

	public static void main(String[] args) {
		ArrayList<Integer> cardDeck = new ArrayList<Integer>(DECK_SIZE);

		// Adds elements to array representing deck of cards: contains numbers 0 to 51
		for (int counter = 0; counter < DECK_SIZE; counter++) {
			cardDeck.add(counter);	
		}

		Collections.shuffle(cardDeck);
				
		for (int count = 0; count < MAX_HAND; count++) {
			int value = cardDeck.get(count);
			
			Card card1 = new Card(value);
			System.out.println(card1);
		}
	}
}
