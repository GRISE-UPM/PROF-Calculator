package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;
	@BeforeEach
	void init() {
		 c=new Calculator();	
	}
	
	@Test
	void testAdd() {
		c.add(1);
		assertEquals(1,c.min());
	}
	@Test
	void testRemove() {
		c.add(1);
		c.add(3);
		c.remove(1);
		assertEquals(3,c.min());
	}
	@Test
	void testMax() {
		c.add(1);
		c.add(3);
		assertEquals(3,c.max());
	}
	@Test
	void testMin() {
		c.add(1);
		c.add(3);
		assertEquals(1,c.min());
	}
	@Test
	void testAvg() {
		c.add(1);
		c.add(3);
		assertEquals(2,c.average());
	}
	@Test
	void testStdDev() {
		c.add(1);
		c.add(2);
		assertEquals(0.5,c.stddev());
	}
}
