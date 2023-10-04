package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Vector;

public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        calculator.numbers=new Vector <Double> ();
        double valor1=10.0;
        double valor2=20.0;
        double valor=20.0;
        calculator.add(valor1);
        calculator.add(valor2);
   
    }

    @Test
    public void testAdd() {
        int esperado=3;
        calculator.add(valor);
        assertEquals("Añade un valor", esperado, calculator.numbers.size());
    }

    @Test
    public void testRemove() {
        int esperado=1;
        calculator.remove(valor);
        assertEquals("Elimina un valor", esperado, calculator.numbers.size());
    }

    @Test
    public void testMax() {
        double esperado=20.0;
        assertEquals("max 20", esperado, calculator.max());
    }

    @Test
    public void testMin() {
        double esperado=10.0;
        assertEquals("min 10", esperado, calculator.min());
    }

    @Test
    public void testAverage() {
        double esperado=15.0;
        assertEquals("Media 15", esperado, calculator.average());
    }

    @Test
    public void testStddev() {
        double esperado=100.0;
        assertEquals("Std 100",esperado, calculator.stddev());
    }
}