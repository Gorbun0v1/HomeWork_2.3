package com.example.demo;

public class Calculator {
    private int num1;
    private int num2;
    private int sumNumbers;
    private int minNumbers;
    private int multiNumbers;
    private int divideNumbers;

    public Calculator(int num1, int num2, int sumNumbers, int minNumbers, int multiNumbers, int divideNumbers) {
        this.num1 = num1;
        this.num2 = num2;
        this.sumNumbers = sumNumbers;
        this.minNumbers = minNumbers;
        this.multiNumbers = multiNumbers;
        this.divideNumbers = divideNumbers;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getSumNumbers() {
        return sumNumbers;
    }

    public int getMinNumbers() {
        return minNumbers;
    }

    public int getMultiNumbers() {
        return multiNumbers;
    }

    public int getDivideNumbers() {return divideNumbers;}
}
