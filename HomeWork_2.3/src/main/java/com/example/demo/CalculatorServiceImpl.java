package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int num1(int num1) {
        return num1;
    }

    @Override
    public int num2(int num2) {
        return num2 ;
    }

    @Override
    public int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minNumbers(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiNumbers(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
}
