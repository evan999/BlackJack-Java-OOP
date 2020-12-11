package com.blackjackgame;

import java.util.List;

public class Table {
    private List<Hand> playerHands;
    private List<Player> players;
    Deck deck;
    Dealer dealer;

    public Table(){

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
