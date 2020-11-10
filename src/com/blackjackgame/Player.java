package com.blackjackgame;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;
    private int bet;
    private int bank;
    private boolean bust = false;
    private boolean stand = false;

    public Player(String name, int score, int bet, int bank){
        this.name = name;
        this.score = 0;
        this.bet = 100;
        this.bank = bank;
    }

    public Card hit(){
        // Draw one card face up

    }

    public int stand(){
        // End player turn. Score then gets compared to Dealer score.
        int finalScore = score;
        return finalScore;
    }

    private int doubleBet(int bet){
        // Doubles bet and hits once. Turn ends after.
        int doubledBet = bet * 2;
        hit();
        return doubledBet;
    }

    public int placeBet(){
        // Player decides amount of chips they want to bet out of available chips in bank.
        // Initial bet is $100.
        int initialBet = 100;
        Scanner scanner = new Scanner(System.in);



        if(bet > bank){
            System.out.println("Not enough chips in bank");
        }

        bank -= bet;

        // Player can choose to add more chips or go "all in".
    }

    public void allInBet(){
        bet = bank;
        bank = 0;
    }

}
