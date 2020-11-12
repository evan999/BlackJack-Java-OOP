package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements Actions {
    private String name;
    private int score;
    private int bet;
    private int bank;
    private List<Card> hand;
    private boolean bust = false;
    private boolean stand = false;

    public Player(String name, int score, int bet, int bank){
        this.name = name;
        this.score = 0;
        this.bet = 100;
        this.hand = new ArrayList<>();
        this.bank = bank;
    }

    public void hit(Card card){
        // Draw one card face up
        // Add card to hand.
        // Add to score
        score += card.getValue();
        if(score > 21){
            bust = true;
        }
    }

    public int stand(){
        // End player turn. Score then gets compared to Dealer score.
        stand = true;
        return score;
    }

    private int doubleBet(int bet){
        int doubledBet = bet * 2;
        return doubledBet;
    }

    public int placeBet(int amount){
        // Player decides amount of chips they want to bet out of available chips in bank.
        // Initial bet is $100.
        //int initialBet = 100;
        //Scanner scanner = new Scanner(System.in);

        if(amount >= bank){
            System.out.println("Not enough chips in bank");
        }

        bet += amount;
        bank -= bet;

        // Player can choose to add more chips or go "all in".
        return bet;
    }

    public void allInBet(int bank){
        bet = bank;
        bank = 0;
    }

    @Override
    public String toString(){
        return "Player" + name + ", bank= " + bank + ", bet= " + bet;
    }

    public boolean isBust(){
        return bust;
    }

    public void bust(int score){
        if(score > 21){
            bust = true;
        }
    }

    public void addWinnings(){

    }


}
