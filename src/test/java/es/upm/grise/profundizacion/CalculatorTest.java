package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Vector;
import java.util.Collection;
import java.lang.Double;

class CalculatorTest {
	
	static Calculator calculator;
	
	// Fixture
	@BeforeAll
	static void beforeAll() {
		
		calculator = new Calculator();
		calculator.add(1.0);
		calculator.add(20.0);
		calculator.add(3.0);

	}
	
	// Metodo add().
	@Test
	@DisplayName("- - - Metodo add() de Calculator - - -")
	void add_method() {
		
		calculator.add(20.0);
		calculator.add(3.0);
		
		int expected_size = 3;
		
		assertTrue(calculator.numbers.size() == expected_size);
		
		Collection<Double> testCollection = new Vector<Double>() ;
		
		testCollection.add(1.0);
		testCollection.add(20.0);
		testCollection.add(3.0);
		
		boolean contiene = true;
		assertTrue(calculator.numbers.containsAll(testCollection) == contiene);
	}
		
	@Test
	@DisplayName("- - - Metodo remove() de Calculator - - -")
	void remove_method() {
		
		calculator.remove(20.0);
		calculator.remove(3.0);
		
		int expected_size = 1;
		
		assertTrue(calculator.numbers.size() == expected_size);
		
	}
	
	@Test
	@DisplayName("- - - Metodo max() de Calculator - - -")
	void max_method() {
		
		double expected_max = 20.0;
		
		assertTrue(calculator.max() == expected_max);
		
	}
	
	@Test
	@DisplayName("- - - Metodo min() de Calculator - - -")
	void min_method() {
		
		double expected_min = 1.0;
		
		assertTrue(calculator.min() == expected_min);
		
	}
	
	@Test
	@DisplayName("- - - Metodo average() de Calculator - - -")
	void average_method() {
		
		double expected_avg = 8.0;
		
		assertEquals(expected_avg, calculator.average());
		
	}
	
	@Test
	@DisplayName("- - - Metodo std() de Calculator - - -")
	void std_method() {
		
		double expected_std = 109.0;
		
		assertEquals(expected_std, calculator.stddev());
		
	}

}
