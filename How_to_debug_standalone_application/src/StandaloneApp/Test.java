package StandaloneApp;

public class Test {

	public static void main(String[] args) {
		//creating object
		CalculatorApp app=new CalculatorApp();
		System.out.println("AddResult:"+app.addition(3, 6));
		System.out.println("SubResult:"+app.subtraction(9, 3));
		System.out.println("MultiResult:"+app.multiplication(5, 6));
		System.out.println("diviResult:"+app.divide(5, 2));

	}

}
