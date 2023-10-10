package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testMax() {
        Calculator calculator = new Calculator();
        calculator.add(10.0);
        calculator.add(20.0);
        assertEquals(20.0, calculator.max(), 0.001);
    }

    @Test
    public void testMin() {
        Calculator calculator = new Calculator();
        calculator.add(10.0);
        calculator.add(20.0);
        assertEquals(10.0, calculator.min(), 0.001);
    }

    @Test
    public void testAverage() {
        Calculator calculator = new Calculator();
        calculator.add(10.0);
        calculator.add(20.0);
        assertEquals(15.0, calculator.average(), 0.001);
    }

    @Test
    public void testStdDev() {
        Calculator calculator = new Calculator();
        calculator.add(10.0);
        calculator.add(20.0);
        assertEquals(5.0, calculator.stddev(), 0.001);
    }

}

