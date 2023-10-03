package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        calculator.add(10.0);
        calculator.add(20.0);
        
        Vector<Double> expectedNumbers = new Vector<>();
        expectedNumbers.add(10.0);
        expectedNumbers.add(20.0);
        
        assertEquals(expectedNumbers, calculator.numbers);
    }

    @Test
    public void testRemove() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.add(30.0);

        // Remove 20.0
        calculator.remove(20.0);

        Vector<Double> expectedNumbers = new Vector<>();
        expectedNumbers.add(10.0);
        expectedNumbers.add(30.0);

        assertEquals(expectedNumbers, calculator.numbers);
    }

    @Test
    public void testMax() {
        calculator.add(10.0);
        calculator.add(5.0);
        calculator.add(20.0);

        double max = calculator.max();

        assertEquals(20.0, max, 0.001);
    }

    @Test
    public void testMin() {
        calculator.add(10.0);
        calculator.add(5.0);
        calculator.add(20.0);

        double min = calculator.min();

        assertEquals(5.0, min, 0.001);
    }

    @Test
    public void testAverage() {
        calculator.add(10.0);
        calculator.add(5.0);
        calculator.add(20.0);

        double average = calculator.average();

        assertEquals(11.666, average, 0.001);
    }

    @Test
    public void testStddev() {
        calculator.add(10.0);
        calculator.add(5.0);
        calculator.add(20.0);

        double stddev = calculator.stddev();

        assertEquals(7.637, stddev, 0.001);
    }
}
