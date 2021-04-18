package _._pass_LoveGruvbergLeilaErshad;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {
	

	public double squareroot(double number) {
		return Math.sqrt(number);
	}

	
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}


	public double absoluteValue(double number) {
		return Math.abs(number);
	}


	public double square(double number) {
		return Math.pow(number, 2);
	}


	public double cube(double number) {
		return Math.pow(number, 3);
	}

}