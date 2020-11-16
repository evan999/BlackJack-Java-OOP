package com.blackjackgame;

import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private final static int BLACKJACK = 21;
    private boolean playerWin = false;
    private boolean dealerWin = false;
    //private boolean turnEnd = false;
    private boolean playerBust = false;
    private boolean dealerBust = false;

    public Game(){
        //dealer = new Dealer();
        //player = new Player();
    }


    public void startGame(){
        System.out.println("Welcome to Blackjack! Press any key to start a new game.");
    }

    public void deal(){
        int score;

        if(player.getBank() == 0){
            System.out.println("Sorry, you need a bet of at least 100 to start a new game");
            System.exit(0);
        }

        while(!(playerBust || dealerBust)){

            String action = Console.getPlayerChoice();

            if(action == "hit"){
                //player.hit();
                player.hit(Card card);
                player.getScore();
            }
            else if(action == "stand") {
                player.stand();
                break;
            }

            if(player.getScore() > BLACKJACK){
                System.out.println("PLAYER BUST! Player loses bet of " + player.getBet());
            }
            else if(dealer.getScore() > BLACKJACK){
                System.out.println("DEALER BUSTS! Player wins " + player.addWinnings());
            }
        }
    }

    public void gameOver(){
        if(playerBust) {
            // Player loses! Dealer wins!
            System.out.println("Bust! Dealer wins!");
            dealerWin = true;
            // Game ends
        }
    }

    public int push(){
        // If player and dealer tie hands (and do not bust), return player's bet
        return player.getBank() + player.getBet();
    }

    public boolean blackJack(){
        if(player.getScore() == BLACKJACK){
            return true;
        }

        return false;
    }

    public void compareHands(){
        // Compare player hand total with dealer's once both stand.
        int playerScore = player.getScore();
        int dealerScore = dealer.getScore();

        if(playerScore > dealerScore){
            player.addWinnings();
        }
        else if(dealerScore > playerScore){
            // Player loses bet

        }
    }
}
