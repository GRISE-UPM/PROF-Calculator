package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator(); 
        calculator.numbers = new Vector<>(); 
    }

    @Test
    void testAdd() {
        calculator.add(5.0);
        calculator.add(10.0);
        assertEquals(2, calculator.numbers.size());
    }

    @Test
    void testRemove() {
        calculator.add(5.0);
        calculator.add(10.0);
        calculator.remove(5.0);
        assertEquals(1, calculator.numbers.size());
        assertFalse(calculator.numbers.contains(5.0));
    }

    @Test
    void testMax() {
        calculator.add(5.0);
        calculator.add(10.0);
        calculator.add(8.0);
        assertEquals(10.0, calculator.max(), 0.01); 
    }

    @Test
    void testMin() {
        calculator.add(5.0);
        calculator.add(10.0);
        calculator.add(8.0);
        assertEquals(5.0, calculator.min(), 0.01);
    }

    @Test
    void testAverage() {
        calculator.add(5.0);
        calculator.add(10.0);
        calculator.add(8.0);
        assertEquals(7.67, calculator.average(), 0.01); 
    }

}
