package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator c;
    static final double VALUE_ONE = 1.0;
    static final double VALUE_TWO = 2.0;
    static final double VALUE_THREE = 3.0;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void testAdd() {
        c.add(VALUE_ONE);
        double res=c.min();
        assertEquals(VALUE_ONE,res );
    }

    @Test
    void testRemove() {
        c.add(VALUE_ONE);
        c.add(VALUE_THREE);
        c.remove(VALUE_ONE);
        double res=c.min();
        assertEquals(VALUE_THREE, res);
    }

    @Test
    void testMax() {
        c.add(VALUE_ONE);
        c.add(VALUE_THREE);
        double res=c.max();
        assertEquals(VALUE_THREE,res);
    }

    @Test
    void testMin() {
        c.add(VALUE_ONE);
        c.add(VALUE_THREE);
        double res=c.min();
        assertEquals(VALUE_ONE, res);
    }

    @Test
    void testAvg() {
        c.add(VALUE_ONE);
        c.add(VALUE_THREE);
        double res=c.average();
        assertEquals(VALUE_TWO,res );
    }

    @Test
	void testStdDev() {
		c.add(VALUE_ONE);
		c.add(VALUE_TWO);
		double res=c.stddev();
		double sol=0.5;
		assertEquals(sol,res);
	}
}
