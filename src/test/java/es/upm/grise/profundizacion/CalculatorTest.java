package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Executed before each test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Executed after each test");
	}

	@Test
	public void mayorNumeroEntre2y3() {
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.add(3);
		assertEquals(3, calculator.max());
	}

	@Test
	public void menorNumeroEntre2y3() {
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.add(3);
		assertEquals(2, calculator.min());
	}

	@Test
	public void mediaEntre2y3() {
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.add(3);
		assertEquals(2.5, calculator.average());
	}

	@Test
	public void desviacionTipicaEntre2y3() {
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.add(3);
		assertEquals(0.5, calculator.stddev());
	}
	
}
