package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;
import java.util.Random;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

class CalculatorTest {
	private static Calculator calc;
	private static Random rng;
	
	@BeforeAll
	public static void resetRNG() {
		rng = new Random();
	}
	
	@BeforeEach
	public void resetCalculator() {
		calc = new Calculator();
	}
	
	void addArray(double[] ns) {
		for(double n : ns)
			calc.add(n);
	}
	
	void addKnownArray() {
		double[] ns = {-2.0, -1.0, 0.0, 1.0, 2.0};
		addArray(ns);
	}
	
	@Test
	public void testAdd() {
		double magicNumber = rng.nextDouble();
		Vector<Double> correctVec = new Vector<Double>();
		correctVec.add(magicNumber);
		
		calc.add(magicNumber);
		Vector<Double> ns = calc.debugGetNumbers();
		
		assertTrue(correctVec.equals(ns), "Magic number was not added correctly to the numbers array");
	}
	
	@Test
	public void testRemove() {
		double missingN = rng.nextDouble();
		double[] initialVec = {rng.nextDouble(), rng.nextDouble(), rng.nextDouble(), missingN};
		double[] expectedVec = Arrays.copyOfRange(initialVec, 0, initialVec.length-1);
		Vector<Double> correctVec = new Vector<Double>(expectedVec.length);
		for(double n : expectedVec)
			correctVec.add(n);
		
		
		addArray(initialVec);
		calc.remove(missingN);
		Vector<Double> ns = calc.debugGetNumbers();
		
		assertTrue(correctVec.equals(ns), "The numbers array contents are not correct");
	}

	@Test
	public void testMax() {
		double correctVal = 2.0;
		addKnownArray();
		double n = calc.max();
		assertEquals(correctVal, n, "Max is not 2");
	}
	
	@Test
	public void testMin() {
		double correctVal = -2.0;
		addKnownArray();
		double n = calc.min();
		assertEquals(correctVal, n, "Min is not -2");
	}
	
	@Test
	public void testAvg() {
		double correctVal = 0.0;
		addKnownArray();
		double n = calc.average();
		assertEquals(correctVal, n, "Average is not 0");
	}
	
	@Test
	public void testStdDev() {
		double correctVal = 1.4142135623731;
		addKnownArray();
		double n = calc.stddev();
		assertEquals(correctVal, n, "Standard deviation is not 1.41...");
	}
}
