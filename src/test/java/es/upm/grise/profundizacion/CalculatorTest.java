package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator;
	final int lowest = 1, middle = 2, highest = 3;  // elements of the vector

	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
		calculator.numbers = new Vector<Double>();
		calculator.add(lowest);
		calculator.add(middle);
		calculator.add(highest);
	}

	@Test
	public void testAdd() {
		final int aditional = 4;
		calculator.add(aditional);
		assertEquals(aditional, calculator.numbers.get(calculator.numbers.size() - 1));
	}

	@Test
	public void testRemove() {
		calculator.remove(middle);
		assertEquals(middle, calculator.numbers.size());
	}

	@Test
	public void testMax() {
		assertEquals(highest, calculator.max());
	}

	@Test
	public void testMin() {
		assertEquals(lowest, calculator.min());
	}

	@Test
	public void testAverage() {
		assertEquals(middle, calculator.average());
	}

	@Test
	public void testStddev() {
		assertEquals(lowest, calculator.stddev());
	}

}
