package org.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    void testAdd() {
        assertEquals(9.0f, calculator.add(5.0f, 4.0f));
    }


    @Test
    void testSubtract() {
        assertEquals(-2.0f, calculator.subtract(2.0f, 4.0f));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0f, calculator.multiply(2.0f, 3.0f));
    }

    @Test
    void testDivide() {
        assertEquals(0.75f, calculator.divide(3.0f, 4.0f));
        assertThrows(ArithmeticException.class, ()-> calculator.divide(2.0f, 0));
    }
}