package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String strMath) {
        double result = 0;
        String[] argumentsArr = strMath.split(" ");

        int a = Integer.parseInt(argumentsArr[0]);
        int b = Integer.parseInt(argumentsArr[2]);
        char action = argumentsArr[1].charAt(0);

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