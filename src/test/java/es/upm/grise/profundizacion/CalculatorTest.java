package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {


	@Test
	void add_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		int sizeAfterAdd = 2;
		int actualSize = calc.getNumbers().size();

		assertEquals(sizeAfterAdd, actualSize, "El tamaño del vector tras añadir valores es incorrecto");

		Vector <Double> expectedVector = new Vector<Double>();
		expectedVector.add(1.1);
		expectedVector.add(2.2);

		Vector <Double> actualCalcVector = calc.getNumbers();

		assertEquals(expectedVector, actualCalcVector, "El vector de la calculadora tras añadir valores es incorrecto");

		double expectedFirst = 1.1;
		double actualFirst = calc.getNumbers().get(0);

		assertEquals(expectedFirst, actualFirst, "El primer valor del vector de la calculadora tras añadir varios valores es incorrecto");
	}


	@Test
	void remove_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		calc.remove(2.2);
		int sizeAfterRemove = 1;
		int actualSize = calc.getNumbers().size();
		assertEquals(sizeAfterRemove, actualSize);


		double expectedFirst = 1.1;
		double actualFirst = calc.getNumbers().get(0);

		assertEquals(expectedFirst, actualFirst);

		calc.remove(1.1);
		Vector <Double> expectedVector = new Vector<Double>();
		Vector <Double> actualCalcVector = calc.getNumbers();
		assertEquals(expectedVector, actualCalcVector);
	}


	@Test
	void max_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		double expectedMaxNumber = 2.2;
		double actualMaxNumber = calc.max();

		assertEquals(expectedMaxNumber, actualMaxNumber);
	}

	@Test
	void min_test(){
		Calculator calc = new Calculator();
		calc.add(1.1);
		calc.add(2.2);

		double expectedMinNumber = 1.1;
		assertEquals(expectedMinNumber, calc.min());
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


}
