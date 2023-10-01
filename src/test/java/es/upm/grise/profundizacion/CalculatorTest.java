package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.abort;

import java.security.CodeSigner;
import java.util.Vector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator calculator;

	@BeforeAll
	static void prepareCalc() {
		calculator = new Calculator();
	}

	@BeforeEach
	void setCalc() {
		calculator.add(2);
		calculator.add(3);
		calculator.add(4);
		calculator.add(5);
		calculator.add(6);
	}

	@AfterEach
	void resetCalc() {
		calculator.remove(2);
		calculator.remove(3);
		calculator.remove(4);
		calculator.remove(5);
		calculator.remove(6);
	}

	@Test
	void testMax() {
		assertEquals(6, calculator.max(), "Maximo entre los números guardadoes en la calculadora [2,6] es 3");
	}

	@Test
	void testMin() {
		assertEquals(2, calculator.min(), "Minimo entre entre los números guardadoes en la calculadora [2,6] es 2");
	}

	@Test
	void testAverage() {
		assertEquals(4, calculator.average(), "La media entre los números guardadoes en la calculadora [2,6] es 2.5");
	}

	@Test
	void testStdDev() {
		assertEquals(2.5, calculator.stddev(),
				"La desviacion estandar entre los números guardadoes en la calculadora [2,6] es 0.5");
	}

}
