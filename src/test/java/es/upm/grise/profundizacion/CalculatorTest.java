package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator testCalculator;

	@BeforeEach
	void makeCalcu(){
		testCalculator = new Calculator();
		testCalculator.numbers = new Vector<Double>();
		testCalculator.add(0);
		testCalculator.add(10);
		testCalculator.add(2);
		testCalculator.add(8);
		testCalculator.add(5);
	}

	@Test
	void maxTests() {
		double not_magic_number = 10;
		try{
			assertEquals(testCalculator.max(), not_magic_number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	void minTests() {
		double not_magic_number = 0;
		try{
			assertEquals(testCalculator.min(), not_magic_number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	void avgTests() {
		double not_magic_number = 5;
		try{
			assertEquals(testCalculator.average(), not_magic_number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	void stddevTests() {
		double not_magic_number = 17;
		try{
			assertEquals(testCalculator.stddev(), not_magic_number);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	void remTest() {
		testCalculator.remove(0);
		try{
			assertEquals(testCalculator.numbers.size(), 4);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
