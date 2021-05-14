package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 9, b = 3;
        double result = 0;
        char action = '/';

        if (action == '+') result = a + b; 
        if (action == '-') result = a - b;
        if (action == '*') result = a * b;
        if (action == '/') result = (double) a / b;
        if (action == '%') result = a % b;
        if (action == '^') {
            result = a;
            for (int i = 1; i < b; i++) result *= a;
        }
        System.out.println(a + " " + action + " " + b + " = " + result);
    }
}