package ch.tbz.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(5, Calculator.subtract(7, 2));
    }

    @Test
    void multiply() {
        assertEquals(8, Calculator.multiply(4, 2));
    }

    @Test
    void divide() {
        assertEquals(4, Calculator.divide(16, 4));
    }
}