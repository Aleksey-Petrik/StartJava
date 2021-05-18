package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_COUNT_ATTEMPTS = 10;

    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();

        System.out.println("\n*** Игра началась!!! ***");
        System.out.println("\n*** У каждого игрока по " + MAX_COUNT_ATTEMPTS + " попыток ***");

        generateSecretNumber();
        boolean isWin = false;
        Player currentPlayer = firstPlayer;
        while (currentPlayer.getCountAttempts() != MAX_COUNT_ATTEMPTS && !isWin) {
            System.out.print("Число вводит игрок с именем " + currentPlayer.getName() + ": ");
            int playerNumber = enterNumber(currentPlayer);
            
            if (playerNumber != secretNumber) {
                String moreLess = playerNumber > secretNumber ? "больше" : "меньше";
                System.out.println("Данное число " + moreLess + " того, что загадал компьютер!");

                currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;//следующий игрок
            } else {
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + 
                        playerNumber + " с " + currentPlayer.getCountAttempts() + " попытки\n");
                isWin = true;
            }
        }
        
        if (currentPlayer.getCountAttempts() == MAX_COUNT_ATTEMPTS && !isWin) System.out.println("\nУ игрока " + currentPlayer.getName() + " закончились попытки\n");
        
        System.out.print("Игрок " + firstPlayer.getName() + " назвал числа: " );
        printNumbers(firstPlayer);
        System.out.print("\nИгрок " + secondPlayer.getName() + " назвал числа: ");
        printNumbers(secondPlayer);
    }

    private int enterNumber(Player player) {
        int number = new Scanner(System.in).nextInt();
        player.setNumbers(number);
        return number;
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("\nКомпьютер загадал число." + "  //Для теста комп загадал число - " + secretNumber);
    }

    private void printNumbers(Player player) {
        for(int number: player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}