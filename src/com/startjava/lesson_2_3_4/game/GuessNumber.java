package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_COUNT_STEPS = 3;

    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        generateSecretNumber();
        
        firstPlayer.clrSteps();
        secondPlayer.clrSteps();
        
        Player currentPlayer = firstPlayer;
        
        System.out.println("\n*** Игра началась!!! ***");
        System.out.println("\n*** У каждого игрока по " + MAX_COUNT_STEPS + " попыток ***");
        
        int i = 0;
        int gameStep = 1;
        while (gameStep <= MAX_COUNT_STEPS) {
            System.out.print("Число вводит игрок с именем " + currentPlayer.getName() + ": ");
            int playerNumber = scanner.nextInt();
            
            currentPlayer.saveStep(playerNumber, gameStep);
            
            if (playerNumber != secretNumber) {
                if (playerNumber > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер!");
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер!");
                }       
                //следующий игрок
                currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;
            } else {
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + 
                        playerNumber + " с " + gameStep + " попытки\n");
                currentPlayer.setCountWins(true);
                break;
            }
            gameStep = currentStep(++i, gameStep);
        }
        
        if (gameStep > MAX_COUNT_STEPS) System.out.println("\nУ игрока " + currentPlayer.getName() + " закончились попытки\n");
        
        System.out.println("Игрок " + firstPlayer.getName() + " назвал числа: " + Arrays.toString(firstPlayer.shoAllSteps()));
        System.out.println("Игрок " + secondPlayer.getName() + " назвал числа: " + Arrays.toString(secondPlayer.shoAllSteps()));
    }

    private int currentStep(int counter, int step) {
        step = counter % 2 == 0 ? ++step : step;
        return step;
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число." + "  //Для теста комп загадал число - " + secretNumber);
    }
}