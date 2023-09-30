package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator calculadora;

	@BeforeAll
	static void prepareCalculator(){
		calculadora = new Calculator();
	}

	@BeforeEach
	void prepareData(){
		calculadora.add(2);
		calculadora.add(3);
	}

	@AfterEach
	void removeData(){
		calculadora.remove(2);
		calculadora.remove(3);
	}

	@Test
	void testMax(){
		assertEquals(3, calculadora.max(), "El maximo entre 2 y 3 es 3");
	}

	@Test
	void testMin(){
		assertEquals(2, calculadora.min(), "El minimo entre 2 y 3 es 3");
	}

	@Test
	void testAvg(){
		assertEquals(2.5, calculadora.average(), "La media entre 2 y 3 es 2.5");
	}

	@Test
	void testStdDev(){
		assertEquals(0.5, calculadora.stddev(), "La desviacion tipica entre 2 y 3 es 0.5");
	}
}
