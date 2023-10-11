package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;
import org.junit.jupiter.api.*;

@DisplayName("Class to test the Calculator class")
class CalculatorTest {


	private Calculator calc;
	@BeforeEach
	void calcInit() {
		calc = new Calculator();
		calc.numbers = new Vector<>();
		calc.add(1);
		calc.add(-23);
		calc.add(23);
		calc.add(16);
		calc.add(23);
		calc.add(21);
		calc.add(16);
	}

	@Test
	@DisplayName("Checks max function when some numbers are negative")
	void maxNegative() {
		final int MAX = 23;
		assertEquals(MAX,calc.max(),"Calculated incorrect max when using negative numbers");
	}

	@Test
	@DisplayName("Checks min function when some numbers are negative")
	void minNegative() {
		final int MIN = -23;

		assertEquals(MIN,calc.min(), "Calculated incorrect min when using negative numbers");
	}

	@Test
	@DisplayName("Checks Average function when some numbers are negative")
	void averageNegative() {
		final int AVERAGE = 11;
		assertEquals(AVERAGE,calc.average(),"Calculated Average is incorrect when using negatives");
	}
	@Test
	@DisplayName("Checks that stddev gives the correct value even with negative numbers")
	void standardDeviationNegative() {
		final double DEVIATION = 282.33333333333;
		final double DELTA = 0.0001;
		assertEquals(DEVIATION,calc.stddev(),DELTA, "Calculated deviation is incorrect when using negatives");
	}

	@Test
	@DisplayName("Checks the size of the number's vector")
	void addSize() {
		final int SIZE = 7;
		assertEquals(SIZE,calc.numbers.size(),"TEST");
	}
	@Test
	@DisplayName("Checks the content of the number's vector")
	void addContent() {
		assertArrayEquals(new Double[] {1.0, -23.0, 23.0, 16.0, 23.0, 21.0, 16.0},calc.numbers.toArray(), "Numbers were added incorrectly to the calculator");
	}
	@Test
	@DisplayName("Checks that the last number is removed")
	void remove() {
		calc.remove(-23);
		assertArrayEquals(new Double[] {1.0, 23.0, 16.0, 23.0, 21.0, 16.0},calc.numbers.toArray(), "Unable to properly remove number");
	}


}
