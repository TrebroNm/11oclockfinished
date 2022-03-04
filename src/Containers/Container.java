package Containers;

import java.util.Collections;
import java.util.Stack;

import model.Card;

public class Container {
	private static Container instance;
	Stack<Card> cards = new Stack<>();
	 
	
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
	
}
