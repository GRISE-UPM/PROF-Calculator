package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
		double test_value = testCalculator.max();
		assertEquals(test_value, not_magic_number);
	}

	@Test
	void minTests() {
		double not_magic_number = 0;
		assertEquals(testCalculator.min(), not_magic_number);
	}

	@Test
	void avgTests() {
		double not_magic_number = 5;
		assertEquals(testCalculator.average(), not_magic_number);
	}

	@Test
	void stddevTests() {
		double not_magic_number = 17;
		assertEquals(testCalculator.stddev(), not_magic_number);
	}

	@Test
	void remTest() {
		double not_magic_number = 4;
		testCalculator.remove(0);
		assertEquals(testCalculator.numbers.size(), not_magic_number);
	}
}
