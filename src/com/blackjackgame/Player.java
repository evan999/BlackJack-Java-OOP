package com.blackjackgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Player implements Actions {
    private String name;
    private int score;
    private int bet;
    private int bank;
    //private Hand hand;
    private List<Card> hand;
    private boolean bust = false;
    private boolean stand = false;
    private boolean firstTurn = true;

    public Player(String name, int score, int bet, int bank){
        this.name = name;
        this.score = 0;
        this.bet = 100;
        //this.hand = new ArrayList<>();
        this.bank = bank;
    }

    //@Override
    public void hit(Card card){
        // Draw one card face up
        // Add card to hand.
        // Add to score
        hand.add(card);
        int value = card.getValue();
        if(value > 10){
            value = 10;
        }
        score += value;
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

        if(amount > bank){
            System.out.println("Not enough chips in bank.");
            return 0;
        }

        bet = amount;
        bank -= bet;

        // Player can choose to add more chips or go "all in".
        System.out.println("Bank: " + bank);
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

    public void reset(){
        //score = 0;
        hand = Collections.emptyList();
        bet = 0;
    }

    public int getScore(){
        return score;
    }

    public int addWinnings(){
        return bank + (bet*2);
    }

    public int getBank(){
        return bank;
    }

    public int getBet(){
        return bet;
    }

}
