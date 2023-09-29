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
		assertEquals(testCalculator.max(), 10);
	}

	@Test
	void minTests() {
		assertEquals(testCalculator.min(), 0);
	}

	@Test
	void avgTests() {
		assertEquals(testCalculator.average(), 5);
	}

	@Test
	void stddevTests() {
		assertEquals(testCalculator.stddev(), 17);
	}

	@Test
	void maxTestsRem() {
		testCalculator.remove(10);
		assertEquals(testCalculator.max(), 8);
	}

	@Test
	void minTestsRem() {
		testCalculator.remove(0);
		testCalculator.remove(2);
		testCalculator.remove(5);
		assertEquals(testCalculator.min(), 8);
	}

	@Test
	void avgTestsRem() {
		testCalculator.remove(2);
		assertEquals(testCalculator.average(), 5.75);
	}

	@Test
	void stddevTestsRem() {
		testCalculator.remove(0);
		assertEquals(testCalculator.stddev(), 12.25);
	}
}
