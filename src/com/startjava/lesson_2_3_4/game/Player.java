package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countSteps = 0;
    private int[] enteredNumbers = new int[GuessNumber.MAX_COUNT_STEPS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void clearNumbers() {
        Arrays.fill(enteredNumbers, 0, countSteps, 0);
    }
    
    public void setNumber(int number, int step) {
        enteredNumbers[step - 1] = number;
        countSteps++;
    }
    
    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, countSteps);
    }
}