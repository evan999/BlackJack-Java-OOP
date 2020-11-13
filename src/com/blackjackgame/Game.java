package com.blackjackgame;

import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
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
        while(!playerBust){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an action: hit or stand");
            String action = scanner.nextLine();
            if(action == "hit"){
                //player.hit();
            }
            else if(action == "stand") {
                player.stand();
            }
        }
    }

    public void gameOver(){
        if(playerBust) {
            // Player loses! Dealer wins!
            System.out.println("Bust! Dealer wins!");
            dealerWin = true;
            // Game ends
            System.exit(0);
        }
    }

    public void push(){
        // If player and dealer both hit 21 or tie
    }

    public void compareHands(){
        // Compare player hand total with dealer's once both stand.
    }
}
