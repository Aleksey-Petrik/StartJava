package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String yesOrNo = "yes";
        do {
            if ("yes".equals(yesOrNo)) {
                System.out.print("Введите математическое выражение: ");
                String strMath = scanner.nextLine();

                System.out.println(strMath + " = " + calculator.calculate(strMath));
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]:");
        } while (!"no".equals(yesOrNo = scanner.nextLine()));
    }
}