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
	}
	@Nested
    // These tests check how the system reacts when doing operations on an empty calculator
	class EmptyTests {
		@Test
		@DisplayName("Checks That an exception is thrown if the calculator is empty when using Average")
		void averageEmpty() {
			assertThrows(Throwable.class , () -> calc.average(),"No exception was thrown with an empty calculator in average");
		}
		@Test
		@DisplayName("Checks That an exception is thrown if the calculator is empty when using max")
		void maxEmpty() {
			assertThrows(Throwable.class , () -> calc.max(), "No exception was thrown with an empty calculator in max");
		}
		@Test
		@DisplayName("Checks that an exception is thrown if a non existent number is removed")
		void removeEmpty() {
			assertThrows(Throwable.class,() -> calc.remove(4), "No exception was thrown with an empty calculator in remove");
		}
		@Test
		@DisplayName("Checks That an exception is thrown if the calculator is empty when using min")
		void minEmpty() {
			assertThrows(Throwable.class , () -> calc.min(),"No error was given when using min");
		}

		@Test
		@DisplayName("Checks that stddev gives error if less than 2 values are given")
		void standardDeviationMinimum() {
			calc.add(1);
			assertThrows(ArrayIndexOutOfBoundsException.class,() -> calc.stddev(),"No exception was thrown when using less than 2 values");
		}
	}
	@Nested
	class test {
		@BeforeEach
		void valuesInit() {
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
			assertEquals(MAX,calc.max());
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
	}










//	@Nested
//	class loadingTests {
//		@BeforeEach
//		void loadingInit() {
//			calc.add(1);
//			calc.add(2);
//			calc.add(3);
//		}
//		@Test
//		@DisplayName("Checks the size of the number's vector")
//		void addSize() {
//			final int SIZE = 3;
//			assertEquals(SIZE,calc.numbers.size(),"Incorrect amount of numbers inside calculator");
//		}
//		@Test
//		@DisplayName("Checks the content of the number's vector")
//		void addContent() {
//			assertArrayEquals(new Double[] {1.0,2.0,3.0},calc.numbers.toArray(), "Numbers were added incorrectly to the calculator");
//		}
//		@Test
//		@DisplayName("Checks that the last number is removed")
//		void remove() {
//			calc.remove(2);
//			assertArrayEquals(new Double[] {1.0,3.0},calc.numbers.toArray(), "Unable to properly remove number");
//		}
//	}

}
