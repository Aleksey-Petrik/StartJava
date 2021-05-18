package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.next());

        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        
        String yesOrNo = "yes";
        do {
            if ("yes".equals(yesOrNo)) {
                guessNumber.startGame();
            }
            System.out.print("\n\nХотите продолжить игру? [yes/no]:");
        } while (!"no".equals(yesOrNo = scanner.next()));
    }
}