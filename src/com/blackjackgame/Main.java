package com.blackjackgame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        Deck rdeck = new Rigged();
        deck.shuffle();
        Card card = deck.drawCard();
        System.out.println(card);
    }
}
