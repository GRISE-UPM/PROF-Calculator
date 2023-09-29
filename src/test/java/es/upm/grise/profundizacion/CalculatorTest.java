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
		assertEquals(testCalculator.max(), not_magic_number);
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
	void maxTestsRem() {
		double not_magic_number = 8;
		testCalculator.remove(10);
		assertEquals(testCalculator.max(), not_magic_number);
	}

	@Test
	void minTestsRem() {
		double not_magic_number = 8;
		testCalculator.remove(0);
		testCalculator.remove(2);
		testCalculator.remove(5);
		assertEquals(testCalculator.min(), not_magic_number);
	}

	@Test
	void avgTestsRem() {
		double not_magic_number = 5.75;
		testCalculator.remove(2);
		assertEquals(testCalculator.average(), not_magic_number);
	}

	@Test
	void stddevTestsRem() {
		double not_magic_number = 12.25;
		testCalculator.remove(0);
		assertEquals(testCalculator.stddev(), not_magic_number);
	}
}
