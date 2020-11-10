package com.blackjackgame;

import java.util.Scanner;

public class Rigged implements DeckInterface {

    @Override
    public void shuffle(){
        return;
    }

    @Override
    public Card drawCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card value: 1 - 13");
        int faceValue = scanner.nextInt();
        System.out.println("Card suit 1-4");
        String suit = scanner.nextLine();
        return new Card(faceValue, suit);
    }
}
