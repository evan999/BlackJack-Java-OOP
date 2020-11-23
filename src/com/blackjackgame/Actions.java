package com.blackjackgame;

public interface Actions {
    // Implemented by Dealer and Player
    void hit(Deck deck);
    int stand();
    //void addWinnings();
    // void placeBet();
}
