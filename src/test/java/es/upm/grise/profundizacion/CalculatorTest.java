package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	class CalculatorTest {
		
		Calculator calculator;
		
		@BeforeEach
		void init() {
			Vector<Double> vector = new Vector<Double>();
			calculator = new Calculator();
			calculator.numbers=vector;
			
			double primero = 1.0;
			double segundo = 2.0;
			calculator.add(primero);
			calculator.add(segundo);
		}
		
		@Test
		void test_add(){
			assertEquals(2, calculator.numbers.size());
		}

		@Test
		void test_max() {
			assertEquals(2.0, calculator.max());
		}


		@Test
		void test_min() {
			assertEquals(1.0, calculator.min());
		}

		
		@Test
		void test_avg() {
			assertEquals(1.5, calculator.average());
		}
		
		@Test
		void test_stddev() {
			double tercero = 3.0;
			double cuarto = 4.0; 
			
			calculator.add(tercero);
			calculator.add(cuarto);
			
			assertEquals(1.66666, calculator.stddev());
			
		}
		
		@Test
		void test_remove() {
			calculator.remove(1.0);
			
			assertEquals(1, calculator.numbers.size());
		}
		
		
}
