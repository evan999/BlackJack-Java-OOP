package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand;
    private Player player;
    private int score;

    public Hand(Player player){
        this.player = player;
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card dealCard){
        hand.add(dealCard);
    }

    public Integer getScore(){
        for(var card : hand){
            score += card.getValue();
        }

        return score;
    }

    public void displayHand(){

    }

    public Player getPlayer(){
        return player;
    }
}
