package model;

import java.util.ArrayList;

public class Hand {

	ArrayList<Card> handOfCards;

	public Hand(ArrayList<Card> handOfCards) {
		//this should be limited to 6
		this.handOfCards = handOfCards;
	}
	
	//binary search implementation
	public Card getCardFromHand(int cardToFind) {
		/*
		int left = 0;
		int pivot = 0;
		int right = handOfCards.size();
		
		while (left < right) {
			pivot = left - (right - left) / 2;
			
			if (handOfCards.get(pivot).getNumber() == cardToFind) {
				return pivot;
			}
			else if (handOfCards.get(pivot).getNumber() < cardToFind) {
				left = pivot + 1;
			} else {
				right = pivot - 1;
			}
		}
		*/
		//not finished
		return handOfCards.get(cardToFind);
	}
		
	public void addToHand(Card card) {
		handOfCards.add(card);
		
	}
	
	public ArrayList<Card> getAllCards() {
		return handOfCards;
		
	}
}
