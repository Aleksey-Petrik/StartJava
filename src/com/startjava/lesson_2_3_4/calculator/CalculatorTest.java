package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String question = "yes";
        do {
            if ("yes".equals(question)) {
                System.out.print("Введите математическое выражение: ");
                String[] strMath = scanner.nextLine().split(" ");

                int a = Integer.parseInt(strMath[0]);
                int b = Integer.parseInt(strMath[2]);
                char action = strMath[1].charAt(0);
                
                System.out.println(a + " " + action + " " + b + " = " + calculator.calculate(a, b, action));
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]:");
        } while (!"no".equals(question = scanner.nextLine()));
    }
}