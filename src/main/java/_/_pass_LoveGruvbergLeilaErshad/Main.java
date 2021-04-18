package _._pass_LoveGruvbergLeilaErshad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicCalculator basCalc = new BasicCalculator();
		AdvancedCalculator advCalc = new AdvancedCalculator();
		
		System.out.println(basCalc.addition(2.0, 5.0));
		System.out.println(basCalc.division(6.0 , 7.0));
		System.out.println(basCalc.multiplication(6.0 , 9.0));
		
		
		System.out.println(advCalc.raisedToThePowerOf(3.0, 5.0));
		System.out.println(advCalc.cube(6));
		System.out.println(advCalc.square(5));
		
	}

}
	