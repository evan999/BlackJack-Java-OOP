package com.blackjackgame;

public class Card {
    private int faceValue;
    private String suit;
    //static Rank rank;

    public Card(int faceValue, String suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String toString(){
        String output = "";
        switch(faceValue){
            case 1:
                output = "ACE";
            case 2:
                output = "TWO";
            case 11:
                output = "JACK";
            case 12:
                output = "QUEEN";
            case 13:
                output = "KING";
                break;
            default:
                output = faceValue == 10 ? Integer.toString(faceValue) : " " + faceValue;
        }

        return output;
    }

    /*
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    //final Rank rank;

    public Card(int faceValue){
        this.faceValue = faceValue;
    }

     */


    public int getValue(){
        return faceValue;
    }


}
