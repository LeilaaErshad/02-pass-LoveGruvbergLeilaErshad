package _._pass_LoveGruvbergLeilaErshad;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator acal = new AdvancedCalculator();
	Random rd = new Random();
	
	//test square methods
	
	@Test
	public void testSquareZero() {
		double x = 0;
		
		assertEquals(acal.square(x), 0 , 0);
	}
	
	@Test
	public void testSquarePositiveNum() {
		double x = rd.nextDouble();
		double result = x * x;
		
		assertEquals(acal.square(x), result , 0);
	}
	
	@Test
	public void testSquareNegativeNum() {
		double x = rd.nextDouble() * (-1);
		double result = x * x;
		
		assertEquals(acal.square(x), result , 0);
	}
	
	// test absolutValue methods
	
	@Test
	public void testAbsValueZero() {
		double x = 0;
		
		assertEquals(acal.absoluteValue(x), 0 , 0);
	}
	
	@Test
	public void testAbsValuePositiveNum() {
		double x = rd.nextDouble();
		
		assertEquals(acal.absoluteValue(x), x , 0);
	}
	
	@Test
	public void testAbsValueNegativeNum() {
		double x = rd.nextDouble() * (-1);
		
		assertEquals(acal.absoluteValue(x), -x , 0);
	}
	
	// test raisedToThePowerOf methods
	
	@Test
	public void testRaisedPowerZero() {
		double x = rd.nextDouble();
		double exp = 0;
		assertEquals(acal.raisedToThePowerOf(x, exp) , 1,  0);
	}

	@Test
	public void testRaisedPowerPositiveNum() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = Math.pow(x, y);
		
		assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
	}

	@Test
	
	public void testRaisedPowerNegativeNum() {
        double x = rd.nextDouble();
        double y = rd.nextDouble() * (-1);
        double result = Math.pow(x, y);

        assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
    
	}
	
	// test squareRoot methods
	
	@Test
	public void testSqrtZero() {
		double x = 0;
		
		assertEquals(acal.squareroot(x), 0, 0);
	}
	
	@Test
	public void testSqrtPositiveNum() {
		double x = rd.nextDouble();
		
		assertEquals(acal.squareroot(x), Math.sqrt(x), 0);
	}
	
	@Test
	
	public void testSqrtNegativeNum() {
		
		double x = rd.nextDouble();
		assertEquals(acal.squareroot(x), Math.sqrt(x), 0);
	} 

	
	// test Cube methods
	
	@Test
	public void testCubeZero(){
		double x = 0;
		
		assertEquals(acal.cube(x), 0 , 0);
	}
	
	@Test
	public void testCubePositiveNum(){
		double x = rd.nextDouble();
		//double result = Math.signum(x);
		//System.out.println(result);
		
		assertEquals(acal.cube(x), x, x);
	}
	
	@Test
	public void testCubeNegativeNum(){
		double x = rd.nextDouble() * (-1);
		//double result = Math.signum(x);
		//System.out.println(result);
		
		assertEquals(acal.cube(x), x, -x);
	}
	
	
	
	
	
	

}
