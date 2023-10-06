package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class to test the Calculator class")
class CalculatorTest {


	private Calculator calc;
	@BeforeEach
	void calcInit() {
		calc = new Calculator();
		calc.numbers = new Vector<>();
	}

	@Test
	@DisplayName("Checks the size of the number's vector")
	void addSize() {
		calc.add(1);
		calc.add(2);
		calc.add(3);
		assertEquals(3,calc.numbers.size());
	}
	@Test
	@DisplayName("Checks the content of the number's vector")
	void addContent() {
		calc.add(1);
		calc.add(2);
		calc.add(3);
		assertArrayEquals(new Double[] {1.0,2.0,3.0},calc.numbers.toArray());
	}
	@Test
	@DisplayName("Checks that the last number is removed")
	void remove() {
		calc.add(1);
		calc.add(2);
		calc.add(3);
		calc.remove(2);
		assertArrayEquals(new Double[] {1.0,3.0},calc.numbers.toArray());
	}
	@Test
	@DisplayName("Checks that an exception is thrown if a non existent number is removed")
	void removeEmpty() {
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> calc.remove(4));
	}

	@Test
	@DisplayName("Checks That an exception is thrown if the calculator is empty when using max")
	void maxEmpty() {
		assertThrows(Throwable.class , () -> calc.max());
	}

	@Test
	@DisplayName("Checks max function when both numbers are the same")
	void maxEquals() {
		calc.add(1);
		calc.add(2);
		calc.add(2);
		assertEquals(2,calc.max());
	}
	@Test
	@DisplayName("Checks max function when both numbers are not the same")
	void maxDifferent() {
		calc.add(1);
		calc.add(3);
		calc.add(2);
		assertEquals(3,calc.max());
	}
	@Test
	@DisplayName("Checks max function when some numbers are negative")
	void maxNegative() {
		calc.add(1);
		calc.add(-3);
		calc.add(2);
		assertEquals(2,calc.max());
	}

	@Test
	@DisplayName("Checks That an exception is thrown if the calculator is empty when using min")
	void minEmpty() {
		assertThrows(Throwable.class , () -> calc.min());
	}

	@Test
	@DisplayName("Checks min function when both numbers are the same")
	void minEquals() {
		calc.add(1);
		calc.add(1);
		calc.add(2);
		assertEquals(1,calc.min());
	}
	@Test
	@DisplayName("Checks min function when both numbers are not the same")
	void minDifferent() {
		calc.add(0);
		calc.add(3);
		calc.add(2);
		assertEquals(0,calc.min());
	}
	@Test
	@DisplayName("Checks min function when some numbers are negative")
	void minNegative() {
		calc.add(1);
		calc.add(-3);
		calc.add(2);
		assertEquals(-3,calc.min());
	}

	@Test
	@DisplayName("Checks That an exception is thrown if the calculator is empty when using Average")
	void averageEmpty() {
		assertThrows(Throwable.class , () -> calc.average());
	}

	@Test
	@DisplayName("Checks Average function with normal numbers")
	void average() {
		calc.add(4);
		calc.add(3);
		calc.add(2);
		assertEquals(3,calc.average());
	}

	@Test
	@DisplayName("Checks Average function when some numbers are negative")
	void averageNegative() {
		calc.add(12);
		calc.add(-3);
		calc.add(6);
		assertEquals(5,calc.average());
	}


	@Test
	@DisplayName("Checks that stddev gives error if less than 2 values are given")
	void standardDeviationMinimum() {
		calc.add(1);
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> calc.stddev());
	}

	@Test
	@DisplayName("Checks that stddev gives the correct value with normal numbers")
	void standardDeviation() {
		calc.add(1);
		calc.add(23);
		calc.add(23);
		calc.add(16);
		calc.add(23);
		calc.add(21);
		calc.add(16);
		assertEquals(63.285714285714,calc.stddev(),0.0001);
	}


	@Test
	@DisplayName("Checks that stddev gives the correct value even with negative numbers")
	void standardDeviationNegative() {
		calc.add(1);
		calc.add(-23);
		calc.add(23);
		calc.add(16);
		calc.add(23);
		calc.add(21);
		calc.add(16);
		assertEquals(282.33333333333,calc.stddev(),0.0001);
	}


}
