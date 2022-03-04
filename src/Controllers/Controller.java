package Controllers;

import Containers.Container;
import model.Card;

public class Controller {

	Container ctr = Container.getInstance();
	
	public void createCards() {
		for(int n = 2; n<=14; n++) {
			for(int s = 1; s<=4; s++) {
				Card card = new Card(getNumber(n), getSuit(s));
				ctr.addToStack(card);
			}
		}
		shuffle();
	}
	
	public void shuffle() {
		ctr.shuffle();
	}
	
	
	private String getNumber(int n) {
		String number = "";
		if(n<=10) {
			number += n;
		}else {
			switch(n) {
			case 11:
				number = "J";
				break;
			case 12:
				number = "K";
				break;
			case 13:
				number = "A";
				break;
			case 14:
				number = "A";
				break;
			}
		}
		return number;
	}
	
	private String getSuit(int s) {
		String suit = "";
		switch(s) {
		case 1:
			suit = "spades";
			break;
		case 2:
			suit = "clubs";
			break;
		case 3:
			suit = "diamonds";
			break;
		case 4:
			suit = "hearts";
			break;
		}
		return suit;
	}
}
