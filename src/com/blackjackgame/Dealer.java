package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actions{
    private int score;
    private int bet; // needed for dealer?
    private Deck deck;
    private List<Card> hand;
    private boolean bust = false;
    private boolean stand = false;

    public Dealer(int score){
        this.deck = new Deck();
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    @Override
    public void hit(Card card){
        score += card.getValue();
    }

    @Override
    public int stand(){
        int finalScore = score;
        return finalScore;
    }

    public int getScore(){
        return score;
    }
}
