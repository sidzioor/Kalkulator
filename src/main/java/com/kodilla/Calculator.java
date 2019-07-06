package com.kodilla;

public class Calculator {
    public void adding(int a, int b){
        System.out.println(a+b);
    }
    public void substraction(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.adding(14, 16);
        calculator.substraction(32, 14);
        System.out.println(" .");
    }
}