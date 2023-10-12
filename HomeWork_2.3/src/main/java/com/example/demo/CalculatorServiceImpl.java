package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public void checkParam(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Какой-то параметр не передан");
        }
    }

    @Override
    public String sumNumbers(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return String.format("%d + %d = %d.", num1, num2, num1 + num2);
    }

    @Override
    public String minNumbers(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return String.format("%d - %d = %d.", num1, num2, num1 - num2);
    }

    @Override
    public String multiNumbers(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return String.format("%d * %d = %d.", num1, num2, num1 * num2);
    }

    @Override
    public String divideNumbers(Integer num1, Integer num2) {
        checkParam(num1, num2);
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return String.format("%d / %d = %d.", num1, num2, num1 / num2);
    }
}
