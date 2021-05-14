package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
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
        Player currentPlayer = firstPlayer;
        while (true) {
            System.out.print("Число вводит игрок с именем " + currentPlayer.getName() + ": ");
            int playerNumber = scanner.nextInt();

            if (playerNumber != secretNumber) {
                if (playerNumber > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер!");
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер!");
                }       
                //следующий игрок
                currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;
            } else {
                System.out.println("\n*** ПОБЕДИЛ игрок под именем - " + currentPlayer.getName() + " ***\n");
                break;
            }
        }
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число." + "  //Для теста комп загадал число - " + secretNumber);
    }
}