package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static final Double[] INITIAL_NUMBERS = {1.0, 2.0, 3.0, 4.0};
	private static final double MAX_EXPECTED = 4.0;
	private static final double MIN_EXPECTED = 1.0;
	private static final double AVERAGE_EXPECTED = 2.5;
	private static final double STDDEV_EXPECTED = 1.6666666666666667;
	private static final double DELTA = 0.001;

	private Calculator calculadora;

	@BeforeEach
	void inicializar() {
		calculadora = new Calculator();
		calculadora.numbers = new Vector<Double>();
		for (double num : INITIAL_NUMBERS) {
			calculadora.add(num);
		}
	}

	@Nested
	class NumberTests {

		@Test
		void Add() {
			assertArrayEquals(INITIAL_NUMBERS, calculadora.numbers.toArray(), "Error en el test Add");
		}

		@Test
		void Remove() {
			calculadora.remove(4);
			assertArrayEquals(new Double[]{1.0, 2.0, 3.0}, calculadora.numbers.toArray(), "Error en el test Remove");
		}
	}

	@Nested
	class CalculationTests {

		@Test
		void Max() {
			assertEquals(MAX_EXPECTED, calculadora.max(), DELTA, "Error en el test Max ");
		}

		@Test
		void Min() {
			assertEquals(MIN_EXPECTED, calculadora.min(), DELTA, "Error en el test Min ");
		}

		@Test
		void Average() {
			assertEquals(AVERAGE_EXPECTED, calculadora.average(), DELTA, "Error en el test Average ");
		}

		@Test
		void Stddev() {
			assertEquals(STDDEV_EXPECTED, calculadora.stddev(), DELTA, "Error en el test Stddev ");
		}
	}
}
