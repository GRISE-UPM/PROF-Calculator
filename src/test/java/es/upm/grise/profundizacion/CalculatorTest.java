package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Vector;

class CalculatorTest {
	
	private Calculator calculator;	
	final double primerNum= 1.0;	
	final double segundoNum= 2.0;	
	
		@BeforeEach
	public void setUp() {
		//Creo una nueva instancia antes de cada prueba para garantizar que no afecten a las demas
    	//Si los metodos a los que queremos acceder fueran estaticos no haria falta.	
        calculator = new Calculator();
        calculator.numbers = new Vector<Double>(); 
        calculator.add(primerNum);
        calculator.add(segundoNum);        
             
//meter aqui los numeros directamente desde calculadora.add no tocar los elementos internos. 
    }
	
	@DisplayName("Probando metodo add")
	@Test()
	public void testAdd() {		
		calculator.add(primerNum); 		
		double resultado= 3.0;
        assertEquals(resultado, calculator.numbers.size(),"La lista debe contener el valor añadido");
	}

	@DisplayName("Probando metodo remove")
	@Test
	public void testRemove() {		
	    calculator.remove(primerNum);
	    final double resultado= 1.0;
	    assertEquals(resultado, calculator.numbers.size(), "El tamaño de la lista debe ser 1 después de la eliminación");
	    assertFalse(calculator.numbers.contains(primerNum), "El primer número no debe estar en la lista");
	    assertTrue(calculator.numbers.contains(segundoNum), "El segundo número si debe estar en la lista");
	}	

	@DisplayName("Probando metodo max")
	@Test
	public void testMax() {	
		final double resultado= 2.0;
        assertEquals(resultado, calculator.max(),"Probando metodo max");
    }
	
	@DisplayName("Probando metodo min")
	@Test
	public void testMin() {	
		final double resultado= 1.0;
        assertEquals(resultado, calculator.min(),"Probando metodo min");
    }

	@DisplayName("Probando metodo average")
	@Test
    public void testAverage() {	
		final double resultado= 1.5;
        assertEquals(resultado, calculator.average(),"Probando metodo average");
    }	
	
	//@Disabled
	@DisplayName("Probando metodo stdDev")
    @Test
    public void testStdDev() {	
		final double resultado= 0.5;
        assertEquals(resultado, calculator.stddev(),"Probando metodo stdDev");
    }	
}
