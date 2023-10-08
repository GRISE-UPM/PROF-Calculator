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
			int correcto = 2;
			assertEquals(correcto, calculator.numbers.size());
		}

		@Test
		void test_max() {
			double correcto = 2.0;
			assertEquals(correcto, calculator.max());
		}


		@Test
		void test_min() {
			double correcto = 1.0;
			assertEquals(correcto, calculator.min());
		}

		
		@Test
		void test_avg() {
			double correcto = 1.5;
			assertEquals(correcto, calculator.average());
		}
		
		@Test
		void test_stddev() {
			double tercero = 3.0;
			double cuarto = 4.0; 
			
			double correct = 1.67;	
		
			calculator.add(tercero);
			calculator.add(cuarto);
			
			assertEquals(correct, Double.parseDouble(String.format("%.2f", (double)calculator.stddev())));
			
		}
		
		@Test
		void test_remove() {
			calculator.remove(1.0);
			
			int correcto = 1;
			
			assertEquals(correcto, calculator.numbers.size());
		}
		
		
}
