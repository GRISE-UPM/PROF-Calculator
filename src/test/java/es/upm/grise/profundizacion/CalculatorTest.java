package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();

	@BeforeEach
	public void setUp(){
		calculator.setUp();
		calculator.add(13.43);
		calculator.add(5.0);
		calculator.add(124910.0);
		calculator.add(410.5);
		calculator.add(1.0);
	}

	@Test
	public void test_add(){
		int sizeExpected = 6;
		Vector<Double> vector = new Vector<>();

		vector.add(13.43);
		vector.add(5.0);
		vector.add(124910.0);
		vector.add(410.5);
		vector.add(1.0);

		calculator.add(102.0);

		vector.add(102.0);

		assertEquals(sizeExpected, calculator.numbers.size());
		assertEquals(vector, calculator.numbers);
	}

	@Test
	public void test_add_repeated_num(){
		int sizeExpected = 7;
		Vector<Double> vector = new Vector<>();
		vector.add(13.43);
		vector.add(5.0);
		vector.add(124910.0);
		vector.add(410.5);
		vector.add(1.0);

		calculator.add(100);
		calculator.add(100);

		vector.add(100.0);
		vector.add(100.0);

		assertEquals(sizeExpected, calculator.numbers.size());
		assertEquals(vector, calculator.numbers);
	}

	@Test
	public void test_remove(){
		Vector<Double> vector = new Vector<>();

		vector.add(0, 13.43);
		vector.add(1, 124910.0);
		vector.add(2, 410.5);

		calculator.remove(1.0);
		calculator.remove(5.0);

		int sizeExpected = 3;
		assertEquals(sizeExpected, calculator.numbers.size());
		assertEquals(vector, calculator.numbers);
	}

	@Test
	public void test_remove_not_found_number(){
		assertThrows(IndexOutOfBoundsException.class, () -> {
			calculator.remove(20);
		});
	}


	@Test
	public void test_add_and_remove(){
		calculator.remove(1.0);
		calculator.remove(5.0);

		calculator.add(25.0);
		calculator.add(80.0);

		calculator.remove(410.5);


		Vector<Double> vector = new Vector<>();

		vector.add(13.43);
		vector.add(124910.0);
		vector.add(25.0);
		vector.add(80.0);


		int sizeExpected = 4;
		assertEquals(sizeExpected, calculator.numbers.size());
		assertEquals(vector, calculator.numbers);
	}

	@Test
	public void test_remove_repeated_number(){
		calculator.add(25.0);
		calculator.add(25.0);

		calculator.remove(25.0);

		Vector<Double> vector = new Vector<>();
		vector.add(13.43);
		vector.add(5.0);
		vector.add(124910.0);
		vector.add(410.5);
		vector.add(1.0);
		vector.add(25.0);

		int sizeExpected = 6;
		assertEquals(sizeExpected, calculator.numbers.size());
		assertEquals(vector, calculator.numbers);
	}


	@Test
	public void test_max(){
		double max = 124910.0;
		
		assertEquals(max, calculator.max());
	}

	@Test
	public void test_min(){
		double min = 1;

		assertEquals(min, calculator.min());
	}

	@Test
	public void test_avg(){
		double avg = (13.43 + 5.0 + 124910.0 + 410.5 + 1.0) / 5;
		assertEquals(avg, calculator.average());
	}

	@Test
	void test_stddev(){
		Vector<Double> vector = new Vector<>();

		vector.add(0, 13.43);
		vector.add(1, 5.0);
		vector.add(2, 124910.0);
		vector.add(3, 410.5);
		vector.add(4, 1.0);

		double average = (13.43 + 5.0 + 124910.0 + 410.5 + 1.0)/5;
		double sum_respect_average = 0;
		
		for(double number : vector)
			sum_respect_average += (average - number) * (average - number);
		
		double stddev = sum_respect_average / (calculator.numbers.size() - 1 );
		assertEquals(stddev,calculator.stddev());
	}
}
