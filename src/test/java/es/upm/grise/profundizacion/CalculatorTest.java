package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;


class CalculatorTest {
    private Calculator calculator;
    private final double RES_MIN     = 1;
    private final double RES_MAX     = 5;
    private final double RES_AVARAGE = 3;
    private final double RES_STDDEV  = 2.5;

    @BeforeEach
    public void beforeAll() {
        this.calculator = new Calculator();
        this.calculator.add(2);
        this.calculator.add(3);
        this.calculator.add(4);
        this.calculator.add(RES_MIN);
        this.calculator.add(RES_MAX);
    }

    @Test
    @DisplayName("Test Calulator add")
    public void test_add() {
        calculator.add(RES_STDDEV);
        assertEquals(RES_STDDEV,
                     this.calculator.numbers.lastElement(),
                     "add() a number and check if its the last element");
    }

    @Test
    @DisplayName("Test Calulator remove")
    public void test_remove() {
        calculator.remove(RES_MAX);
        assertEquals(RES_MIN,
                     this.calculator.numbers.lastElement(),
                     "remove() removed RES_MAX, and now last should be RES_MIN");
    }

    @Test()
    @DisplayName("Test Calulator max")
    public void test_calculator_max() {
        assertEquals(RES_MAX, this.calculator.max(), "max() equals RES_MAX");
    }

    @Test()
    @DisplayName("Test Calulator min")
    public void test_calculator_min() {
        assertEquals(RES_MIN, this.calculator.min(), "min() equals RES_MIN");
    }

    @Test()
    @DisplayName("Test Calulator avarage")
    public void test_calculator_avarage() {
        assertEquals(RES_AVARAGE, this.calculator.average(), "avarage() equals RES_AVARAGE");
    }

    @Test()
    @DisplayName("Test Calculator stddev")
    public void test_calculator_stddev() {
        assertEquals(RES_STDDEV, this.calculator.stddev(), "stddev() equals RES_STDDEV");
    }
}
