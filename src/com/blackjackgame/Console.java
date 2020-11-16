package com.blackjackgame;

import java.util.List;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void startGame(String context){

    }

    // Display either the player's or dealer's hand.
    static public void displayHand(List<Card> hand){
        for (var card : hand){
            System.out.println(card.toString());
        }
    }

    static public String getPlayerChoice(){
        System.out.println("Deal? Y or N: " );
        String choice = scanner.nextLine();
        return choice;
    }

    static public String getPlayerAction(){
        System.out.println("Enter your action (hit or stand): ");
        String action = scanner.nextLine();
        return action;
    }

    static public int getPlayerBet(){
        System.out.println("Place your bet: ");
        int bet = scanner.nextInt();
        return bet;
    }


}
