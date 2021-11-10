package lamda_14.lamda.lab02;

public class ArithmeticOperationeComp implements ArithmeticOperation{
	
	@Override
	public void ArithmeticOper(double a, double b) {
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
	}

}
