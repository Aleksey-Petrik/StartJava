package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_COUNT_STEPS = 10;

    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        generateSecretNumber();
        
        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();
        
        Player currentPlayer = firstPlayer;
        
        System.out.println("\n*** Игра началась!!! ***");
        System.out.println("\n*** У каждого игрока по " + MAX_COUNT_STEPS + " попыток ***");
        
        int counter = 0;
        int gameStep = 1;
        while (gameStep <= MAX_COUNT_STEPS) {
            System.out.print("Число вводит игрок с именем " + currentPlayer.getName() + ": ");
            int playerNumber = enterNumber();
            
            currentPlayer.setNumber(playerNumber, gameStep);
            
            if (playerNumber != secretNumber) {
                String moreLessStr = playerNumber > secretNumber ? "больше" : "меньше";
                System.out.println("Данное число " + moreLessStr  + " того, что загадал компьютер!");

                currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;//следующий игрок
            } else {
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + 
                        playerNumber + " с " + gameStep + " попытки\n");
                break;
            }
            gameStep = currentStep(++counter, gameStep);
        }
        
        if (gameStep > MAX_COUNT_STEPS) System.out.println("\nУ игрока " + currentPlayer.getName() + " закончились попытки\n");
        
        System.out.print("Игрок " + firstPlayer.getName() + " назвал числа: " );
        printNumbers(firstPlayer);
        System.out.print("\nИгрок " + secondPlayer.getName() + " назвал числа: ");
        printNumbers(secondPlayer);
    }

    private int enterNumber() {
        return new Scanner(System.in).nextInt();
    }

    private int currentStep(int counter, int step) {
        step = counter % 2 == 0 ? ++step : step;
        return step;
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("\nКомпьютер загадал число." + "  //Для теста комп загадал число - " + secretNumber);
    }

    private void printNumbers(Player player) {
        for(int number: player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
    }
}