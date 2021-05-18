package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttempts = 0;
    private int[] playerNumbers = new int[GuessNumber.MAX_COUNT_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setPlayerNumbers(int playerNumber) {
        playerNumbers[countAttempts++] = playerNumber;
    }
    
    public int[] getPlayerNumbers() {
        return Arrays.copyOf(playerNumbers, countAttempts);
    }

    public int getCountAttempts(){
        return countAttempts;
    }

    public void clearNumbers() {
        Arrays.fill(playerNumbers, 0, countAttempts, 0);
        countAttempts = 0;
    }
}