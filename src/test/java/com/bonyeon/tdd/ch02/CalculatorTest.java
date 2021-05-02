package com.bonyeon.tdd.ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
    }

    @Test
    void plus1() {
        int sum = Calculator.plus(1, 2);
        assertEquals(3, sum);
        assertEquals(5, Calculator.plus(4, 1));
    }
}
