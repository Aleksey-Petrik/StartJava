package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countSteps = 0;
    private int[] stepsArr = new int[GuessNumber.MAX_COUNT_STEPS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void clrSteps() {
        Arrays.fill(stepsArr, 0, countSteps, 0);
    }
    
    public void saveStep(int number, int step) {
        stepsArr[step - 1] = number;
        countSteps = step;
    }
    
    public int[] shoAllSteps() {
        return Arrays.copyOf(stepsArr, countSteps);
    }
}