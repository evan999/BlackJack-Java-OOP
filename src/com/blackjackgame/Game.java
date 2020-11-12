package com.blackjackgame;

import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private boolean win = false;
    private boolean turnEnd = false;
    private boolean bust = false;

    public Game(){
        //dealer = new Dealer();
        //player = new Player();
    }


    public void startGame(){
        System.out.println("Welcome to Blackjack! Press any key to start a new game.");
    }

    public void gameRound(){
        while(!bust){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an action: hit or stand");
            String action = scanner.nextLine();
            if(action == "hit"){
                player.hit(new Card());
            }
            else if(action == "stand"){
                player.stand();
            }
        }
    }

    public void push(){
        // If player and dealer both hit 21 or tie
    }
}
