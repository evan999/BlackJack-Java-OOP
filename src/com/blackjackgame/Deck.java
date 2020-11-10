package com.blackjackgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardDeck;
    // TODO: Need unicode characters for SUITS
    //private final static String[] SUITS = {"\u3898", ""};
    private final static String[] SUITS = {"DIAMOND", "HEARTS", "CLUBS", "SPADES"};
    private final static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Deck(){
        cardDeck = new ArrayList<>();
        // Populate cardDeck with deck of cards
        for(var suit : SUITS){
            for(var faceValue : VALUES) {
                cardDeck.add(new Card(faceValue, suit));
            }
        }
    }

    // TODO: Add constructor that will allow custom suit and values

    // TODO: Adding jokers.

    public void shuffle() {
        // TODO: Fisher-Yates algorithm for shuffling deck.
        Collections.shuffle(cardDeck);
    }

    public Card drawCard(){
        return cardDeck.remove(cardDeck.size() - 1);
    }

}
