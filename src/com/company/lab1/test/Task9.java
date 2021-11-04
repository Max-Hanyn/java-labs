package com.company.lab1.test;

public class Task9 {
    public static void main(final String[] args) {
        final Calculator calculator = new Calculator();

        System.out.println();
        System.out.println("Select one of four actions: +, -, /, *.");
        System.out.println();
        final char char1 = '/';
        System.out.println("Result: " + calculator.calculate(6.0,7.9,'+'));
        System.out.println();
    }
}

