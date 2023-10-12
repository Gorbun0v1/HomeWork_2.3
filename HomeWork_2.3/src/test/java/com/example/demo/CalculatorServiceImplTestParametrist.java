package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTestParametrist {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> testParamPlus() {
        return Stream.of(
                Arguments.of(10, 7, "10 + 7 = 17."),
                Arguments.of(21, 5, "21 + 5 = 26."),
                Arguments.of(30, 5, "30 + 5 = 35."),
                Arguments.of(40, 5, "40 + 5 = 45.")
        );
    }

    public static Stream<Arguments> testParamMinus() {
        return Stream.of(
                Arguments.of(10, 7, "10 - 7 = 3."),
                Arguments.of(21, 5, "21 - 5 = 16."),
                Arguments.of(30, 5, "30 - 5 = 25."),
                Arguments.of(40, 5, "40 - 5 = 35.")
        );
    }

    public static Stream<Arguments> testParamMulti() {
        return Stream.of(
                Arguments.of(10, 7, "10 * 7 = 70."),
                Arguments.of(21, 5, "21 * 5 = 105."),
                Arguments.of(30, 5, "30 * 5 = 150."),
                Arguments.of(40, 5, "40 * 5 = 200.")
        );
    }

    public static Stream<Arguments> testParamDivide() {
        return Stream.of(
                Arguments.of(84, 7, "84 / 7 = 12."),
                Arguments.of(20, 5, "20 / 5 = 4."),
                Arguments.of(30, 5, "30 / 5 = 6."),
                Arguments.of(40, 5, "40 / 5 = 8.")
        );
    }

    @ParameterizedTest
    @MethodSource("testParamPlus")
    void sumNumbers(Integer num1, Integer num2, String expectedLine) {
        String actual = out.sumNumbers(num1, num2);
        assertEquals(expectedLine, actual);
    }

    @ParameterizedTest
    @MethodSource("testParamMinus")
    void minNumbers(Integer num1, Integer num2, String expectedLine) {
        String actual = out.minNumbers(num1, num2);
        assertEquals(expectedLine, actual);
    }

    @ParameterizedTest
    @MethodSource("testParamMulti")
    void multiNumbers(Integer num1, Integer num2, String expectedLine) {
        String actual = out.multiNumbers(num1, num2);
        assertEquals(expectedLine, actual);
    }

    @ParameterizedTest
    @MethodSource("testParamDivide")
    void divideNumbers(Integer num1, Integer num2, String expectedLine) {
        String actual = out.divideNumbers(num1, num2);
        assertEquals(expectedLine, actual);
    }
}