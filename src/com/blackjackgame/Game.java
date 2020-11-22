package com.blackjackgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private final static int BLACKJACK = 21;
    //private boolean playerWin = false;
    //private boolean dealerWin = false;
    private boolean turnEnd = false;
    private boolean playerBust = false;
    private boolean dealerBust = false;
    private boolean playerTurn = false;
    private boolean dealerTurn = false;
    //public List<Hand> hands;

    public Game(){
        //dealer = new Dealer();
        //player = new Player();
    }


    public void startGame(){
        System.out.println("Welcome to Blackjack! Press any key to start a new game.");
        String choice = Console.getPlayerChoice();
        if(choice == "Y" && player.getBank() > 0){
            deal();
        }
        else{
            System.out.println("Come back again soon!");
            System.exit(0);
        }
    }

    public void deal(){
        int score;
        if(player.getBank() == 0){
            System.out.println("Sorry, you need a bet of at least 100 to start a new game");
            System.exit(0);
        }

        player.placeBet(Console.getPlayerBet());


        while(playerTurn){
            // While not player bust or dealer bust
            String action = Console.getPlayerChoice();

            if(action == "hit"){
                //player.hit();
                //player.hit();
                player.getScore();
            }
            else if(action == "stand") {
                player.stand();
                playerTurn = false;
                dealerTurn = true;
                break;
            }

            if(player.getScore() > BLACKJACK){
                System.out.println("PLAYER BUST! Player loses bet of " + player.getBet());
            }

            if(player.getScore() == BLACKJACK){
                player.addWinnings();
            }

        }

        while(dealerTurn && dealer.getScore() < 17) {
            //String action = Console.getPlayerChoice();

            //dealer.hit();
            dealer.getScore();
        }

        if(dealer.getScore() > BLACKJACK){
            System.out.println("DEALER BUSTS! Player wins " + player.addWinnings());
        }

        if(dealer.getScore() == BLACKJACK){
            // player loses bet
        }

        dealer.stand();
        dealerTurn = false;

        compareHands();
        startGame();
        //deal();

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
            System.out.println("Dealer wins! Player loses bet!");
        }
        else{
            push();
        }
    }
}
