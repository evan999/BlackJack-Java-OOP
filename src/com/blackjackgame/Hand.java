package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand = new ArrayList<>();
    private Player player;
    private int score;
    private boolean hasAce;
    private Actor actor;

    public Hand(Actor actor){
        this.actor = actor;
       // this.hand = new ArrayList<Card>();
    }

    public Actor getActor(){
        return actor;
    }

    public int handCount() {
        return hand.size();
    }

    public void addCard(Card dealCard){
        hand.add(dealCard);
    }

    public Card removeCard(int index){
        return hand.remove(index);
    }


    public int getScore(){
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
