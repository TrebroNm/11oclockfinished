package Containers;

import java.util.Collections;
import java.util.Stack;

import model.Card;
import model.Hand;

public class Container {
	private static Container instance;
	Stack<Card> cards = new Stack<>();
	Hand hand;
	
	public static Container getInstance() {
		if(instance==null) {
			instance = new Container();
		}
		return instance;
	}
	
	public void addToStack(Card c) {
		cards.add(c);
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card takeCard() {
		return cards.pop();
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Hand getHand() {
		return hand;
	}
}
