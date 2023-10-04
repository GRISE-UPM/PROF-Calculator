package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static Calculator c;
	private static final double[] numbers = new double[]{1,2,4,6,3,2};

	@BeforeEach
	void initCalc(){
		c = new Calculator();
		for(double num : numbers) {
			c.add(num);
		}
	}

	@Test
	@DisplayName(value = "Remove call with no numbers on the calc. Do not throw")
	void whenCallingRemoveWithEmptyListDoNotTrow() {
		double number = 34;
		assertDoesNotThrow(() -> c.remove(number), () -> "Remove should not throw when calling with empty calc");
	}

	@Test
	@DisplayName(value = "Average call with some numbers on the calc. Should return the expected value")
	void whenCallingAvgReturnExpectedValue() {
		double expectedAvg = 3;
		double actualAvg = c.average(); 
		assertEquals(expectedAvg, actualAvg, () -> String.format("c.average() is not %f, but received %f", expectedAvg, actualAvg));
	}
	
	@Test
	@DisplayName(value = "Max call with some numbers on the calc. Should return the expected value")
	void whenCallingMaxReturnExpectedValue() {
		double expectedMax = 6;
		double actualMax = c.max();
		assertEquals(expectedMax, actualMax, () -> String.format("c.max() is not %f, but received %f", expectedMax, actualMax));
	}
	
	@Test
	@DisplayName(value = "Min call with some numbers on the calc. Should return the expected value")
	void whenCallingMinReturnExpectedValue() {
		double expectedMin = 1;
		double actualMin = c.min();
		assertEquals(expectedMin, actualMin, String.format("c.min() is not %f, but received %f", expectedMin, actualMin));
	}

	@Test
	@DisplayName(value = "Std call with some numbers on the calc. Should return the expected value")
	void whenCallingStdReturnExpectedValue() {
		double expectedStd = Math.sqrt(3.2);
		double actualStd = c.stddev();
		assertEquals(expectedStd, actualStd, String.format("c.stddev() is not %f, but received %f", expectedStd, actualStd));
	}	

} 
