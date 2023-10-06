package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	private Random random;
	
	@BeforeEach
	void intialize(){

		calculator = new Calculator();
		calculator.numbers = new Vector<Double>();
		random = new Random();
		
		for(int i=0; i<15; i++) {
			calculator.numbers.add(random.nextDouble()*100);
		}
	}
	
	@Test
	public void testAddNumber() {
		int expectedSize = calculator.numbers.size() + 1;
		calculator.numbers.add(random.nextDouble());
		
		assertEquals(expectedSize, calculator.numbers.size());
	}
	
	@Test
	public void testRemoveNumber() {
		int expectedSize = calculator.numbers.size() - 1;
		int randomIndex = random.nextInt(calculator.numbers.size());
		calculator.numbers.remove(randomIndex);
		
		assertEquals(expectedSize, calculator.numbers.size());
	}
	
	@Test
	public void testMax() {
		List<Double> numbers = toList(calculator.numbers);
		Double expectedMax = Collections.max(numbers);
		
		assertEquals(expectedMax, calculator.max());
	}
	
	@Test
	public void testMin() {
		List<Double> numbers = toList(calculator.numbers);
		Double expectedMin = Collections.min(numbers);
		
		assertEquals(expectedMin, calculator.min());
	}
	
	@Test
	public void testAverage() {
		assertEquals(average(calculator.numbers), calculator.average());
	}
	
	@Test
	public void testStddev() {
		//List<Double> numbers = toList(calculator.numbers);
		
		Double average = average(calculator.numbers);
		Double sum = 0.0;
		for(Double n: calculator.numbers) {
			sum += Math.pow(n - average, 2);
		}
		
		Double expectedStd = Math.sqrt(sum / calculator.numbers.size());
		
		assertEquals(expectedStd, calculator.stddev());
	}
	
	public ArrayList<Double> toList(Vector<Double> numbers){
		return new ArrayList<Double>(numbers);
		
	}
	
	public Double average(Vector<Double> numbers) {	
		 List<Double> list = new ArrayList<>(numbers);
		 OptionalDouble average = list.stream()
	                .mapToDouble(Double::doubleValue)
	                .average();
		 
		 return average.getAsDouble();
	}
}
