package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Nested
	class BasicOperationTests{
		Calculator testCalculator;
		@BeforeEach
		void makeCalcu(){
			testCalculator = new Calculator();
			testCalculator.numbers = new Vector<Double>();
			testCalculator.add(0);
			testCalculator.add(10);
			testCalculator.add(2);
			testCalculator.add(8);
			testCalculator.add(5);
		}

		@Test
		void maxTests() {
			double not_magic_number = 10;
			//Fails when the minimum is not the highest number in the calculator
			assertEquals(testCalculator.max(), not_magic_number, "Testing max() method");
		}

		@Test
		void minTests() {
			double not_magic_number = 0;
			//Fails when the minimum is not the lowest number in the calculator
			assertEquals(testCalculator.min(), not_magic_number, "Testing min() method");
		}

		@Test
		void avgTests() {
			double not_magic_number = 5;
			//Fails when the average is off
			assertEquals(testCalculator.average(), not_magic_number, "Testing avg() method");
		}

		@Test
		void stddevTests() {
			double not_magic_number = 17;
			//Fails when the standard deviation is off
			assertEquals(testCalculator.stddev(), not_magic_number, "Testing stddev() method");
			
		}

		@Test
		void remTest() {
			double not_magic_number = 4;
			testCalculator.remove(0);
			//Fails when the '0' did not get removed successfully
			assertEquals(testCalculator.numbers.size(), not_magic_number, "Testing remove() method");
		}
	}
}
