package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void sumNumbers() {
        String expected = "10 + 7 = 17.";
        String actual = out.sumNumbers(10, 7);
        assertEquals(expected, actual);
    }

    @Test
    void sumNumbers2() {
        assertThrows(IllegalArgumentException.class, () -> out.sumNumbers(10, null));
    }

    @Test
    void minNumbers() {
        String expected = "10 - 7 = 3.";
        String actual = out.minNumbers(10, 7);
        assertEquals(expected, actual);
    }

    @Test
    void minNumbers2() {
        assertThrows(IllegalArgumentException.class, () -> out.minNumbers(10, null));
    }


    @Test
    void multiNumbers() {
        String expected = "10 * 7 = 70.";
        String actual = out.multiNumbers(10, 7);
        assertEquals(expected, actual);
    }

    @Test
    void multiNumbers2() {
        assertThrows(IllegalArgumentException.class, () -> out.multiNumbers(10, null));
    }

    @Test
    void divideNumbers() {
        String expected = "70 / 7 = 10.";
        String actual = out.divideNumbers(70, 7);
        assertEquals(expected, actual);
    }

    @Test
    void divideNumbers2() {
        assertThrows(IllegalArgumentException.class, () -> out.divideNumbers(70, null));
    }

    @Test
    void divideNumbers3() {
        assertThrows(ArithmeticException.class, () -> out.divideNumbers(70, 0));
    }
}