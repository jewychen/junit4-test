package org.monkey;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by monkey on 2017/3/23.
 */
public class CalculatorTest {

    public static Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
        calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());

    }

    @Test
    public void substract() throws Exception {
        calculator.add(5);
        calculator.substract(2);
        assertEquals(3, calculator.getResult());
    }

    @Ignore("multiply() 方法尚未填充")
    public void multiply() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void divide() throws Exception {
        calculator.divide(0);
    }

}