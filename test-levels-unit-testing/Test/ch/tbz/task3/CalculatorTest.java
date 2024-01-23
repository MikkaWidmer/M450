package ch.tbz.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(7, Calculator.add(4, 3));
    }

    @Test
    void subtract() {
        assertEquals(4, Calculator.subtract(6, 2));
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