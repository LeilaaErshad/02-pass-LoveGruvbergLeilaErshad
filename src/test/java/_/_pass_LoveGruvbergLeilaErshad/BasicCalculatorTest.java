package _._pass_LoveGruvbergLeilaErshad;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;


public class BasicCalculatorTest {
    BasicCalculator bcal = new BasicCalculator();
    Random rd = new Random();

    // test addition methods

    @Test
    public void testAddZero() {
        double x = rd.nextDouble();

        assertEquals(bcal.addition(x, 0), x, 0);
    }
    @Test
    public void testAddPositiveNbrs() {
        double x = rd.nextDouble();
            double y = rd.nextDouble();
            double result = x + y;
            
            assertEquals(bcal.addition(x, y), result ,0);
        assertEquals(bcal.addition(x, 0), x, 0);
    }
    @Test
    public void testAddNegativeNbrs() {
        double x = rd.nextDouble()* (-1);
        double y = rd.nextDouble()* (-1);
        double result = x + y;

        assertEquals(bcal.addition(x, y), result ,0);
    }
    @Test
    public void testAddNegativePositiveNbrs() {
        double x = rd.nextDouble()* (-1);
        double y = rd.nextDouble();
        double result = x + y;

        assertEquals(bcal.addition(x, y), result ,0);
    }
    // test subtraction methods 
   
    @Test
    public void testSubZero() {
        double x = rd.nextDouble();

        assertEquals(bcal.subtraction(x, 0), x, 0);
    }
    @Test
    public void testSubPositiveNbrs() {
        double x = rd.nextDouble();
            double y = rd.nextDouble();
            double result = x + y;

            assertEquals(bcal.addition(x, y), result ,0);
        assertEquals(bcal.addition(0, 0), 0, 0);
    }
    @Test
    public void testSubNegativeNbrs() {
        double x = rd.nextDouble()* (-1);
        double y = rd.nextDouble()* (-1);
        double result = x + y;

        assertEquals(bcal.addition(x, y), result ,0);
    }  
    @Test
    public void testSubNegativePositiveNbrs() {
        double x = rd.nextDouble();
        double y = rd.nextDouble()* (-1);
        double result = x + y;

        assertEquals(bcal.addition(x, y), result ,0);
   }
 // test multiplication methods

    @Test
    public void testMultiZero() {
        double x = rd.nextDouble();

        assertEquals(bcal.multiplication(x, 0), 0, 0);
    }

    @Test
    public void testMultiPositiveNbrs() {
        double x = rd.nextDouble();
        double y = rd.nextDouble();
        double result = x * y;

        assertEquals(bcal.multiplication(x, y), result ,0);
    }

    @Test
    public void testMultiNegativeNbrs() {
        double x = rd.nextDouble()* (-1);
        double y = rd.nextDouble()* (-1);
        double result = x * y;

        assertEquals(bcal.multiplication(x, y), result, 0);
    }

    @Test
    public void testMultiNegPosN() {
        double x = rd.nextDouble();
        double y = rd.nextDouble()* (-1);
        double result = x * y;

        assertEquals(bcal.multiplication(x, y), result ,0);
    }

    // test division methods

    @Test
    public void testDivZero() {
        double x = rd.nextDouble();

        assertEquals(bcal.division(x, x), 1, x);
    }

    @Test
    public void testDivPositiveNbrs() {
        double x = rd.nextDouble();
        double y = rd.nextDouble();
        double result = x / y;

        assertEquals(bcal.division(x, y), result, 0);
    }
    @Test
    public void testDivNegativNbrs() {
        double x = rd.nextDouble()* (-1);
        double y = rd.nextDouble()* (-1);
        double result = x / y;

        assertEquals(bcal.division(x, y), result, 0);
    }

    @Test
    public void testDivNegPosN() {
        double x = rd.nextDouble();
        double y = rd.nextDouble()* (-1);
        double result = x / y;

        assertEquals(bcal.division(x, y), result, 0);
    }
}

 




