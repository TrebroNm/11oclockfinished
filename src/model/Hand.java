package model;

import java.util.ArrayList;

public class Hand {

	ArrayList<Card> handOfCards = new ArrayList<>();

	public Hand() {
		//this should be limited to 6
	}
	
	//binary search implementation
	public Card getCardFromHand(int cardToFind) {
		
		int left = 0;
		int pivot = 0;
		int right = handOfCards.size();
		
		while (left < right) {
			pivot = left - (right - left) / 2;
			
			if (Integer.parseInt(handOfCards.get(pivot).getNumber()) == cardToFind) {
				return handOfCards.get(pivot);
			}
			else if (Integer.parseInt(handOfCards.get(pivot).getNumber()) < cardToFind) {
				left = pivot + 1;
			} else {
				right = pivot - 1;
			}
		}
		
		return new Card("-1", "");
	}
		
	public void addToHand(Card card) {
		handOfCards.add(card);
		
	}
	
	public ArrayList<Card> getAllCards() {
		return handOfCards;
		
	}
	
	public void printCards() {
		for(Card c : handOfCards) {
			System.out.println(c.getNumber() + "    " + c.getSuit());
		}
	}
}
