package com.blackjackgame;

public class Card {
    private int faceValue;
    private String suit;

    public Card(int faceValue, String suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String toString(){
        String output = "";
        switch(faceValue){
            case 1:
                output = "ACE";
                break;
            case 11:
                output = "JACK";
                break;
            case 12:
                output = "QUEEN";
                break;
            case 13:
                output = "KING";
                break;
            default:
                output = faceValue == 10 ? Integer.toString(faceValue) : " " + faceValue;
        }
        return output + suit;
    }

    public int getValue(){
        return faceValue;
    }

    public String getSuit(){
        return suit;
    }


}
