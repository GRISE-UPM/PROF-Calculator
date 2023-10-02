package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.abort;

import java.security.CodeSigner;
import java.util.Vector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator calculator;

	@BeforeAll
	static void prepareCalc() {
		calculator = new Calculator();
		calculator.add(2);
		calculator.add(3);
		calculator.add(4);
		calculator.add(5);
		calculator.add(6);
	}

	@Test
	void testAdd() {
		Calculator testAddCalc = new Calculator();
		int expectedSize = 2;
		Double testNumber1 = 5.0;
		Double testNumber2 = 7.0;
		testAddCalc.add(testNumber1);
		testAddCalc.add(testNumber2);
		assertEquals(expectedSize, testAddCalc.numbers.size(),
				"Tamaño de la calulcadora esperado tras añadir elementos al vector");
	}

	@Test
	void testRemove() {
		Calculator testRemoveCalc = new Calculator();
		int expectedSize = 2;
		Double testNumber1 = 5.0;
		Double testNumber2 = 7.0;
		testRemoveCalc.add(testNumber1);
		testRemoveCalc.add(testNumber2);
		System.out.println(calculator.numbers.size());
		assertEquals(expectedSize, testRemoveCalc.numbers.size(), "Tamaño esperado despues de añadir los elementos");
		expectedSize = 1;
		testRemoveCalc.remove(7.0);
		assertEquals(expectedSize, testRemoveCalc.numbers.size(),
				"Tamaño de la calculadores esperado tras eliminar un elemento del vector");

	}

	@Test
	void testMax() {
		Double expectedMax = 6.0;
		assertEquals(expectedMax, calculator.max(), "Maximo entre los números guardadoes en la calculadora [2,6] es 3");
	}

	@Test
	void testMin() {
		Double expectedMin = 2.0;
		assertEquals(expectedMin, calculator.min(),
				"Minimo entre entre los números guardadoes en la calculadora [2,6] es 2");
	}

	@Test
	void testAverage() {
		Double expectedAverage = 4.0;
		assertEquals(expectedAverage, calculator.average(),
				"La media entre los números guardadoes en la calculadora [2,6] es 2.5");
	}

	@Test
	void testStdDev() {
		Double expectedStdDev = 2.5;
		assertEquals(expectedStdDev, calculator.stddev(),
				"La desviacion estandar entre los números guardadoes en la calculadora [2,6] es 0.5");
	}

}
