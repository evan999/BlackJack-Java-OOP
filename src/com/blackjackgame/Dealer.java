package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actions{
    private int score;
    private int bet; // needed for dealer?
    private List<Card> hand;
    private boolean bust = false;
    private boolean stand = false;

    public Dealer(int score, int bet){
        this.bet = bet;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void hit(Card card){
        score += card.getValue();
    }

    public int stand(){
        int finalScore = score;
        return finalScore;
    }


}
