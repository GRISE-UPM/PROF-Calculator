package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Vector;



public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        calculator.numbers=new Vector <Double> ();
    }

    @Test
    public void testAdd() {
        calculator.add(10.0);
        calculator.add(20.0);
        assertEquals(2, calculator.numbers.size());
    }

    @Test
    public void testRemove() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.remove(10.0);
        assertEquals(1, calculator.numbers.size());
    }

    @Test
    public void testMax() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.add(5.0);
        assertEquals(20.0, calculator.max(), 0.001);
    }

    @Test
    public void testMin() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.add(5.0);
        assertEquals(5.0, calculator.min(), 0.001);
    }

    @Test
    public void testAverage() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.add(30.0);
        assertEquals(20.0, calculator.average(), 0.001);
    }

    @Test
    public void testStddev() {
        calculator.add(10.0);
        calculator.add(20.0);
        calculator.add(30.0);
        assertEquals(100.0, calculator.stddev(), 0.001);
    }
}