package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculadora;
	@BeforeEach
	void inicializar() {
		calculadora= new Calculator();
		calculadora.numbers= new Vector<Double>();
	}
	  @Test
	  void testRemove0() {
	  	calculadora.add(1);
	  	calculadora.add(2);
	  	calculadora.add(3);
	  	calculadora.remove(4);
	  	assertArrayEquals(new Double[] {1.0, 2.0, 3.0}, calculadora.numbers.toArray());
	  }
	@Test
	void testRemove1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		calculadora.remove(4);
		assertArrayEquals(new Double[] {1.0, 2.0, 3.0}, calculadora.numbers.toArray());
	}
	@Test
	void testRemove2() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.remove(1);
		calculadora.remove(2);
		assertArrayEquals(new Double[] {}, calculadora.numbers.toArray());
	}

	@Test
	void testRemove3() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(1);
		calculadora.remove(1);
		assertArrayEquals(new Double[] {1.0, 2.0}, calculadora.numbers.toArray());
	}
	@Test
	void testAdd1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {1.0,2.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void testAdd2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {0.0,2.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void testAdd3() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {1.0,1.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void testMax1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.max()==4;
	}
	@Test
	void testMax2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.max()==4;
	}
	@Test
	void testMax3() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(3);
		assert calculadora.max()==3;
	}
	@Test
	void testMin1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==1;
	}
	@Test
	void testMin2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==0;
	}
	@Test
	void testMin3() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==1;
	}

	@Test
	void testAverage1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(4);
		calculadora.add(5);
		assert calculadora.average()==3;
	}
	@Test
	void testAverage2() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		assert calculadora.average()==0;
	}
	@Test
	void testAverage3() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(5);
		assert calculadora.average()==1.25;
	}

	@Test
	void testStddev1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(4);
		calculadora.add(5);
		assert calculadora.stddev()==3.3333333333333335;
	}
	@Test
	void testStddev2() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(1);
		assert calculadora.stddev()==0;
	}
	@Test
	void testStddev3() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		assert calculadora.stddev()==0;
	}
}
