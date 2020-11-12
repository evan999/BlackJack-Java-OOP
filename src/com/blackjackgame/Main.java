package com.blackjackgame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        deck.shuffle();
        Card card = deck.drawCard();
        deck.displayDeck();
    }
}
