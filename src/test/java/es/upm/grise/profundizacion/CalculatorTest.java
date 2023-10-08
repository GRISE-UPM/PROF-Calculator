package es.upm.grise.profundizacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setup(){
		calculator = new Calculator();
	}

	@Test
	void testMax() {
		// Add entries to the calculator so we can test
		for(int i = 0; i < 100; i++){
			calculator.add(i);
		}

		double max = calculator.max();

		Assertions.assertEquals(99.0,max);
	}

	@Test
	void testMaxNoContent(){
		double max = calculator.max();

		Assertions.assertEquals(Double.MIN_VALUE,max);
	}

	@Test
	void testMin(){
		// Add entries to the calculator so we can test
		for(int i = 0; i < 100; i++){
			calculator.add(i);
		}

		double min = calculator.min();

		Assertions.assertEquals(0.0,min);
	}

	@Test
	void testMinNoContent(){
		double min = calculator.min();

		Assertions.assertEquals(Double.MAX_VALUE,min);
	}

	@Test
	void testAverage(){
		double acc = 0;
		for (int i = 0; i<5; i++){
			acc += i;
			calculator.add(i);
		}

		double expectingAverage = acc/5;
		double average = calculator.average();

		Assertions.assertEquals(expectingAverage, average);
	}

	@Test
	void testAverageNoContent(){
		double average = calculator.average();

		Assertions.assertEquals(Double.NaN, average);
	}

	@Test
	void testStdDev(){
		double acc = 0;
		for (int i = 0; i<5; i++){
			acc += i;
			calculator.add(i);
		}

		double average = acc/5;
		double sumRespectAverage = 0;

		for (int i = 0; i<5; i++){
			sumRespectAverage += Math.pow(average - i, 2);
		}

		double stdDevExpected = sumRespectAverage / 4;
		double stdDev = calculator.stddev();

		Assertions.assertEquals(stdDevExpected,stdDev);

	}

	@Test
	void testRemoveElements(){
		calculator.add(1);
		calculator.remove(1);

		double max = calculator.max();

		Assertions.assertEquals(Double.MIN_VALUE, max);
	}

}
