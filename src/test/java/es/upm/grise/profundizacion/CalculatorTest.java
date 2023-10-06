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
	  void Remove0() {
	  	calculadora.add(1);
	  	calculadora.add(2);
	  	calculadora.add(3);
	  	calculadora.remove(4);
	  	assertArrayEquals(new Double[] {1.0, 2.0, 3.0}, calculadora.numbers.toArray());
	  }
	@Test
	void Remove1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		calculadora.remove(4);
		assertArrayEquals(new Double[] {1.0, 2.0, 3.0}, calculadora.numbers.toArray());
	}
	@Test
	void Remove2() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.remove(1);
		calculadora.remove(2);
		assertArrayEquals(new Double[] {}, calculadora.numbers.toArray());
	}

	@Test
	void Remove3() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(1);
		calculadora.remove(1);
		assertArrayEquals(new Double[] {1.0, 2.0}, calculadora.numbers.toArray());
	}
	@Test
	void Add1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {1.0,2.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void Add2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {0.0,2.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void Add3() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(3);
		calculadora.add(4);
		assertArrayEquals(new Double[] {1.0,1.0,3.0,4.0},calculadora.numbers.toArray());
	}
	@Test
	void Max1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.max()==4;
	}
	@Test
	void Max2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.max()==4;
	}
	@Test
	void Max3() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(3);
		assert calculadora.max()==3;
	}
	@Test
	void Min1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==1;
	}
	@Test
	void Min2() {
		calculadora.add(0);
		calculadora.add(2);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==0;
	}
	@Test
	void Min3() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(3);
		calculadora.add(4);
		assert calculadora.min()==1;
	}

	@Test
	void Average1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(4);
		calculadora.add(5);
		assert calculadora.average()==3;
	}
	@Test
	void Average2() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		assert calculadora.average()==0;
	}
	@Test
	void Average3() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(5);
		assert calculadora.average()==1.25;
	}

	@Test
	void Stddev1() {
		calculadora.add(1);
		calculadora.add(2);
		calculadora.add(4);
		calculadora.add(5);
		assert calculadora.stddev()==3.3333333333333335;
	}
	@Test
	void Stddev2() {
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(1);
		calculadora.add(1);
		assert calculadora.stddev()==0;
	}
	@Test
	void Stddev3() {
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		calculadora.add(0);
		assert calculadora.stddev()==0;
	}
}
