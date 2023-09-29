package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Nested
	class SomeTests{
		Calculator c;
		static final double VALUE_CERO = 0;
		static final double VALUE_ONE = 1.0;
		static final double VALUE_TWO = 2.0;
		static final double VALUE_THREE = 3.0;

		@BeforeEach
		void setUp() {
			c = new Calculator();
			c.add(VALUE_ONE);
			c.add(VALUE_THREE);
			c.add(VALUE_TWO);
		}

		@Test
		void addTest() {
			double res=0.0;
			c.add(VALUE_CERO);
			assertEquals(VALUE_CERO,res );
		}

		@Test
		void removeTest() {
			c.remove(VALUE_ONE);
			double res=c.numbers.size();
			assertEquals(VALUE_TWO, res);
		}

		@Test
		void maxTest() {
			double res=c.max();
			assertEquals(VALUE_THREE,res);
		}

		@Test
		void minTest() {
			double res=c.min();
			assertEquals(VALUE_ONE, res);
		}

		@Test
		void avgTest() {
			double res=c.average();
			assertEquals(VALUE_TWO,res );
		}

		@Test
		void stddevTest() {
			double res=c.stddev();
			double sol=1;
			assertEquals(sol,res);
		}
	}
}
