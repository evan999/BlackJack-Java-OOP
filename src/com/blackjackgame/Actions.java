package com.blackjackgame;

public interface Actions {
    // Implemented by Dealer and Player
    void hit(Card card);
    int stand();
    //void addWinnings();
    // void placeBet();
}
