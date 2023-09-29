package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Nested
	class tests {
		Calculator calculadora;
		@BeforeEach
		void init() {
			calculadora = new Calculator();
			calculadora.add(1);
			calculadora.add(2);
			calculadora.add(3);
			calculadora.add(4);
		}
		@Test
		@DisplayName("Añade un elemento a la calculadora")
		void AddCalculatortest() {
			Vector<Double> numbers = calculadora.numbers;
			double prueba=4;
			assertEquals(prueba, numbers.size());
			assertTrue(numbers.contains((double)1));
			assertTrue(numbers.contains((double)2));
			assertTrue(numbers.contains((double)3));
			assertTrue(numbers.contains((double)4));
			prueba=5;
			calculadora.add(prueba);
			assertTrue(numbers.contains((double)5));
		}
	
		@Test
		@DisplayName("Elimina un elemento a la calculadora")
		void RemoveCalculatortest () {
			Vector<Double> numbers = calculadora.numbers;
			calculadora.remove(4);
			assertFalse(numbers.contains((double)4));
		}
	
		@Test
		@DisplayName("Cálcula cual es el mayor de los elementos añadidos a la calculadora")
		void MaxCalculatortest() {
			double prueba=4;
			assertEquals(prueba, calculadora.max());
		}
	
		@Test
		@DisplayName("Cálcula cual es el menor de los elementos añadidos a la calculadora")
		void MinCalculatortest() {
			double prueba=1;
			assertEquals(prueba, calculadora.min());
		}
	
		@Test
		@DisplayName("Calcula la media de los números introducidos en la calculadora")
		void AverageCalculatortest() {
			double expectedMaxValue=2.5;
			assertEquals(expectedMaxValue,calculadora.average());
		}
	
		@Test
		@DisplayName("Calcula la desviación estándar de los números introducidos en la calculadora")
		void StdevCalculatortest() {
			double prueba = (double)5/3;
			assertEquals(calculadora.stddev(),prueba);
		}
	}
}
