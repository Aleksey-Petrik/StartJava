package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(int a, int b, char action) {
        double result = 0;
        switch(action) {
            case '+' : result = Math.addExact(a, b); break;
            case '-' : result = Math.subtractExact(a, b); break;
            case '*' : result = Math.multiplyExact(a, b); break;
            case '/' : result = (double) a / b; break;
            case '%' : result = a % b; break;
            case '^' : result = Math.pow(a, b); break;
        }
        return result;
    }
}