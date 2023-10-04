package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {
	private static Calculator calc;
	
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
		double magicNumber = 5.5;
		Vector<Double> correctVec = new Vector<Double>(1);
		correctVec.add(magicNumber);
		
		calc.add(magicNumber);
		Vector<Double> ns = calc.debugGetNumbers();
		
		assertTrue(correctVec.equals(ns), "Magic number was not added correctly to the numbers array");
	}
	
	@Test
	public void testRemove() {
		double[] initialVec = {2.2, 3.3, 4.4, 3.3};
		double[] expectedVec = {2.2, 3.3, 4.4};
		double missingN = 3.3;
		Vector<Double> correctVec = new Vector<Double>(3);
		for(double n : expectedVec)
			correctVec.add(n);
		
		
		addArray(initialVec);
		calc.remove(missingN);
		Vector<Double> ns = calc.debugGetNumbers();
		
		assertTrue(correctVec.equals(ns), "The numbers array contents are not correct");
	}

	@Test
	public void testMax() {
		addKnownArray();
		double n = calc.max();
		assertEquals(2.0, n, "Max is not 2");
	}
	
	@Test
	public void testMin() {
		addKnownArray();
		double n = calc.min();
		assertEquals(-2.0, n, "Min is not -2");
	}
	
	@Test
	public void testAvg() {
		addKnownArray();
		double n = calc.average();
		assertEquals(0.0, n, "Average is not 0");
	}
	
	@Test
	public void testStdDev() {
		addKnownArray();
		double n = calc.stddev();
		assertEquals(1.4142135623731, n, "Standard deviation is not 1.41...");
	}

}
