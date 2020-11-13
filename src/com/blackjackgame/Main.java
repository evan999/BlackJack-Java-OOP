package com.blackjackgame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        //Card card = new Card(1, "CLUBS");
        //System.out.println(card.toString());
        deck.shuffle();
        System.out.println(deck.toString());
        Card card = deck.drawCard();
        System.out.println(card.toString());
    }
}
