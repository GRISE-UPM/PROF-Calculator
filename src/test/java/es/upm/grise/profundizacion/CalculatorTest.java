package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;


import org.junit.jupiter.api.Test;

class CalculatorTest {



	@Test
	void add_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);
		
		int sizeAfterAdd = 2;
		int actualSize = calc.getNumbers().size();

		assertEquals(sizeAfterAdd, actualSize);
	}

	@Test
	void add_test_2(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		Vector <Double> expectedVector = new Vector<Double>();
		expectedVector.add(1.1);
		expectedVector.add(2.2);

		Vector <Double> actualCalcVector = new Vector<Double>();

		assertEquals(expectedVector, actualCalcVector);
	}

	@Test
	void add_test_3(){
		Calculator calc =  new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		double expectedFirst = 2.2;
		double actualFirst = calc.getNumbers().get(0);

		assertEquals(expectedFirst, actualFirst);
	}

	@Test
	void remove_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		calc.remove(2.2);
		
		int sizeAfterRemove = 1;

		assertEquals(sizeAfterRemove, calc.getNumbers().size());
	}

	@Test
	void remove_test_2(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		calc.remove(1.1);

		Vector <Double> vector = new Vector<Double>();
		vector.add(2.2);

		assertEquals(vector, calc.getNumbers());
	}

	@Test
	void remove_test_3(){
		Calculator calc =  new Calculator();
		calc.add(1.1);
		calc.add(2.2);
		
		calc.remove(1.1);

		double expectedFirst = 2.2;

		assertEquals(expectedFirst, calc.getNumbers().get(0));
	}

	@Test
	void max_test(){
		Calculator calc = new Calculator();
		calc.add(0.1);
		calc.add(0.8);
		calc.add(0.9);
		calc.add(0.2);

		double maxNumber = 0.9;

		assertEquals(maxNumber, calc.max());
	}

	@Test
	void min_test(){
		Calculator calc = new Calculator();
		calc.add(0.1);
		calc.add(0.8);
		calc.add(0.9);
		calc.add(0.2);

		double minNumber = 0.1;

		assertEquals(minNumber, calc.min());
	}

	@Test
	void average_test(){
		Calculator calc = new Calculator();
		calc.add(0.1);
		calc.add(0.8);
		calc.add(0.9);
		calc.add(0.2);

		double averageExpected = 0.5;

		assertEquals(averageExpected, calc.average());
	}

	@Test
	void stddev_test(){
		Calculator calc = new Calculator();
		calc.add(0.1);
		calc.add(0.1);
		calc.add(0.1);
		calc.add(0.1);

		double stddevExpected = 0;

		assertEquals(stddevExpected, calc.stddev());
	}

	@Test
	void stddev_test_2(){
		Calculator calc = new Calculator();
		calc.add(1);
		calc.add(2);
		calc.add(2);
		calc.add(2);

		double stddevExpected = 0.25;

		assertEquals(stddevExpected, calc.stddev());
	}
	

}
