package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String question = "yes";
        do {
            if ("yes".equals(question)) {
                System.out.print("\nВведите первое число: ");
                int a = scanner.nextInt();
                
                System.out.print("Введите знак математической операции: ");
                char action = scanner.next().charAt(0);
                
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();
                
                System.out.println(a + " " + action + " " + b + " = " + calculator.calculate(a, b, action));
                question = "";
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]:");
        } while (!"no".equals(question = scanner.next()));
    }
}



