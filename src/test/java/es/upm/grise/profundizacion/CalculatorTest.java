package es.upm.grise.profundizacion;



import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculator  = new Calculator();
	@BeforeEach
	public void beforeEach() {
		calculator.numbers= new Vector<Double>();
	}
    @Test
    void add_return_2() {
		calculator.add((double)2);
        assertEquals((double)2, calculator.min());
    }
	@Test
	void remove_return_2(){
		calculator.add((double)2);
		calculator.add((double)3);
		calculator.add((double)1);
		calculator.remove((double)1);
		assertEquals((double)2, calculator.min());
	}
	@Test
	void min_return_1(){
		calculator.add((double)2);
		calculator.add((double)1);
		assertEquals((double)1, calculator.min());
	}
	@Test
	void max_return_3(){
		calculator.add((double)2);
		calculator.add((double)1);
		calculator.add((double)3);
		assertEquals((double)3, calculator.max());
	}
	@Test
	void average_return_2(){
		calculator.add((double)2);
		calculator.add((double)2);
		calculator.add((double)1);
		calculator.add((double)3);
		assertEquals((double)2, calculator.average());
	}
	@Test
	void stddev_return_1(){
		calculator.add((double)2);
		calculator.add((double)2);
		calculator.add((double)1);
		calculator.add((double)3);
		assertEquals((double)1, calculator.stddev());
	}
}
