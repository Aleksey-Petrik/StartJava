package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] operands = expression.split(" ");

        int a = Integer.parseInt(operands[0]);
        int b = Integer.parseInt(operands[2]);
        char action = operands[1].charAt(0);

        switch(action) {
            case '+' : return Math.addExact(a, b);
            case '-' : return Math.subtractExact(a, b);
            case '*' : return Math.multiplyExact(a, b);
            case '/' : return (double) a / b;
            case '%' : return a % b;
            case '^' : return Math.pow(a, b);
        }
        return Double.MIN_VALUE;
    }
}